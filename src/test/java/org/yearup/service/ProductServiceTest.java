package org.yearup.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.yearup.models.Product;
import org.yearup.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ProductServiceTest
{
    @Test
    public void search_withoutFilters_shouldReturnAllProducts()
    {
        // Arrange
        ProductRepository productRepository = Mockito.mock(ProductRepository.class);
        ProductService productService = new ProductService(productRepository);

        List<Product> products = new ArrayList<>();
        products.add(new Product());
        products.add(new Product());
        products.add(new Product());

        when(productRepository.findAll()).thenReturn(products);

        // Act
        List<Product> actualProducts =
                productService.search(null, null, null, null);

        // Assert
        assertEquals(3, actualProducts.size());
    }

    @Test
    public void update_shouldUpdateStock()
    {
        // Arrange
        ProductRepository productRepository = Mockito.mock(ProductRepository.class);
        ProductService productService = new ProductService(productRepository);

        Product existing = new Product();
        existing.setProductId(1);
        existing.setStock(25);

        Product updatedProduct = new Product();
        updatedProduct.setStock(50);

        when(productRepository.findById(1))
                .thenReturn(Optional.of(existing));

        when(productRepository.save(Mockito.any(Product.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        // Act
        Product result = productService.update(1, updatedProduct);

        // Assert
        assertEquals(50, result.getStock());
    }
}