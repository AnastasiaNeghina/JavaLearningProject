package com.neghina.classesandobjects.autoservicetask;

public class Tool {
    long inventoryNumber;
    boolean isVersatile;
    boolean needsElectritity;
    boolean isDurable;

    public Tool() {
        System.out.println("A fost creat un instrument despre care nu se stie nimic");
    }

    public Tool(long inventoryNumberParameter, boolean isVersatileTool) {
        this.inventoryNumber = inventoryNumberParameter;
        this.isVersatile = isVersatileTool;
        System.out.println("A fost creat un nou instrument despre care se cunoaste numarul de inventariere si daca este versatil sau nu");
    }
}