package guru.springframework.spring6restmvcapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BeerOrderDTO {

    // Relation methods
    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public void setBeerOrderShipment(BeerOrderShipmentDTO beerOrderShipment) {
        this.beerOrderShipment = beerOrderShipment;
    }

    // normal attributes
    private UUID id;
    private Long version;
    private Timestamp createdDate;
    private Timestamp lastModifiedDate;

    private String customerRef;
    private BigDecimal paymentAmount;

    // relation attributes
    private CustomerDTO customer;
    private Set<BeerOrderLineDTO> beerOrderLines;
    private BeerOrderShipmentDTO beerOrderShipment;
}
