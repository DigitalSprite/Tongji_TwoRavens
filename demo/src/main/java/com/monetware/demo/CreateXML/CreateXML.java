package com.monetware.demo.CreateXML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class CreateXML {

    public CreateXML(){}

    /**
     * main part
     * the test .tab file is test.tab located under the 'src' folder
     * and you will create a test.xml under the same folder
     * @throws Exception
     */
    public void CreateFile(String fileName) throws Exception{

        //file root
        String fileroot = "C:/Users/Stephen/Desktop/dataverse/demo/src/main/resources/static/files/";

        File file = new File(fileroot + "tab/" + fileName + ".tab");
        WriteXML c = new WriteXML();

        //write xml context into os
        OutputStream os = c.getOutputStream(file, "1", "2", "3", "4", "5","text/tab-separated-values");

        //define output file
        File fileout = new File(fileroot + "xml/" + fileName + ".xml");
        FileOutputStream fos = new FileOutputStream(fileout);

        //convert os into byte array and store them into test.xml
        String temp = os.toString();
        byte[] flush = temp.getBytes();
        fos.write(flush);
        fos.close();
        os.close();
    }
}