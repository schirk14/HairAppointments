import java.util.*;

public class HairAppointments {

  public static void main(String[] args) {
    
     Scanner clientname = new Scanner(System.in);
     Scanner dateavailable = new Scanner(System.in);
     Scanner timeavailable = new Scanner(System.in);
     Scanner notes = new Scanner(System.in);
     Scanner stylistchoice = new Scanner(System.in);

     System.out.println("Rachels Hair Salon\n\n");
    
    // Input #1: Name
     System.out.println("Enter Your Name:");

     String name = clientname.nextLine();

     System.out.println("\n\n");

      // Input #2: Stylist
     System.out.println("Hello " + name + "! Which stylist would you prefer?");

     String stylist = stylistchoice.nextLine();

     System.out.println("\n\n");

     System.out.println(stylist + " would love to do your hair!");
    
    // Input #3: Date
     System.out.println("What date are you available?");

     String date = dateavailable.nextLine();

     System.out.println("\n\n");

     System.out.println(date + " sounds great!");

     // Input #4: Time
     System.out.println("What time works for you on " + date + "?");

     String time = timeavailable.nextLine();

     System.out.println("\n\n");

     System.out.println(stylist +  " can do " + time + " on " + date);

     System.out.println("\n\n");

    // Input #5: Notes
     System.out.println("What services would you like done to your hair?");

     String services = notes.nextLine();

     System.out.println("\n");


     System.out.println("Sounds good, " + name + "! " + stylist + " will see you on the " + date + " at " + time + " for a " + services + ". Have a good day! ");

     System.out.println("\n\n");

  }

}

