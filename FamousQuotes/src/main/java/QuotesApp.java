import java.util.Scanner;

public class QuotesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            String quotes[] = {
                    "Preoccupied with a single leaf, you won't see the tree. Preoccupied with a single tree, you'll miss the entire forest.",
                    "Do you see how infinite you are?",
                    "Today is victory over yourself of yesterday; tomorrow is your victory over lesser men.",
                    "As Long As I Live, There Are Infinite Chances!",
                    "If You Don't Take Risks, You Can't Create a Future.",
                    "Real Men Can Forgive A Woman's Lies",
                    "I think, therefore I am",
                    "The only thing we have to fear is fear itself",
                    "Love recognizes no barriers",
                    "Change your thoughts and you change your world"
            };

            while (true) {
//                System.out.println("Select a number for a quote(1-10).");

//                try {
                    int userChoice = -1;
//                    userChoice = input.nextInt();

                    System.out.println("Select a number for a quote(1-10).");
                    userChoice = input.nextInt();

                    if (userChoice >= 1 && userChoice <= 10) {
                        System.out.println("Quote: " + quotes[userChoice -1]);
                    }else{
                        System.out.println("Invalid input.");
                    }
//                } catch (Exception e) {
//                    System.out.println("Invalid input. Try a number 1-10");
//                    input.nextLine();
//                    e.printStackTrace();
                }
//                System.out.println("do you want another quote? ");
//                String moreQuotes = input.next().trim().toLowerCase();
//                if(moreQuotes.equals("yes")){

//                }else{
//                    break;
                }
                {
                }
            }

