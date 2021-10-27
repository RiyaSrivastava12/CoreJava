/**
 * Accepts the marks of students as a Hashmap and return the details of the students
 * eligible for the medals along with type of medal. 
 */
package lab6;

import java.util.HashMap;
import java.util.Set;
public class Exercise4
{
       public HashMap<String,String> getStudents(HashMap<String,Integer> stu)
       {
    	      //Here Hashmap contain the student registration number as key and the medal type as value.
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
    	      //Here Hashmap contains the student registration number as key and mark as value.
              HashMap<String,Integer> stu = new HashMap<>();
              Exercise4 p = new Exercise4();
              stu.put("R123",65);
              stu.put("R124",76);
              stu.put("R125",89);
              stu.put("R126",90);
              stu.put("R127",93);
              System.out.println(p.getStudents(stu));
       }
}
