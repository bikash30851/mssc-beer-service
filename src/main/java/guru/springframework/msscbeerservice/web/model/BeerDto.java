package guru.springframework.msscbeerservice.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
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

    @Null
    private UUID id;

    @Null // -> we do not want somebody else setting this up from the outside world i.e. a client. that's why setting it as null
    private Integer version;

    @Null
    private OffsetDateTime createdDate; //similar to LocalDateTime but has offset information compared to UTC basically allows for inter timezone comparsion

    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @Positive
    @NotNull
    private long upc;

    @Positive
    @NotNull
    private BigDecimal price;

    private Integer quantityOnHand;


}