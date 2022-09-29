//Kadane's Algorithm
//Given an integer array, find the contiguous subarray (containing at least one number) with the largest sum or in other words the maximum sum contiguous subarray and print its sum.

public class Kadane {
    public static int KA(int[] Array) {
        int currentNumber=0;
        int maxNumber=0;
        for(int i=0; i<Array.length; i++){
            currentNumber=currentNumber+Array[i];
            if(currentNumber>maxNumber){
                maxNumber=currentNumber;
            }
            else if(currentNumber<0){
                currentNumber=0;
            }
        }
        return maxNumber;
    }  
    public static void main(String[] args) {
        int Array[]={5,-6,2,6,5,-10};
        System.out.println(KA(Array)); 
    } 
}
