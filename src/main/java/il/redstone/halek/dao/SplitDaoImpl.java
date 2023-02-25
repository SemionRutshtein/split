package il.redstone.halek.dao;

import com.mongodb.MongoException;
import il.redstone.halek.models.Room;
import il.redstone.halek.models.User;
import il.redstone.halek.repository.RoomRepository;
import il.redstone.halek.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class SplitDaoImpl implements SplitDao {

    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

    @Override
    public List<Room> receiveAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> receiveAllUsersRoomByUserId(Long userId) {
        return roomRepository.findAllByUsersUserId(userId);
    }

    @Override
    public void createUser(User user) {
        try{
            userRepository.save(user);
        } catch (Exception e) {
            log.info("Trouble with creation new User -> {}", user);
            throw new MongoException("Exception during creating new user ...");
        }
    }

    @Override
    public void createRoom(Room room) {
        try{
            roomRepository.save(room);
        } catch (Exception e) {
            log.info("Trouble with creation new Room -> {}", room);
            throw new MongoException("Exception during creating new room ...");
        }
    }

    @Override
    public void addRoomUser(Long groupId, User user) {

        Optional<Room> room = roomRepository.findById(groupId);
        if (room.isPresent()) {
            room.get().getUsers().add(user);
        } else {
            log.info("Trouble with adding user to Room -> {}", user);
            throw new MongoException("Exception during adding user to room ...");
        }

    }

    @Override
    public List<Room> receiveRoomsOfUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isEmpty()) {
            log.info("Trouble with receiving rooms of user with userId -> {}", userId);
            throw new MongoException("No rooms by current user");
        }
        return roomRepository.findAllByRoomId(user.get().getRoomsId());
    }

    @Override
    public void updateUser(User user) {
        Optional<User> byId = userRepository.findById(user.getUserId());
        if (byId.isPresent()) {
            userRepository.save(user);
        } else {
            log.info("Can't receive user for updating ... \n userId -> {}", user.getUserId());
            throw new MongoException("Can't receive user for updating ");
        }
    }
}
