package il.redstone.halek.dao;

import il.redstone.halek.models.Room;
import il.redstone.halek.models.User;

import java.util.List;

public interface SplitDao {
    List<Room> receiveAllRooms();

    List<Room> receiveAllUsersRoomByUserId(Long userId);

    void createUser(User user);
    void createRoom(Room room);
    void addRoomUser(Long groupId, User user);
    List<Room> receiveRoomsOfUser(Long userId);
    void updateUser(User user);

}
