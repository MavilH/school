
package data;
//Student.java: iD, nameStudent, dob, age, class, weight, height
public class Student {
    private String ID;
    private String nameStudent;
    private String dob;
    private int age;
    private String classroom;
    private int weight;
    private int height;
// phễu 1
    public Student(String ID, String nameStudent, String dob, int age, String classroom, int weight, int height) {
        this.ID = ID;
        this.nameStudent = nameStudent;
        this.dob = dob;
        this.age = age;
        this.classroom = classroom;
        this.weight = weight;
        this.height = height;
    }
// phễu 2
    public Student(String ID, String nameStudent) {
        this.ID = ID;
        this.nameStudent = nameStudent;
    }
// getter và setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
//    2 method print values
    public String printValues(int age){
        String str = String.format("Tuoi la: %d", age);
        return str;
    };

    public String printValues(String name, int age){
        String str = String.format("Tên: %s, tuoi: %d",name, age);
        return str;
    };
}
