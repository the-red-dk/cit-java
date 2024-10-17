// Lab3: Staff Hierarchy 

import java.util.Scanner;

class Staff {
    
    String id;
    String name;
    String salary;
    String phone;

    Scanner s = new Scanner(System.in);

    void setdata() {

        System.out.println("Enter Staff ID: ");
        id = s.next();

        System.out.println("Enter Staff Name: ");
        name = s.next();

        System.out.println("Enter Phone Number: ");
        phone = s.next();

        System.out.println("Enter Salary: ");
        salary = s.next();
    }

    void getdata() {
        System.out.println("Staff ID: " + id + "\tName: " + name + "\tPhone: " + phone + "\tSalary: " + salary);
    }
}   

class Teaching extends Staff {
    String publication;
    String domain;

    void setdata() {
        super.setdata();
        System.out.println("Enter domain: ");
        domain = s.next();

        System.out.println("Enter publication: ");
        publication = s.next();
    }

    void getdata() {
        super.getdata();
        System.out.println("Domain: " + domain + "\tPublication: " + publication);
    }
}

class Technical extends Staff {
    String skills;

    void setdata() {
        super.setdata();

        System.out.println("Enter skills: ");
        skills = s.next();
    }

    void getdata() {
        super.getdata();

        System.out.println("Skills: " + skills);
    }
}

class Contract extends Staff {
    String period;

    void setdata() {
        super.setdata();
        System.out.println("Enter period: ");
        period = s.next();
    }

    @Override 
    void getdata() {
        super.getdata(); 
        System.out.println("Period time: " + period);
    }
}

public class lab3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of staffs to be created: ");
        int n = s.nextInt();

        Teaching ts[] = new Teaching[n];
        Technical tech[] = new Technical[n];
        Contract c[] = new Contract[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter Teaching Staff Information: ");
            ts[i] = new Teaching();
            ts[i].setdata();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Enter Technical Staff Information: ");
            tech[i] = new Technical();
            tech[i].setdata();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Enter Contract Staff Information: ");
            c[i] = new Contract();
            c[i].setdata();
        }

        System.out.println("--------Staff Details---------");
        System.out.println("Teaching Staff Details: ");
        for(int i = 0; i < n; i++)
            ts[i].getdata();

        System.out.println("Technical Staff Details: ");
        for(int i = 0; i < n; i++)
            tech[i].getdata();

        System.out.println("Contract Staff Details: ");
        for(int i = 0; i < n; i++)
            c[i].getdata();

    }
}