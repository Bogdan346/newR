package Task_1_DataTypes;

public class Task_6 {
    public static void main(String[] args) {

        //Перобразовать массив в строку и обртано в массив


        Character arr[] = {'A', 'B', 'A', 'L', 'B'};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i].toString();
        }
        System.out.println(s);


        char result[] = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
