/**
 * Created by Pi on 5/1/16.
 */
public class FibonacciSeries {


        public int getFibonacci(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            if (n == 2)
            {
                return 1;
            }
            return getFibonacci(n - 1) + getFibonacci(n - 2);

        }//end of getFibonacci method




}//end of class

