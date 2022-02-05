package com.luv2code.jackson.json.demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Driver {

    public static void main(String[] args){

        try {
            //create object mapper
            ObjectMapper objectMapper = new ObjectMapper();

            //read JSON to map/convert into POJO
            //data/sample-lite.json
            Student theStudent = objectMapper.readValue(new File("data/sample-full.json"), Student.class);

            //print first and last name
            System.out.println("Firstname : " + theStudent.getFirstName());
            System.out.println("Lasttname : " + theStudent.getLastName());

            //printing contents from nested json obj
            Address theAddress = theStudent.getAddress();
            System.out.println("Street : " + theAddress.getStreet());
            System.out.println("City : " + theAddress.getCity());

            for (String tempLanguages:
                 theStudent.getLanguages()) {
                System.out.println("Languages : " + tempLanguages);
            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
