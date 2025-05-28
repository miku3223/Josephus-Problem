import java.util.*;
import java.io.*;

public class JosephusSim {
   private PersonNode circle;     // a PersonNode pointer that tracks first node
   private int size;              // the number of people in the circle
   private int eliminationCount;  // the number to count to for elimination       
   private PersonNode track;      // a PersonNode pointer to help with elimination

   public JosephusSim(String fileName) {
      try {
         // load names from the file in order, generating a singly linked list of PersonNodes
         Scanner file = new Scanner(new File(fileName));
         PersonNode last = null;

         while (file.hasNextLine()) {
            String name = file.nextLine().trim();
            if (!name.isEmpty()) {
               PersonNode newNode = new PersonNode(name);
               if (circle == null) {
                  circle = newNode;
               } else {
                  last.next = newNode;
               }
               last = newNode;
               size++;
            }
         }
         // make the ring circular by attaching last node's next to front
         if (last != null) {
            last.next = circle;
         }
         // remember the last node as the one in front of the next to get eliminated
         track = last;
         // generate, print, and save the random elimination count
         eliminationCount = (int)(Math.random() * (size / 2)) + 1;
         System.out.println("=== Elimination count is " + eliminationCount + " ===");
      } catch(FileNotFoundException e) {
         System.out.println("Something went wrong with " + fileName);
      }
   }
   
   // optional helper method for constructing the circle
   private void add(String val) {
      PersonNode newNode = new PersonNode(val);
      if (circle == null) {
         circle = newNode;
         track = newNode;
      } else {
         track.next = newNode;
         track = newNode;
      }
      size++;
   }
   
   public void eliminate() {
      // count to the elimination count
      
      // print who will be eliminated
      
      // eliminate the person and update "front" of the circle and size

   }
   
   public boolean isOver() {
      // check if there's only one person left in the circle
      return false;
   }
   
   public String toString() {
      // if there's only one person left, print them as the last survivor
      if (isOver()) {
         return circle.name + " is the last survivor!";
      }
      // print the remaining survivors (watch out for infinite loop since list is circular)
      StringBuilder sb = new StringBuilder("Remaining survivors: ");
      PersonNode current = circle;
      int count = 1;
      do {
         sb.append(count++).append("-").append(current.name);
         if (current.next != circle) {
            sb.append(", ");
         }
         current = current.next;
      } while (current != circle);

      return sb.toString();
   }

}