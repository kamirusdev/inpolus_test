package com.example.inpolus_test;

import com.example.inpolus_test.services.TextHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InpolusTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void countMatchesTest(){
        int count = TextHandler.countMatches( "x zx zxz xx zXz", "x");
        assert count == 5;

    }

}
