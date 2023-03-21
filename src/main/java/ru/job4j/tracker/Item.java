package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {

    }

    public Item(String name) {
    this.name = name;
    }

    public Item(int id, String name) {
    this.id = id;
    this.name = name;
    }

    public void printItems() {
        System.out.println("id предмета: " + id);
        System.out.println("Название предмета: " + name);
        System.out.println("");
    }

    public static void main(String[] args) {
        Item first = new Item(155, "Печенька");
        Item second = new Item("Сосисочка");
        Item third = new Item();
        first.printItems();
        second.printItems();
        third.printItems();
    }
}
