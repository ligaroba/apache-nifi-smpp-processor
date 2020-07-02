package ke.co.safaricom.processors.smpp.logger;


import org.apache.nifi.logging.ComponentLog;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Logging {
    ComponentLog LOGGER;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    public Logging(ComponentLog logger){
        LOGGER = logger;
    }



    public void  info(String message){
        Date date =new Date();
        LOGGER.info(df.format(date) +" INFO " + message);
       //System.out.println("INFO : " + message);
    }

    public void error(String message){
        Date date =new Date();
        LOGGER.error(df.format(date) + " ERROR " + message);
        //System.out.println( " ERROR : " + message);
    }

    public void debug(String message){
        Date date =new Date();

        LOGGER.debug(df.format(date) + " DEBUG " + message);
       // System.out.println("DEBUG  : " + message);
    }

}
