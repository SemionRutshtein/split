package il.redstone.halek.repository;

import il.redstone.halek.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends MongoRepository<Room, Long> {
    List<Room> findAllByUsersUserId(Long userId);

    List<Room> findAllByRoomId(List<Long> roomId);
}
