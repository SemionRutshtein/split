package il.redstone.halek.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    private String id;
    private String description;
    private Double amount;
    private LocalDate date;
    private List<Deal> deals;
    private List<Tag> tags;
}
