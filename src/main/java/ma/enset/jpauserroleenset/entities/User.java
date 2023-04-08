package ma.enset.jpauserroleenset.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Table(name = "USER_TAB")
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id
    private String userId;
    @Column(name = "USER_NAME", unique = true, length = 20)
    private String userName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private List<Role> roles=new ArrayList<>();
}
