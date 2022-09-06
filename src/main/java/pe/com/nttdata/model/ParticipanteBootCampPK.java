package pe.com.nttdata.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ParticipanteBootCampPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_participante", nullable = false)
    private Participante participante;
    @ManyToOne
    @JoinColumn(name = "id_bootcamp", nullable = false)
    private BootCamp bootCamp;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((participante == null) ? 0 : participante.hashCode());
        result = prime * result + ((bootCamp == null) ? 0 : bootCamp.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ParticipanteBootCampPK other = (ParticipanteBootCampPK) obj;
        if (participante == null) {
            if (other.participante != null)
                return false;
        } else if (!participante.equals(other.participante))
            return false;
        if (bootCamp == null) {
            if (other.bootCamp != null)
                return false;
        } else if (!bootCamp.equals(other.bootCamp))
            return false;
        return true;
    }


}
