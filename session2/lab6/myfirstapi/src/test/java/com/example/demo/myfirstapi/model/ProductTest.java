package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp(){
        product = new Product(1L,"Banana", 150);
    }

    @Test
    void shouldSetID() {
        product.setId(1L);
        long actual = product.getId();
        assertEquals(1L, actual);
    }

    @Test
    void shouldSetName(){
        product.setName("Apple");
        String actual = product.getName();
        assertEquals("Apple", actual);
    }

    @Test
    void shouldSetPrice(){
        product.setPrice(1500);
        double actual = product.getPrice();
        assertEquals(1500, actual);
    }
    @Test
    void shouldGetID(){
        long actual = product.getId();
        assertEquals(1L, actual);
    }
    @Test
    void shouldGetName(){
        String actual = product.getName();
        assertEquals("Banana", actual);
    }

    @Test
    void shouldGetPrice(){
        double actual = product.getPrice();
        assertEquals(150, actual);
    }

    @Test
    void shouldReturnProductAsString(){
        String actual = product.toString();
        assertEquals("Product{id=1, name='Banana', price=150.0}", actual);
    }

    @Test
    void shouldBeEqual(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(2L, "Watermelon", 250);
        Boolean actual = a.equals(b);
        assertEquals(true, actual);
    }

    @Test
    void shouldNotBeEqual(){
        Product a = new Product(2L, "Watermelon", 250);
        Boolean actual = a.equals(product);
        assertEquals(false, actual);
    }

}