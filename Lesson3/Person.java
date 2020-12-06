package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Person extends PhoneBook{

    public void newRecord(String FIO, String phoneEmail){
        String[] arr = phoneEmail.split(" ");
        ArrayList<String> arrPhoneEmail = new ArrayList<>(Arrays.asList(arr));
        hm.put(FIO,arrPhoneEmail);
    }

}
