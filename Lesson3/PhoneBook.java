package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

    public void printBook(){
        for (Map.Entry<String, ArrayList<String>> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }

    public void findPhone(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите фамилию, для поика номера телефона:");
        String FIO = sc.nextLine();
        for(Map.Entry<String, ArrayList<String>> o : hm.entrySet()){
            if(hm.containsKey(FIO)){
                ArrayList<String> tel = new ArrayList<>(hm.get(FIO));
                System.out.println("Номер телефона " + FIO + ": " + tel.get(0));
            } else System.out.println("Данный человек отсутствуе в телефонной книге");
            break;
        }
    }
    public void findEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию, для поиска e-mail, :");
        String FIO = sc.nextLine();
        for(Map.Entry<String, ArrayList<String>> o : hm.entrySet()){
            if(hm.containsKey(FIO)){
                ArrayList<String> tel = new ArrayList<>(hm.get(FIO));
                System.out.println("e-mail " + FIO + ": " + tel.get(1));
            } else System.out.println("Данный человек отсутствуе в телефонной книге");
            break;
        }
    }
}
