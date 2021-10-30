package com.tutorial.jenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
class JenkinsTutoApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(JenkinsTutoApplicationTests.class);


    @Test
    void contextLoads() {
        logger.info("test case executé...");
        assertTrue(true);
    }

}
