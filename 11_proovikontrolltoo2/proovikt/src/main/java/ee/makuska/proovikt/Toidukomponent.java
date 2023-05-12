package ee.makuska.proovikt;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Toidukomponent {
    @Id
    private Long id;

    @ManyToOne
    private Toiduaine toiduaine;
    private int kogus;
}