package Task3;

public class Main {
    public static void main(String[] args) {
        Computer[] arr = new Computer[5];


        for(int i = 0; i < arr.length;i++){
            arr[i] = Computer.createComp("Computer" + i);
            System.out.println(arr[i]);
        }
    }
}
