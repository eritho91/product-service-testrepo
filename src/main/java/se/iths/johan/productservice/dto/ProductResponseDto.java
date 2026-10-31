package se.iths.johan.productservice.dto;

import java.math.BigDecimal;

public record ProductResponseDto(
        Long id,
        String name,
        String description,
        String category,
        String imageUrl,
        BigDecimal price,
        int stock
) {
}
