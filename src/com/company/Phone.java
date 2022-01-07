package com.company;

public abstract class Phone implements Printable {
    int ram;
    int rom;

    public Phone( int ram, int rom) {
        this.ram = ram;
        this.rom = rom;
    }
}
