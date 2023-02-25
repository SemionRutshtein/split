package il.redstone.halek.service;

import il.redstone.halek.dao.SplitDao;
import il.redstone.halek.models.Room;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SplitServiceImpl implements SplitService {

    private final SplitDao splitDao;

    @Override
    public List<Room> receiveAllRooms() {
        return splitDao.receiveAllRooms();
    }

    @Override
    public List<Room> receiveAllUsersRoomByUserId(Long userId) {
        splitDao.receiveAllUsersRoomByUserId(userId);

        return null;
    }

}
