package Task_8_Generic;

public class Task_1 {
    public static void main(String[] args) {
//        Создать переменную с определенным типом
//        Создать метод с возможностью генерирования где будем менять тип  данных для генерации
        int s = 2;

        getType(s);
    }

    public static <T> void getType(T a) {
        System.out.println(a);
    }

}
