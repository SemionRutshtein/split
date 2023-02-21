package il.redstone.halek.service;

import il.redstone.halek.dao.RoomDao;
import il.redstone.halek.models.Room;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SplitServiceImpl implements SplitService {

    private final RoomDao roomDao;

    @Override
    public List<Room> receiveAllRooms() {
        return roomDao.receiveAllRooms();
    }

    @Override
    public List<Room> receiveAllUsersRoomByUserId(Long userId) {
        roomDao.receiveAllUsersRoomByUserId(userId);

        return null;
    }

}
