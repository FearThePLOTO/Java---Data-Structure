package Java.Projects.list_1.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        List<String> list = new List<>();
        
        for(int i = 0; i < 5 ;i++){
            System.out.print("Enter a string to add to the list: ");
            String input = S.nextLine();
            list.add(input);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.set(1, "Java");
        System.out.println("After setting index 1 to 'Java':");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(2);
        System.out.println("After removing index 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        S.close();
    }
}