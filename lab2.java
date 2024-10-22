import java.util.Scanner;


class Student {
    String usn, name, branch, phone;

    Scanner s = new Scanner(System.in);
    void setdata() {   

        System.out.println("USN: ");
        usn = s.next();
        
        System.out.println("Enter Student Name: ");
        name = s.next();

        System.out.println("Enter Phone: ");
        phone = s.next();

        System.out.println("Enter branch: ");
        branch = s.next();
    }

    void getdata() {
        System.out.println("USN: " + usn + " | Name: " + name + " | Phone: " + phone + " | Branch: " + branch + "\n");
    }
}

public class lab2 {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int n = s.nextInt();

        Student[] s1 = new Student[n];

        for(int i = 0; i < n; i++) {
            s1[i] = new Student();
        }

        for(int i = 0; i < n; i++) {
            s1[i].setdata();
        }

        for(int i = 0; i < n; i++) {
            s1[i].getdata();
        }
    }
}