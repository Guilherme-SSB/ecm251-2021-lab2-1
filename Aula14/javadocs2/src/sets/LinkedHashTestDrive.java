package sets;

import java.util.LinkedHashSet;
import java.util.Set;

import models.Item;

/**
 * Linked_Hash_Test_Drive
 */
public class LinkedHashTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new LinkedHashSet<>();
        // Adiciona itens no HashSet
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Pera", 2));
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Banana", 3));
        ;

        // Passa por todos os seus elementos
        itemSet.forEach(item -> System.out.println(item));
    }

}