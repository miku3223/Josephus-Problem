import java.util.*;

public class JosephusDriver {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      JosephusSim simulation = new JosephusSim("people.txt");
      
      while(!simulation.isOver()) {
         System.out.println(simulation);
         System.out.println("\nContinue elimination? <press enter>");
         console.nextLine(); // make the user hit enter to continue
         simulation.eliminate();
      }
      
      System.out.println(simulation);
   }

}

/*
# PROGRAM OUTPUT

=== Elimination count is 9 ===
Remaining survivors: 1-Brian, 2-Delon, 3-Aryton, 4-Eli, 5-Nate, 6-Cameron, 7-Mohamed, 8-Adrian, 9-Abner, 10-Tom, 11-Egor, 12-Wissal, 13-Shunyun, 14-Percy, 15-Antonio, 16-Aziz, 17-Biruk, 18-Max, 19-Jason, 20-Riane, 21-Matthew

Continue elimination? <press enter>

Remaining survivors: 1-Brian, 2-Delon, 3-Aryton, 4-Eli, 5-Nate, 6-Cameron, 7-Mohamed, 8-Adrian, 9-Abner, 10-Tom, 11-Egor, 12-Wissal, 13-Shunyun, 14-Percy, 15-Antonio, 16-Aziz, 17-Biruk, 18-Max, 19-Jason, 20-Riane, 21-Matthew

Continue elimination? <press enter>

*/