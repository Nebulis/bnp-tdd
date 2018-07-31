package com.zenika.kata.tennis;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {

    @Test
    public void should_create_instance() {
        assertThat(new TennisGame()).isNotNull();
    }
}
