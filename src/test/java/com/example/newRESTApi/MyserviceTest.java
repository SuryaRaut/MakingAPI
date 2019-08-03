package com.example.newRESTApi;

import com.example.newRESTApi.service.Myservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class MyserviceTest {

    @Test
    public void countTest(){
        Myservice ser =new Myservice();
        int x = ser.count(1,1,1);
        assertEquals(3,x);
    }

}
