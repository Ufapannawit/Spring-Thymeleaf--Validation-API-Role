package th.ac.ku.restaurant.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
// ให้ Generate..
// - Getters และ Setters ทั้งหมด
}
