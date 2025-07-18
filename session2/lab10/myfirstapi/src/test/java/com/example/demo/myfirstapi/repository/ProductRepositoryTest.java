package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository;

    @BeforeEach
    void setUp(){
        productRepository = new ProductRepository();
    }

    @Test
    void shouldReturnAllProductsInRepository() {
        List<Product> products = productRepository.findAll();
        assertEquals(3, products.size());
    }

    @Test
    void shouldFindAndReturnExistingID() {
        Optional<Product> product = productRepository.findById(1L);
        assertTrue(product.isPresent());
        assertEquals("Laptop", product.get().getName());
    }

    @Test
    void shouldReturnEmptyOptionForNonexistingID(){
        Optional<Product> product = productRepository.findById(999L);
        assertTrue(product.isEmpty());
    }

    @Test
    void shouldSaveProductNewID() {
        Product newProduct = new Product(null, "Monitor", 450.00);
        Product saveProduct = productRepository.save(newProduct);
        assertEquals("Monitor",saveProduct.getName());
        assertNotNull(saveProduct.getId());
        Optional<Product> product = productRepository.findById(saveProduct.getId());
        assertTrue(product.isPresent());
    }

    @Test
    void shouldUpdateProductExistingID(){
        Product newProduct = new Product(1L, "Monitor", 450.00);
        Product saveProduct = productRepository.save(newProduct);
        assertTrue(productRepository.findById(1L).isPresent());
        assertNotEquals("Laptop", productRepository.findById(1L).get().getName());
        assertEquals("Monitor", productRepository.findById(1L).get().getName());
        assertEquals(450.00, productRepository.findById(1L).get().getPrice());
    }

    @Test
    void shouldNotSaveIfIDGivenDoesNotExist(){
        Product newProduct = new Product(999L, "CPU", 350.00);
        Product saveProduct = productRepository.save(newProduct);
        assertEquals(999L, saveProduct.getId());
        assertFalse(productRepository.findById(999L).isPresent());
    }
}