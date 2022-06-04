package Lesson;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter<E extends Number> {

    ArrayList<E> convertedList = new ArrayList();

    public ArrayList<E> numericArrayToList(E[] array) {
        this.convertedList = new ArrayList(Arrays.asList(array));
        return this.convertedList;
    }

    public ArrayList<E> getConvertedList() {
        return convertedList;
    }

    public ArrayList<E> printList() {
        for (E list : this.convertedList) {
            System.out.println(list);
        }
        return convertedList;
    }
}