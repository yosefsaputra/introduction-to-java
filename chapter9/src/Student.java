class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;

    static int numberOfStudent = 0;

    Student(){
        numberOfStudent++;
    }
}

class TestStudent{
    public static void main(String[] args){
        Student student1 = new Student();
        System.out.println("name? " + student1.name);
        System.out.println("age? " + student1.age);
        System.out.println("isScienceMajor? " + student1.isScienceMajor);
        System.out.println("gender? " + student1.gender);

        System.out.println("Number of Students? " + student1.numberOfStudent);

        Student student2 = new Student();
        System.out.println("name? " + student2.name);
        System.out.println("age? " + student2.age);
        System.out.println("isScienceMajor? " + student2.isScienceMajor);
        System.out.println("gender? " + student2.gender);

        System.out.println("Number of Students? " + student2.numberOfStudent);
        System.out.println("Number of Students? " + Student.numberOfStudent);
    }
}
