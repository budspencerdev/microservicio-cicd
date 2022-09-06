package pe.com.nttdata.model;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idParticipante;
    @Column(name = "nombres", nullable = false, length = 30)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 30)
    private String apellidos;
    @Column(name = "dni", nullable = false, length = 8)
    private String dni;
    @Column(name = "sexo", nullable = false, length = 1)
    private Character sexo;
    @Column(name = "cargo", nullable = false, length = 30)
    private String cargo;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idParticipante == null) ? 0 : idParticipante.hashCode());
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
        Participante other = (Participante) obj;
        if (idParticipante == null) {
            if (other.idParticipante != null)
                return false;
        } else if (!idParticipante.equals(other.idParticipante))
            return false;
        return true;
    }
}
