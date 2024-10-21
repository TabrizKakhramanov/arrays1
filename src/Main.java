import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        int[] firstArray = new int[]{1,2,3,0,0,0,0,0,3,1,2,1,1,3};
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] thirdArray = new String[]{"Привет","мир","!"};

        //task 2
        for (int i = 0; i < firstArray.length; i++) {
            if (i==firstArray.length-1){
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            if (i==secondArray.length-1){
                System.out.print(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < thirdArray.length; i++) {
            if (i==thirdArray.length-1){
                System.out.print(thirdArray[i]);
                break;
            }else{
                System.out.print(thirdArray[i]+", ");
            }
        }
        System.out.println();

        //task 3
        for (int i = firstArray.length-1; i >=0; i--) {
            if (i==0){
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i]+", ");
        }
        System.out.println();
        for (int i = secondArray.length-1; i >=0 ; i--) {
            if (i==0){
                System.out.print(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i]+", ");
        }
        System.out.println();
        for (int i = thirdArray.length-1; i >=0 ; i--) {
            if (i==0){
                System.out.print(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i]+", ");
        }
        System.out.println();

        //task 4
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i]%2!=0){
                firstArray[i]+=1;
            }
        }
        System.out.println(Arrays.toString(firstArray));


    }
}