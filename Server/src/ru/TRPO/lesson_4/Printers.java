package ru.TRPO.lesson_4;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import java.io.IOException;

/**
 * Created by ((ZLoY)) on 03.12.2016.
 */
class Printers {


    public String get() throws IOException {
       PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null,null);
       StringBuilder builder = new StringBuilder();
       String getPrinters;

       JSONArray array = new JSONArray();
       JSONObject root = new JSONObject();
       JSONObject printers = new JSONObject();

       for(PrintService printer: printServices){
          array.add(printer.getName());

        }

        root.put("printers", array);

       getPrinters = root.toString();
       builder.append(getPrinters);


        return getPrinters;
    }
}
