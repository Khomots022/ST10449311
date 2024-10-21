
import java.util.Scanner;

public class Petshop 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String dogbreed ="chiwawa";
        int numDogs=12;
        {
            System.out.println("we have: "+numDogs+" and the breed is: "+dogbreed);
        }
        
        //if-else statement
        int numbreed = 8;
            if(numbreed >= 10)
            {
                System.out.println("there are more than 10 breeds");
            }
            else
            {
                System.out.println("there are less than 10 breeds");
            }
            //for loop
            for(int dogs = 50; dogs < 60; dogs++)
            {
                System.out.println("dog number : " +dogs);
            }
            
            vetclass get = new vetclass("pol", 26, 82);
            get.displayInfo();
            //o boile shebe maburna
            
    }
    
}
