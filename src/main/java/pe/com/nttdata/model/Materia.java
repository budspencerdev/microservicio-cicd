package pe.com.nttdata.model;

import lombok.Data;

@Data
@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMateria;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idBootCamp", nullable = false, foreignKey =@ForeignKey(name = "fk_materia_bootcamp"))
    private BootCamp bootCamp;

 }
