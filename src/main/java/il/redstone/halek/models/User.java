package il.redstone.halek.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Document("User")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;
    private String name;
    private String description;
    private String email;
    private BigDecimal balance;
    private List<Expense> expenses;
    private List<Long> roomsId;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.balance = BigDecimal.ZERO;
        this.expenses = new ArrayList<>();
        this.roomsId = new ArrayList<>();
    }

}
