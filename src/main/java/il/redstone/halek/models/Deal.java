package il.redstone.halek.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deal {

    private Double issueAmount;
    private List<Participant> participants;
}
