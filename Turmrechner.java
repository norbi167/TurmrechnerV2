
/**
 * Write a description of class Turmrechner here.
 *
 * @author Norbert Boboi
 * @version Version 1
 */
public class Turmrechner
{
    public static void main(String[] args){
        int number = 9;
        
        System.out.println("Turmrechner");
        System.out.println("===========");
        for (int i = 2; i <= 9; i++){
            System.out.println(number+ " x " +i);
            number *= i;
        }
                for (int i = 2; i <= 9; i++){
            System.out.println(number+ " : " +i);
            number /= i;
        }
    }
}
