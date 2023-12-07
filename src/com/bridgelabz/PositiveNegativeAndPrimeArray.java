package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class PositiveNegativeAndPrimeArray {

    int a[] = {-1, 20, -3, 30, 40, -19, -1, -3, -19, 20, 30, 40};
    List<Integer> positiveArrayList = new ArrayList<>();
    List<Integer> negativeArrayList = new ArrayList<>();
    List<Integer> primeArrayList = new ArrayList<>();

    public void posNegPrime() {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)
            {
                negativeArrayList.add(a[i]); // Negative Number
            }
            else if (a[i] > 0)
            {
                positiveArrayList.add(a[i]); // Positive Number
            }
        }

        for (int i = 1; i < a.length; i++)
        {
            boolean isPrime = true;

            for (int j = 2; j <= a[i] / 2; j++)
            {
                if (a[i] % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeArrayList.add(a[i]);
            }
        }

        System.out.println("Negative Numbers: " + negativeArrayList);
        System.out.println("Positive Numbers: " + positiveArrayList);
        System.out.println("Prime Numbers: " + primeArrayList);
    }

    public static void main(String[] args) {
        PositiveNegativeAndPrimeArray obj = new PositiveNegativeAndPrimeArray();
        obj.posNegPrime();
    }
}
