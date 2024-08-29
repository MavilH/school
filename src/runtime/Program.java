
package runtime;

import data.Student;
import data.Teacher;

public class Program {

    public static void main(String[] args) {
        Student st1 = new Student("SE1234", "Duy Đẹp Trai");
        Student st2 = new Student("SE1111", "Khoa Quy Nhơn", "2004", 20, "202", 60, 172);
        Teacher tc1 = new Teacher("TE1234", "Hog bt nữa", "SE", 24);
        
//        setter student
        st2.setAge(21);
        st2.setClassroom("203c");
        st2.setDob("2003");
        st2.setHeight(174);
        st2.setID("SE123432");
        st2.setNameStudent("hmmmm");
        st2.setWeight(100);
//        getter student
        System.out.println("STUDENT SAU SETTER");
        System.out.println(st2.getAge());
        System.out.println(st2.getClassroom());
        System.out.println(st2.getDob());
        System.out.println(st2.getHeight());
        System.out.println(st2.getID());
        System.out.println(st2.getNameStudent());
        System.out.println(st2.getWeight());
        
//        setter teacher
        tc1.setAge(25);
        tc1.setId("TE12345");
        tc1.setMajor("AI");
        tc1.setTeacherName("Lê J đó");
//        getter teacher
        System.out.println("TEACHER SAU SETTER");
        System.out.println(tc1.getAge());
        System.out.println(tc1.getId());
        System.out.println(tc1.getMajor());
        System.out.println(tc1.getTeacherName());
        
        System.out.println(method.calculateBMIOfStudent(st2.getHeight(), st2.getWeight()));
        System.out.println(st2.printValues(st2.getAge()));
        System.out.println(st2.printValues("Lê Dy", 18));
        
    }
    
}
