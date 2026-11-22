public class Const {
    public static void main(String[] args){

        Student s1 = new Student(); // default constructor
        // System.out.println(s1.name);  // null
        // System.out.println(s1.age); // 0
        // System.out.println(s1.rollNo); //0
        // System.out.println(s1.college); // null
        System.out.println(s1.name+" "+s1.age+" "+s1.rollNo+" "+s1.college); //TOM 21 11 IIT GUWAHTI

        Student s2 = new Student("Michael",22,122,"IITD");  
        System.out.println(s2.name+" "+s2.age+" "+s2.rollNo+" "+s2.college); // Michael 22 122 IITD
    }
    
}
class Student{
    String name;
    int age;
    int rollNo;
    String college;

    Student(){
        name="TOM";
        age=21;
        rollNo=11;
        college="IIT GUWAHTI";
    }

    Student(String s, int a, int rn, String c){
        name=s;
        age=a;
        rollNo=rn;
        college=c;
    }
    // using more than one constructors----> method overloading
    
}