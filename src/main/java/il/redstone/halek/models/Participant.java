package il.redstone.halek.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participant {

    private Long userId;
    private Long dealRoomIndex;
    private Double amount;
}
