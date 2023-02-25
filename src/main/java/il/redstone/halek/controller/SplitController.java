package il.redstone.halek.controller;

import il.redstone.halek.dao.SplitDao;
import il.redstone.halek.models.Room;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SplitController {

    private final SplitDao splitDao;

    @GetMapping("/check")
    public ResponseEntity<List<Room>> getData() {
        List<Room> data = splitDao.receiveAllRooms();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }


    @GetMapping("/byUserId")
    public ResponseEntity<List<Room>> getRoomsById(@PathParam("userId") Long userId) {
        List<Room> data = splitDao.receiveAllUsersRoomByUserId(userId);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
