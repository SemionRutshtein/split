package il.redstone.halek.dao;

import il.redstone.halek.models.Room;
import il.redstone.halek.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RoomDaoImpl implements RoomDao {

    private final RoomRepository roomRepository;

    @Override
    public List<Room> receiveAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> receiveAllUsersRoomByUserId(Long userId) {
        return roomRepository.findAllByUsersUserId(userId);
    }
}
