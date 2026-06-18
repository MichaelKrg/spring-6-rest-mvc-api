package guru.springframework.spring6restmvcapi.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerOrderLineUpdateDTO {
    // for the update we can give the id (to update an existing line)
    // or leave it empty (add new line)
    private UUID id;

    @NotNull
    private UUID beerId;

    @Min(value = 1, message = "Quantity ordered must be greater than 0")
    private Integer orderQuantity;

    private Integer quantityAllocated;
}
