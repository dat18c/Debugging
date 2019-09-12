package com.kea.debugging;

public class Main {

    public static void main(String[] args) {
	// Der er en fejl i koden - find og ret fejlen vha. debugging
        //initier array
        int[] tal = { 1, 2, 3, 4 };
        //læg tallene sammen
        int sum = 0;
        for (int i=1;i<tal.length;i++)
        {
            sum = sum + tal[i];
        }
        //udskriv summen
        System.out.println(sum);

    }
}
