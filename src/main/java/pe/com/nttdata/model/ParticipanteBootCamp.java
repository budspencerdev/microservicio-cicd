package pe.com.nttdata.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "participante_bootcamp")
@IdClass(ParticipanteBootCampPK.class)
public class ParticipanteBootCamp {

    @Id
    private Participante participante;
    @Id
    private BootCamp bootCamp;

}
