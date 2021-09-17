class Student {
    //data members
    String name;
    int roll;
    float marks;

    void show() { //method
        System.out.println("name: " name,"roll: " roll,"marks: "marks)
    }

    public static void main(String[] args) {
        Student ob = new Student();

        Student ob - Student.main(String[])
        ob.show();
    }
} 

class StudentDrive {

    public static void main(String[] args) {
        Student ob1 = new Student();
        Student ob2 = new Student();
        Student ob3 = new Student();

        ob1.name = "Rabiya";
        ob2.roll = 20;
        ob3.marks = 88.32;
        ob1.show();
        ob2.show();
        ob3.show();

    }
}