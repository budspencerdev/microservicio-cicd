package pe.com.nttdata.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @OneToMany(mappedBy = "factura", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<DetalleFactura> detalleFacturas;

    @Column(name = "cliente", nullable = false, length = 30)
    private String cliente;
}
