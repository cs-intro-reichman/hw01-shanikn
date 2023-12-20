import java.util.Random;

public class GenThree 
{
    /*
    * Generates three random integers, each in a given range [a,b),
    * prints them, and then prints the minimal number that was generated.
    */
        public static void main(String[] args) {
            Random rd= new Random();
           // int array[]=new int[3]; לא באמת צריך עם מערך
           int min= Integer.parseInt(args[0]);
           int max= Integer.parseInt(args[1]);
           int min_num=max;
           for (int i=0;i<3;i++)
            {
                int int_random = rd.nextInt(min,max);
                System.out.println(int_random);
            
                //array[i]=int_random;
                if(int_random<min_num)
                {
                    min_num=int_random;
                }
            }	
            System.out.println("The smallest number the random function generated is: "+min_num);
        }

}
