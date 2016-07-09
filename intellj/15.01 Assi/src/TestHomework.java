/**
 * purpose- learn about abstract class and interface 
 * Created by pi on 3/30/16.
 */
import java.util.ArrayList;

public class TestHomework {

    public static void main(String[] args) {
    	 // Calls the constructor of the MyMath class, which in turn
        // invokes the constructor of its superclass, the 'Homework' class
        ArrayList<Homework>  arrayList = new ArrayList<Homework>();
        MyMath one = new MyMath();
        
        // Invokes the toString of the MyMath class. Since it does not have one,
        // The toString method of its superclass (Homework) is called.
        one.createAssignment(4);
        arrayList.add(one);


MyScience ms = new MyScience();
        
        // Invokes the toString of the MyMath class. Since it does not have one,
        // The toString method of its superclass (Homework) is called.
        ms.createAssignment(6);
        arrayList.add(ms);
        
MyEnglish me = new MyEnglish ();
        
        // Invokes the toString of the MyMath class. Since it does not have one,
        // The toString method of its superclass (Homework) is called.
        me.createAssignment(10);
        arrayList.add(me);
        
        
        Myjava mj = new Myjava ();
                
                // Invokes the toString of the MyMath class. Since it does not have one,
                // The toString method of its superclass (Homework) is called.
        mj.createAssignment(5);
        arrayList.add(mj);
        for(int i=0; i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }
        
    }

}
