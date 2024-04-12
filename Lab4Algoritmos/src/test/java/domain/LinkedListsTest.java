package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LinkedListsTest {

    /*@Test*/
    void singlyLinkedListTest1() throws ListException {
        try {
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(15);
            list.add(10);
            list.add(2);
            list.add(7);
            System.out.println(list);
            list.addFirst(20);
            System.out.println(list);
            list.addFirst(9);
            System.out.println(list);
            System.out.println(STR."GetFirst: \{list.getFirst()}");
            System.out.println(STR."GetLast: \{list.getLast()}");
            System.out.println(STR."GetPrev(9): \{list.getPrev(9)}");
            System.out.println(STR."GetPrev(2): \{list.getPrev(2)}");
            System.out.println(STR."GetPrev(7): \{list.getPrev(7)}");

            System.out.println(STR."IndexOf(20): \{list.indexOf(20)}");
            System.out.println(STR."IndexOf(10): \{list.indexOf(10)}");
            System.out.println(STR."IndexOf(15): \{list.indexOf(15)}");

            System.out.println("\nPruebas del getNode");
            for (int i = 1; i <= list.size(); i++) {
                System.out.println("list.getNode("+i+"): "+list.getNode(i).data);
            }
            //System.out.println("list.getNode(100): "+list.getNode(100).data);

            list.clear();
            for (int i = 0; i < 50; i++) {
                list.add(util.Utility.getRandom(99));
            }
            System.out.println(list);
            System.out.println("Ordenamos la lista con el metodo sort()");
            list.sort();
            System.out.println(list);
            System.out.println("list.size(): "+list.size());

            System.out.println("Probamos suprimir");
            for (int i = 0; i <10 ; i++) {
                int value = util.Utility.getRandom(99);
                if(list.contains(value)){
                    list.remove(value);
                    System.out.println("Se ha eliminado el elemento: "+value);
                }
            }
            System.out.println(list);

        }catch (ListException ex){
            System.out.println(ex.getMessage());
        }
    }


    @Test
    void customerTest() {
        try {
            SinglyLinkedList customerList = new SinglyLinkedList();
            customerList.add(new Customer(1, "Emma", 21, "111111111", "emma@gmail.com"));
            customerList.add(new Customer(2, "Mateo", 22, "222222222", "mateo@gmail.com"));
            customerList.add(new Customer(3, "Isabella", 20, "333333333", "isabella@gmail.com"));

            System.out.println(customerList);

            if (customerList.contains(new Customer(2))) {
                System.out.println("Customer id==2 is stored in the list");
            } else {
                System.out.println("Customer id==2 is not stored in the list");
            }


        }catch(ListException ex){
            System.out.println(ex.getMessage());
        }

    }

    @Test
    void doublyLinkedListTest() {

    }
}