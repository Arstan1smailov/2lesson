package com.company;

public class Iphone extends Phone{

    public Iphone(int ram, int rom) {
        super(ram, rom);
    }

    @Override
    public void print() {
        System.out.println("Phones mark: " + "Iphone"+ "\nRom = " + rom + "\nRam = " + ram);
}
}
