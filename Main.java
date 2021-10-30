import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.println();
      ArrayList<Integer> mylist = new ArrayList<Integer>();
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter how many random numbers you want to sort: ");
      int size = in.nextInt();

      System.out.print("By what multiple do you want the random number to be: ");
      
      int multiple = in.nextInt();
      int randomnumber, times, temporary2;
      int counter = 0;
      int temporary = 0;
      int i = 0;
      int x = 0;

      System.out.println("\nRandom ArrayList values:");
      //to generate random numbers:
      
      for (i = 0; i < size; i++) {
        //to get a value for the multiple
        while (true) {
          randomnumber = (int) (Math.random() * 101);
          mylist.add(i, randomnumber);
          if (multiple == 0) 
            break;
          if (randomnumber % multiple == 0 && randomnumber > multiple)
            break;
        }
        System.out.println("ArrayList " + i + ":\t\t\t" + mylist.get(i));
      }
      //to sort the ArrayList
      boolean sorted;
      for (;;) {
        sorted = true;
        for (i = 0; i < size - 1; i++) {
          if (mylist.get(i) > mylist.get(i + 1)) {
            temporary = mylist.get(i);
            mylist.set(i , mylist.get(i + 1));
            mylist.set(i + 1, temporary);
            if (i == mylist.size())
              break;
            temporary = mylist.get(i);
            sorted = false;
          }
        }
        if (sorted == true) 
          break;
      }
        //to print the sorted ArrayList
      System.out.println("\nSorted ArrayList:");
      for (i = 0; i< size; i++) 
        System.out.println("ArrayList " + i + ":\t\t\t" + mylist.get(i));
    }
  }
}