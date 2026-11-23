public class This {
    public static void main(String[] args) {
        Student s1 = new Student("Mohan",21,111,"IIT D");
    //     System.out.println(s1.name);
    //     System.out.println(s1.age);
    //     System.out.println(s1.rollNumber);
    //     System.out.println(s1.college);
    // }
    }
}

class Student {
    String name; 
    int age; 
    int rollNumber;
    String college;

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
    
}

// this keyword refers to our current object, it stores current object reference variable
