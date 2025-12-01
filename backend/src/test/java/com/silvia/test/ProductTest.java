package com.silvia.test;

import com.silvia.entity.Product;
import com.silvia.model.Category;
import com.silvia.service.ProductService;
import com.silvia.repository.ProductRepo;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Test;

public class ProductTest {
    
    @Mock
    private ProductRepo productRepo;

    @InjectMocks
    private ProductService productService;

    private AutoCloseable closeable;

    @BeforeEach
    public void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() throws Exception {
        closeable.close();
    }

    @Test
    public void getProductByIdTest()
    {  Product p  = new Product();
        p.setProductId(1L);
        p.setProductName("Test Product");
        p.setCategory(Category.BEVERAGE);
        p.setProductPrice(10.0);
        p.setDescription("This is a test product.");

        when(productRepo.findByProductId(1L)).thenReturn(Optional.of(p));

        Product result = productService.getProductById(1L);
        assertEquals("Test Product", result.getProductName());
        verify(productRepo).findByProductId(1L);
    }

    @Test
    public void getProductsByCategoryTest()
    {

    }

    @Test
    public void getProductsByNameTest()
    {

    }

    @Test
    public void getAllProductsTest()
    {

    }
    
    @Test
    public void createOrCheckProductTest()
    {

    }

    @Test
    public void updateProductTest()
    {

    }

    @Test
    public void deleteProductTest()
    {

    }

}