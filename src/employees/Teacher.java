package employees;

import java.util.*;

public class Teacher extends FederalEmployee {
    private String[] listItems;
    private int itemsAmount;


    public Teacher(String fullName, int initialSalary, int experienceYears) {
        super(fullName, initialSalary, experienceYears);
        listItems = new String[6];
        itemsAmount = 0;
    }

    @Override
    protected int calculateSalary() {
        return super.calculateSalary() + itemsAmount * 500;
    }

    public void addItem(String item) {
        if (itemsAmount >= 6) {
            System.out.println("У этого учителя уже много предметов");
            return; //окончание процедуры
        }
        if(contains(item)) {
            System.out.println(getFullName() + " уже ведёт этот предмет");
            return;
        }
        listItems[itemsAmount] = item;
        itemsAmount++;
        System.out.print("Успешно! Теперь ");
        checkItems();
    }

    public void checkItems() {
        System.out.println(getFullName() + " ведет предметы:");
        for (int i = 0; i < itemsAmount; i++) {
            System.out.println("-" + listItems[i]);
        }
    }

    private boolean contains(String s) {
        for (int i = 0; i < itemsAmount; i++)
            if (listItems[i].equals(s))
                return true;
        return false;
    }

    public void spendItem(String s) {
        if (contains(s))
            System.out.println(getFullName() + " провел/а урок " + s);
        else
            System.out.println(getFullName() + " не ведет предмет " + s);
    }

    public int getItemsAmount() {
        return itemsAmount;
    }

    public void dispose() { //декструктор
        System.out.println("Вызванные учителя уходят в отпуск");
        super.dispose();
    }
}
