package com.company;

public class Samsung extends Phone{
    public Samsung(int ram, int rom) {
        super(ram, rom);
    }

    @Override
    public void print() {
        System.out.println("Phones mark: " + "Samsung" + "\nRom = " + rom + "\nRam = " + ram);
    }
}
