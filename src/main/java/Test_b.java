
import java.util.ArrayList;
import org.joda.time.DateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack
 */
public class Test_b {
    
    public static void main(String args[])
    {
        
        ArrayList<Student> enrollment = new ArrayList<Student>();
        DateTime s1_start_date = new DateTime(2014,4,9 , 9 , 0 , 0 , 0 );
        DateTime s1_finish_date = new DateTime(2018, 6 , 5 , 12 , 0 , 0 , 0 );
        Student s1 = new Student("Sean","Kelly","15 Nov 1996", 1443535, 20, "Computer Science and IT",s1_start_date , s1_finish_date, "Programming","CT213" );
        
        DateTime s2_start_date = new DateTime(2014,4,9 , 12 , 0 , 0 , 0 );
        DateTime s2_finish_date = new DateTime(2018,6,5 , 12 , 0 , 0 , 0 );
        Student s2 = new Student("Clare","OD","29 Sept 1998", 1436767, 19, "Computer Science and IT",s2_start_date , s2_finish_date, "Software Eng","CT666" );
        
        enrollment.add(s1);
        enrollment.add(s2);
        
       System.out.println(enrollment.toString());

        
        
    }
}
