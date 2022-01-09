package com.company;

import java.util.Random;

public class Main {
    //TYPE NUMBER FROM 1 TO 3
    public static void main(String[] args) {
        // write your code here
        Phone phone [] = {createNewObject(1), createNewObject(2), createNewObject(3), createNewObject(4)};
        for (int i = 0; i < phone.length; i++) {
            if(i < phone.length && phone[i] instanceof Printable) {
                phone[i].print();
            }else{
                System.out.println("TYPE NUMBER FROM 1 TO 3!!!");
            }
        }
    }

    public static Phone createNewObject(int Phone) {
        Random a = new Random();
        int b = a.nextInt(30);
        int c = a.nextInt(30);
        switch (Phone) {
            case 1:
                Xiaomi xiaomi = new Xiaomi(c, b);
                return xiaomi;
            case 2:
                Iphone iphone = new Iphone(c, b);
                return iphone;
            case 3:
                Samsung samsung = new Samsung(b, c);
                return samsung;
            default:
                System.out.println("TYPE NUMBER FROM 1 TO 3!!!");
        }
        Xiaomi xiaomi = new Xiaomi(c, b);Iphone iphone = new Iphone(c, b);Samsung samsung = new Samsung(b, c);

        Phone phone [] = {xiaomi, iphone, samsung};
        return null;
    }
}
