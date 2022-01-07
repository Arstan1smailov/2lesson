package com.company;

public class Xiaomi extends Phone{
    public Xiaomi(int ram, int rom) {
        super(ram, rom);
    }

    @Override
    public void print() {
        System.out.println("Phones mark: " + "Xiaomi" + "\nRom = " + rom + "\nRam = " + ram);
    }
}
