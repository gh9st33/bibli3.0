/**
 * purpose- learn about interface 
 * Created by pi on 3/30/16.
 */
import java.util.ArrayList;
public class TestHomework2 {
    public static void main(String[] args) {
        // Calls the constructor of the MyMath class, which in turn
        // invokes the constructor of its superclass, the 'Homework' class
        ArrayList<Homework2>  arrayList = new ArrayList<Homework2>();
        MyMath2 one = new MyMath2();

        // Invokes the toString of the MyMath class. Since it does not have one,
        // The toString method of its superclass (Homework) is called.
        one.createAssignment(4);
        arrayList.add(one);


        MyScience2 ms = new MyScience2();

        // Invokes the toString of the MyMath class. Since it does not have one,
        // The toString method of its superclass (Homework) is called.
        ms.createAssignment(6);
        arrayList.add(ms);

        MyEnglish2 me = new MyEnglish2 ();

        // Invokes the toString of the MyMath class. Since it does not have one,
        // The toString method of its superclass (Homework) is called.
        me.createAssignment(10);
        arrayList.add(me);


        Myjava2 mj = new Myjava2 ();

        // Invokes the toString of the MyMath class. Since it does not have one,
        // The toString method of its superclass (Homework) is called.
        mj.createAssignment(5);
        arrayList.add(mj);
        for(int i=0; i<arrayList.size();i++)
        {
            System.out.println("Before Reading");
            System.out.println(arrayList.get(i));
            arrayList.get(i).doReading();
            System.out.println("After Reading");
            System.out.println(arrayList.get(i));
        }

    }

}
