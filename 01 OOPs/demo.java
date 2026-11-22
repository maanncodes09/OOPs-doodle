public class demo{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();

        s1.name="Tom";
        s1.age=22;
        s1.rollno=100;
        s1.college="SIT";

        s2.name="BOB";
        s2.age=21;
        s2.rollno=10;
        s2.college="SIT";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();

    }
}

class Student{
    String name;  // information/data/characterstics
    int age;
    int rollno;
    String college;

    void markAttendance(){ //behaviours
        System.out.println("Attendance marke by"+ name);
    }

    void print(){
        System.out.println(name + "," + age + "," + rollno + "," + college + "," );
    }
}

//JAVA IS ALMOST COMPLETE OBJECT PROGRAMMING