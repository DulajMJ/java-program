package number_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {

    public static List<Integer> fibonacci(int number){

        List<Integer> list=new ArrayList<>();
        int n1=0,fnNumber;
        Integer n2=1;
        list.add(n1);

        while (number-2>=0){

            fnNumber=n1+n2;
            list.add(fnNumber);
            n2=n1;
            n1=fnNumber;
            --number;

        }
        return list;
    }

    public static void main(String arg[]){

        List<Integer> list=fibonacci(10);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
