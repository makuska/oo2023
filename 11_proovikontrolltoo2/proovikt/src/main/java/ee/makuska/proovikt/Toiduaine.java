package ee.makuska.proovikt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Toiduaine {
    @Id
    private Long id;

    private String nimetus;
    private int valk;
    private int rasv;
    private int sysivesik;

}
