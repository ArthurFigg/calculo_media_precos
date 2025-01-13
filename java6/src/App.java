import java.util.Scanner;

import entities.produt;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("ola");
        int n = sc.nextInt();
        produt[] vect = new produt[n];

        for (int i=0; i<n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new produt(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i].getPrice();
        } 
        double avg = sum / n;

        System.out.printf("average price = %.2f%n", avg);



        sc.close();
    
    }
}
