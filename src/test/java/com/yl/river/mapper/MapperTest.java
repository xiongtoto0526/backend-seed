package com.yl.river.mapper;


import com.yl.river.Application;
import com.yl.river.service.BookServiceTest;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("local")
public class MapperTest {


    private static final Logger logger = LoggerFactory.getLogger(MapperTest.class);

    @Before
    public void before() {
        logger.debug("do some thing before test here...");
    }

    @After
    public void after() {
        logger.debug("do some thing after test here...");
    }
}
