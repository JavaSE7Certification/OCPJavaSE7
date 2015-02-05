package nao.cycledev.ocpjavase7.c11;


import java.util.NoSuchElementException;
import java.util.Scanner;

public class CustomException {

    public static int readIntFromConsol(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        try
        {
            i = scanner.nextInt();
        } catch (NoSuchElementException nsee){
            System.out.println("Wrapping up the exception and throwing it ....");
            throw new InvalidInputException("Invalid integer input type in console", nsee);

        } catch (Exception e){
            System.out.println("Could not read integer value from console");
        };

        return i;
    }
}
