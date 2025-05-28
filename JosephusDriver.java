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

=== Elimination count is 1 ===
Remaining survivors: 1-Brian, 2-Delon, 3-Aryton, 4-Eli, 5-Nate, 6-Cameron, 7-Mohamed, 8-Adrian, 9-Abner, 10-Tom, 11-Egor, 12-Wissal, 13-Shunyun, 14-Percy, 15-Antonio, 16-Aziz, 17-Biruk, 18-Max, 19-Jason, 20-Riane, 21-Matthew

Continue elimination? <press enter>

Brian eliminated!
Remaining survivors: 1-Delon, 2-Aryton, 3-Eli, 4-Nate, 5-Cameron, 6-Mohamed, 7-Adrian, 8-Abner, 9-Tom, 10-Egor, 11-Wissal, 12-Shunyun, 13-Percy, 14-Antonio, 15-Aziz, 16-Biruk, 17-Max, 18-Jason, 19-Riane, 20-Matthew

Continue elimination? <press enter>

Aryton eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Nate, 4-Cameron, 5-Mohamed, 6-Adrian, 7-Abner, 8-Tom, 9-Egor, 10-Wissal, 11-Shunyun, 12-Percy, 13-Antonio, 14-Aziz, 15-Biruk, 16-Max, 17-Jason, 18-Riane, 19-Matthew

Continue elimination? <press enter>

Nate eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Mohamed, 5-Adrian, 6-Abner, 7-Tom, 8-Egor, 9-Wissal, 10-Shunyun, 11-Percy, 12-Antonio, 13-Aziz, 14-Biruk, 15-Max, 16-Jason, 17-Riane, 18-Matthew

Continue elimination? <press enter>

Mohamed eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Abner, 6-Tom, 7-Egor, 8-Wissal, 9-Shunyun, 10-Percy, 11-Antonio, 12-Aziz, 13-Biruk, 14-Max, 15-Jason, 16-Riane, 17-Matthew

Continue elimination? <press enter>

Abner eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Tom, 6-Egor, 7-Wissal, 8-Shunyun, 9-Percy, 10-Antonio, 11-Aziz, 12-Biruk, 13-Max, 14-Jason, 15-Riane, 16-Matthew

Continue elimination? <press enter>

Egor eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Tom, 6-Wissal, 7-Shunyun, 8-Percy, 9-Antonio, 10-Aziz, 11-Biruk, 12-Max, 13-Jason, 14-Riane, 15-Matthew

Continue elimination? <press enter>

Shunyun eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Tom, 6-Wissal, 7-Percy, 8-Antonio, 9-Aziz, 10-Biruk, 11-Max, 12-Jason, 13-Riane, 14-Matthew

Continue elimination? <press enter>

Antonio eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Tom, 6-Wissal, 7-Percy, 8-Aziz, 9-Biruk, 10-Max, 11-Jason, 12-Riane, 13-Matthew

Continue elimination? <press enter>

Biruk eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Tom, 6-Wissal, 7-Percy, 8-Aziz, 9-Max, 10-Jason, 11-Riane, 12-Matthew

Continue elimination? <press enter>

Jason eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Tom, 6-Wissal, 7-Percy, 8-Aziz, 9-Max, 10-Riane, 11-Matthew

Continue elimination? <press enter>

Matthew eliminated!
Remaining survivors: 1-Delon, 2-Eli, 3-Cameron, 4-Adrian, 5-Tom, 6-Wissal, 7-Percy, 8-Aziz, 9-Max, 10-Riane

Continue elimination? <press enter>

Eli eliminated!
Remaining survivors: 1-Delon, 2-Cameron, 3-Adrian, 4-Tom, 5-Wissal, 6-Percy, 7-Aziz, 8-Max, 9-Riane

Continue elimination? <press enter>

Adrian eliminated!
Remaining survivors: 1-Delon, 2-Cameron, 3-Tom, 4-Wissal, 5-Percy, 6-Aziz, 7-Max, 8-Riane

Continue elimination? <press enter>

Wissal eliminated!
Remaining survivors: 1-Delon, 2-Cameron, 3-Tom, 4-Percy, 5-Aziz, 6-Max, 7-Riane

Continue elimination? <press enter>

Aziz eliminated!
Remaining survivors: 1-Delon, 2-Cameron, 3-Tom, 4-Percy, 5-Max, 6-Riane

Continue elimination? <press enter>

Riane eliminated!
Remaining survivors: 1-Delon, 2-Cameron, 3-Tom, 4-Percy, 5-Max

Continue elimination? <press enter>

Cameron eliminated!
Remaining survivors: 1-Delon, 2-Tom, 3-Percy, 4-Max

Continue elimination? <press enter>

Percy eliminated!
Remaining survivors: 1-Delon, 2-Tom, 3-Max

Continue elimination? <press enter>

Delon eliminated!
Remaining survivors: 1-Tom, 2-Max

Continue elimination? <press enter>

Max eliminated!
Tom is the last survivor!

*/