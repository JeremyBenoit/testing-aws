package com.example.testaws;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestAwsApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  public void assetHelloWorld() {
    assertEquals("hello","hello");
  }
}
