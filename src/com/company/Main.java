package com.company;

import java.util.Random;

public class Main {
    //TYPE NUMBER FROM 1 TO 3
    public static void main(String[] args) {
        // write your code here
        createNewObject(1);//type number from 1 to 3
        createNewObject(2);//type number from 1 to 3
        createNewObject(3);//type number from 1 to 3
        createNewObject(4);//type number from 1 to 3

    }

    public static String createNewObject(int Phone) {
        Random a = new Random();
        int b = a.nextInt(30);
        int c = a.nextInt(30);
        switch (Phone) {
            case 1:
                Xiaomi xiaomi = new Xiaomi(c, b);
                xiaomi.print();
                break;
            case 2:
                Iphone iphone = new Iphone(c, b);
                iphone.print();
                break;
            case 3:
                Samsung samsung = new Samsung(b, c);
                samsung.print();
                break;
            default:
                System.out.println("TYPE NUMBER FROM 1 TO 3!!!");
        }
        return null;
    }
}
