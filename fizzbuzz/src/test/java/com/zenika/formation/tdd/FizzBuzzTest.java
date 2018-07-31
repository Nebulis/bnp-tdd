package com.zenika.formation.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_create_a_fizzbuzz_object_when_constructor_is_called() {
        assertNotNull(new FizzBuzz());
    }
}
