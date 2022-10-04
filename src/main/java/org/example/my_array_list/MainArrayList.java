package org.example.my_array_list;

public class MainArrayList {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();


        myArrayList.add("Marcin");
        myArrayList.add("Zbigniew");
        myArrayList.add("Ryszard");
        myArrayList.add("Henryk");
        myArrayList.add("Janusz");
        myArrayList.add("Marcin");
        myArrayList.add("Zbigniew");
        myArrayList.add("Ryszard");
        myArrayList.add("Henryk");
        myArrayList.add("Janusz");
        myArrayList.add("Marcin");
        myArrayList.add("Zbigniew");
        myArrayList.add("Ryszard");
        myArrayList.add("Henryk");
        myArrayList.add("Janusz");
        myArrayList.add("Henryk");
        myArrayList.add("Janusz");
        myArrayList.add("Marcin");
        myArrayList.add("Zbigniew");
        myArrayList.add("Ryszard");
        myArrayList.add("Henryk");
        myArrayList.add("Janusz");

        System.out.println(myArrayList);

        System.out.println("Size: " + myArrayList.size());

        System.out.println("Index of: " + myArrayList.get(9));

        myArrayList.removeFirst("Marcin");

        System.out.println(myArrayList);

        System.out.println("Size: " + myArrayList.size());
        myArrayList.removeAll("Ryszard");

        myArrayList.remove(3);


        System.out.println(myArrayList);

        myArrayList.clear();

        System.out.println("Size: " + myArrayList.size());


    }
}
