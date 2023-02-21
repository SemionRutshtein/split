package il.redstone.halek.dao;

import il.redstone.halek.models.Room;

import java.util.List;

public interface RoomDao {
    List<Room> receiveAllRooms();

    List<Room> receiveAllUsersRoomByUserId(Long userId);

}
