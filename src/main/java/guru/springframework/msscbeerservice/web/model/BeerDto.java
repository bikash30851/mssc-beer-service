package guru.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    private Integer version;

    private OffsetDateTime createdDate; //similar to LocalDateTime but has offset information compared to UTC basically allows for inter timezone comparsion

    private OffsetDateTime lastModifiedDate;

    private String beerName;

    private BeerStyleEnum beerStyle;

    private long upc;

    private BigDecimal price;

    private Integer quantityOnHand;


}