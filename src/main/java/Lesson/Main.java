package Lesson;

public class Main {
    public static void main(String[] args) {
        Converter<Double> converter = new Converter();
        Double[] arrayDouble = new Double[10];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = i + 0.3;
        }

        System.out.println(converter.numericArrayToList(arrayDouble));
        System.out.println(converter.getConvertedList());
        System.out.println(converter.printList());

        Converter<Integer> converterSecond = new Converter();
        Integer[] arrayInt = new Integer[10];

        for (int j = 0; j < arrayInt.length; j++) {
            arrayInt[j] = j;
        }
        System.out.println(converterSecond.numericArrayToList(arrayInt));
        System.out.println(converterSecond.getConvertedList());
        System.out.println(converterSecond.printList());
    }
}