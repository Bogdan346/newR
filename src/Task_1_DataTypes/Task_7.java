package Task_1_DataTypes;

public class Task_7 {
    public static void main(String[] args) {
        //Преобразовать числовой массив в boolean
        int arr[]={1,0,1,2,3,0,0};


        for (int i = 0; i <arr.length ; i++) {
            Boolean bool;
            if (arr[i]==0){
                 bool=false;
            }else {bool=true;}

            System.out.println(bool);
        }

    }
}
