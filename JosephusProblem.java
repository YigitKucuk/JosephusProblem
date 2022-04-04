import java.util.Scanner;

public class JosephusProblem{
    
    public static int findSafePlace(int numberOfPeople, int startingPlace){

        if(numberOfPeople == 1){
            return 1;
        }else{
            return(findSafePlace(numberOfPeople-1, startingPlace) + startingPlace - 1 ) % numberOfPeople + 1;
        }
    }

    public static void main(String[] args) {

        System.out.println("\n");
        Scanner input = new Scanner(System.in);
       
        try{
            System.out.print("Enter number of people: ");
            int numberOfPeople = input.nextInt();
            System.out.print("Enter starting place (not index, starting place!): ");
            int startingPlace = input.nextInt();
            findSafePlace(numberOfPeople, startingPlace);
            System.out.println("Completed, the survivor is: " + findSafePlace(numberOfPeople, startingPlace) + "\n");
        }catch (Exception e){
            System.out.println("Enter a valid integer!");
        }

        input.close();

    }
}
