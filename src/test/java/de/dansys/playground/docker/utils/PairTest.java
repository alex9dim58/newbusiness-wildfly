package de.dansys.playground.docker.utils;

import com.google.gson.Gson;
//import de.dansys.playground.docker.utils.Pair;
import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PairTest
{
//    private static final Logger testLogger = LoggerFactory.getLogger(PairTest.class);
    private static final Logger testLogger = LogManager.getLogger(PairTest.class);
    @Test
    public void testToString()
    {
        DateFormat formator  = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");
        Pair pair = new Pair();
        pair.setFirst(formator.format(new Date()));
        pair.setSecond("Test Message");
        Gson gson = new Gson();
        String res = gson.toJson(pair);
        assertNotNull(res);
//        System.out.println("Result: "+res);
        testLogger.info("Info Result: {}",res);
        testLogger.trace("Trace Result: {}",res);
        testLogger.debug("Debug Result: {}",res);
    }
}
