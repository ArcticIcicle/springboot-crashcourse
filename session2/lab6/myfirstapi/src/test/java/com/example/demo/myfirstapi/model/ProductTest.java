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

    // equals
    @Test
    void shouldBeEqual(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(2L, "Watermelon", 250);
        boolean actual = a.equals(b);
        assertTrue(actual);
    }

    @Test
    void shouldNotBeEqual(){
        Product a = new Product(2L, "Watermelon", 250);
        boolean actual = a.equals(product);
        assertFalse(actual);
    }

    @Test
    void shouldNotBeEqualNullObject(){
        assertFalse(product.equals(null));
    }

    @Test
    void shouldNotBeEqualDifferentProductID(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(3L, "Watermelon", 250);
        boolean actual = a.equals(b);
        assertFalse(actual);
    }

    @Test
    void shouldNotBeEqualDifferentProductName(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(2L, "Peach", 250);
        boolean actual = a.equals(b);
        assertFalse(actual);
    }

    @Test
    void shouldNotBeEqualDifferentProductPrice(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(2L, "Watermelon", 150);
        boolean actual = a.equals(b);
        assertFalse(actual);
    }

    // hashcode
    @Test
    void sameObjectShouldHaveSameHashCode(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(2L, "Watermelon", 250);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotHaveSameHashCode(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(3L, "Peach", 300);
        assertNotEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void ShouldNotHaveTheSameHashCodeDifferentProductPrice(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(2L, "Watermelon", 300);
        assertNotEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotHaveTheSameHashCodeDifferentProductID(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(3L, "Watermelon", 250);
        assertNotEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotHaveTheSameHashCodeDifferentProductName(){
        Product a = new Product(2L, "Watermelon", 250);
        Product b = new Product(2L, "Peach", 250);
        assertNotEquals(a.hashCode(), b.hashCode());
    }
}