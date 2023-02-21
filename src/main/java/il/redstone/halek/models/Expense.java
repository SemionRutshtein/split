package il.redstone.halek.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    private String id;
    private String description;
    private BigDecimal amount;
    private Instant date;
    private User user;
    private List<Tag> tags;
}
