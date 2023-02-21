package il.redstone.halek.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@ToString
@Document("Room")
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    private Long groupId;
    private List<User> users;
}
