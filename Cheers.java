// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    
                String name = args[0]; //only lettres, no spaces
                String newname = "";
                int num = Integer.parseInt(args[1]); //number of cheers
                int i = 0;
                char temp;

                while (i < name.length()) { //goes over the name given via input
                        temp = name.charAt(i); //saves the letter at the current index as a single char

                        if ((int) temp >= 97) //uses ASCII table values to convert lowercase letters to uppercase 
                                temp = (char) (name.charAt(i)-32);
                        newname = newname + temp;

                        System.out.print("Give me ");

                        if (temp == 'A' || temp == 'E' || temp == 'F' || temp == 'H' || temp == 'I' || temp == 'L'
                        || temp == 'M' || temp == 'N' || temp == 'O' || temp == 'R' || temp == 'S' || temp == 'X') 
                                System.out.print("an " + temp + ": " + temp + "!"); 
                        else
                                System.out.print("a  " + temp + ": " + temp + "!");
                        //very big condition to check if an or a is needed

                        i ++;
                        System.out.println();
                }
                i = 0;
                System.out.println("What does that spell?");
                
                while (i < num) { //the loop runs num times and prints the cheer inside
                        System.out.println(newname + "!!!");
                        i ++;
                }
        }
}
