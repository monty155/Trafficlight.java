package Array;

public class averageValue {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1,2,3,4,5,6,7,8};

        int sum = 0;
        for(int i =0; i< numbers.length ;i++)
            sum = sum + numbers [i];

         int value = sum / numbers.length;

                System.out.println("avarage value of array   " + value);


    }
}
