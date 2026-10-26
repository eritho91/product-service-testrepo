package se.iths.johan.productservice.mapper;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import se.iths.johan.productservice.dto.ProductRequestDto;
import se.iths.johan.productservice.dto.ProductResponseDto;
import se.iths.johan.productservice.model.Product;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-29T13:27:38+0200",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductRequestDto productRequestDto) {
        if ( productRequestDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setDescription( productRequestDto.description() );
        product.setName( productRequestDto.name() );
        if ( productRequestDto.price() != null ) {
            product.setPrice( productRequestDto.price().doubleValue() );
        }
        product.setStock( productRequestDto.stock() );

        return product;
    }

    @Override
    public ProductResponseDto toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;
        BigDecimal price = null;
        int stock = 0;

        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = BigDecimal.valueOf( product.getPrice() );
        stock = product.getStock();

        ProductResponseDto productResponseDto = new ProductResponseDto( id, name, description, price, stock );

        return productResponseDto;
    }
}
