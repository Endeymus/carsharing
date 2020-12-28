package com.endeymus.carsharing;

import com.endeymus.carsharing.utils.CarHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarsharingApplicationTests {

    @Autowired
    private CarHelper helper;

    @Test
    void contextLoads() {
        helper.marks();
    }

}
