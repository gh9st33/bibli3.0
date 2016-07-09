
public class CatapultTester {
public static void main(String[] args){
        
        double [] velocity = {20,25,30,35,40,45,50};
        double [] degrees = {25,30,35,40,45,50};
        
        System.out.printf("%s", "MPG");
        
        Catapult vars = new Catapult(velocity,degrees);
        
        double [] distance = vars.calcDistance();
        
        for (int i = 0; i < degrees.length; i++){
        
            System.out.printf("%10.0f",degrees[i]);
         //and i have to be the best pert   
        }
        
        System.out.printf("\n");
        System.out.println("===============================================================");
        
        for(int i = 0; i < distance.length; i++)
        {
            
            System.out.printf( "%2.0f ", velocity[i]);
            
            for(int f = 0; f < distance.length; f++)
            {
                
                System.out.printf( "%8.1f ",  distance[i]);
            
            }
            
            System.out.printf("\n");
        
        }
        
    }
}
