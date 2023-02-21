package il.redstone.halek.service;

import il.redstone.halek.models.Room;

import java.util.List;

public interface SplitService {
    List<Room> receiveAllRooms();
    List<Room> receiveAllUsersRoomByUserId(Long userId);
}
