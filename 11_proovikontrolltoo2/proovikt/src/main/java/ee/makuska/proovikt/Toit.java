package ee.makuska.proovikt;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Toit {

    @Id
    private String nimetus;

    @ManyToMany
    private List<Toidukomponent> toidukomponendid;
}
