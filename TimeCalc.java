/*
The TimeCalc program gets a time input which is given using the 24-hour hh:mm format, and a
number of minutesToAdd input. The program computes time + minutesToAdd, and prints the
resulting time using the 24-hour hh:mm format.
 */
public class TimeCalc {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); //between 0-23
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); //between 0-59
        int minutesToAdd = Integer.parseInt(args [1]); //minutes to add

        int newhrs = minutesToAdd / 60; //converts the input into the amount of hours to add
        int newmins = (minutesToAdd - (60 * newhrs)) + minutes; //sums minutes to minutesToAdd and saves 
        newhrs = newhrs + hours; //sums the result of line 13 and hours

        if (newmins > 59) { //checks if the number of minutes is too high
            newhrs = newhrs + (newmins / 60); //converts the input into the amount of hours to add
            newmins = newmins % 60; //changes the display of the minutes
        }

        if (newhrs > 23) //checks if the number of hours is too high
            newhrs = newhrs % 24; //changes the display of the hours

        
        //goes over several conditions and prints the new time in a proper way
        if (newhrs < 10)
            System.out.print ("0" + newhrs);
        else
            System.out.print ("" + newhrs);

        if (newmins < 10)
            System.out.print(":0" + newmins);
        else    
            System.out.print (":" + newmins);
    }
}
