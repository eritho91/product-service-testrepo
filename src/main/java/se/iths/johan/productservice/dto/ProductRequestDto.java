package se.iths.johan.productservice.dto;

import java.math.BigDecimal;

public record ProductRequestDto(
        String name,
        String description,
        String category,
        String imageUrl,
        BigDecimal price,
        int stock
) {


}
