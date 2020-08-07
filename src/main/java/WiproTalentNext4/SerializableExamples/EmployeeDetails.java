package WiproTalentNext4.SerializableExamples;

import java.io.*;

public class EmployeeDetails implements Serializable {
    String name;
    String d;
    String department;
    String designation;
    long salary;
EmployeeDetails ()
{

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    public static void main(String[] args)
    {
        EmployeeDetails employeeDetails =new EmployeeDetails();
        employeeDetails.setName("Ankur");
        employeeDetails.setDepartment("Account");
        employeeDetails.setSalary(100000);
   employeeDetails.setD("12/02/2020");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("emplo.log");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employeeDetails);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object Serialized");
        } catch (Exception e) {
            System.out.println("Inside catch");
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("emplo.log");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            EmployeeDetails employeeDetails1 = (EmployeeDetails) objectInputStream.readObject();
            System.out.println(employeeDetails1.getDepartment()+" "+ employeeDetails1.getName());


        } catch (Exception e) {
            System.out.println("inputstream");
        }
    }
}
