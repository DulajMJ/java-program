package number_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    //check prime number
    public static boolean prime(int number){
        boolean isPrime=true;

        for(int i=number-1;i>1;i--){

            if(number%i==0){
                isPrime=false;
                System.out.println(i);
                break;
            }
        }

       return isPrime;
    }

    public static boolean getPrimeUsingWhile(int number){
        boolean isPrime=true;
        Integer temp=number-1;
        while (temp>1){

            if(number%temp==0){
                isPrime=false;
                break;
            }

            temp--;
        }

        return isPrime;
    }
    //print primenumber given length
    public static List<Integer> prinPrimeList(){

        boolean isPrime=true;
        List<Integer> list=new ArrayList<>();
        int temp=2;
        while (list.size()<10){

            for(int i=2;i<temp;i++){

                if(temp%i==0){
                    isPrime=false;
                    break;
                }else{
                    isPrime=true;
                }

            }

            if(isPrime){list.add(temp);}
            temp++;
        }


        return list;
    }


    public static void main(String arg[]){

        System.out.println(prime(3));
        System.out.println(getPrimeUsingWhile(5));
        System.out.println(Arrays.toString(prinPrimeList().toArray()));
    }

}
