package EXERCISES;

import java.util.Scanner;
import java.util.TreeMap;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        TreeMap<String, Integer> chemicalEl = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int size = input.length - 1;
            while (size >= 0){
                if(!chemicalEl.containsKey(input[size])){
                    chemicalEl.put(input[size],1);
                }
                else {
                    chemicalEl.put(input[size], chemicalEl.get(input[size])+1);
                }
                size--;
            }
        }

        for (var perTable: chemicalEl.keySet()) {
            System.out.print(perTable + " ");
        }
    }
}
