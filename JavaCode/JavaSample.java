package JavaCode;
import java.util.Scanner;

public class JavaSample{
    public static void main(String args[]){

    System.out.println("hello javatpoint");

    Student stud1 = new Student();

   stud1.studentDetails();

    }


}

class Student{
    
    int age=10, phone=808748355 ;
    String emailId="vips@gmail.com";

    void studentDetails(){
        System.out.println(age);
        System.out.println(phone);
        System.out.println(emailId);
        

    }


}
    

// class student 
// age 
// phone 
// emailid
// print result