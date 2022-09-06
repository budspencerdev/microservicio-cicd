package pe.com.nttdata.model;

import lombok.Data;

@Data
@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_factura", nullable = false, foreignKey = @ForeignKey(name = "fk_factura_detalle"))
    private Factura factura;

    @Column(name = "producto", nullable = false, length = 30)
    private String producto;

    @Column(name = "precio", nullable = false)
    private Double precio;
}
