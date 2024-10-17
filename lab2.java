// Lab2: Student Database program;

import java.util.Scanner;

class Student {
        String usn;
        String name;
        String phone;
        String branch;

        void setdata() {

            Scanner s = new Scanner(System.in);
            System.out.println("Enter the student USN: ");
            usn = s.next();

            System.out.println("Enter the student name: ");
            name = s.next();

            System.out.println("Enter branch: ");
            branch = s.next();

            System.out.println("Enter phone number: ");
            phone = s.next();
        }

        void getdata() {
            System.out.println("-------------Student Details-------------");
            System.out.println("USN: " + usn + "\tName: " + name + "\tBranch: " + branch + "\tPhone: " + phone);
            // "\t" are optional, you can just use spaces instead
    }
}

public class lab2 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setdata();
        s1.getdata();
    }
}