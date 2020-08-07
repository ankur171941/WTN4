package WiproTalentNext4.CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class Student {
    int rno;
    int phone;
    int noofsubjects;
    String name, address;

//    public int getRno() {
//        return rno;
//    }
//
//    public void setRno(int rno) {
//        this.rno = rno;
//    }
//
//    public int getPhone() {
//        return phone;
//    }
//
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }
//
//    public int getNoofsubjects() {
//        return noofsubjects;
//    }
//
//    public void setNoofsubjects(int noofsubjects) {
//        this.noofsubjects = noofsubjects;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    public static void main(String [] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        Set<Student> students = new HashSet<Student>();
//        int k=0;
//        while(k<5) {
//            Student s1 = new Student();
//            s1.setRno(sc.nextInt());
//            s1.setPhone(sc.nextInt());
//            s1.setNoofsubjects(sc.nextInt());
//            s1.setName(sc.next());
//            s1.setAddress(sc.next());
//                    students.add(s1);
//                    k++;
//        }
//        System.out.println(students.size());
//System.out.println(students);
//
//    }


    Student(int r, int ph, String nam, String add)  //need to override "boolean equals" method and "int hashcode" method
    {
        rno = r;
        phone = ph;
        name = nam;
        address = add;
    }

    public boolean equals(Object o)   //we have to specify/override the equals methods in case of "set of objects"
    {
        Student s = (Student)o;
        if(this == o) //s1.equals(s1)
            return true;
        else if(o==null || o.getClass()!=this.getClass())
            return false;
        else if(this.rno==s.rno && this.phone==s.phone && this.name == s.name && this.address==((Student) o).address)
            return true;
        else
            return false;
    }
    public int hashCode()
    {
        return this.rno;
    }
    public static void main(String [] args)
    {
       Set s = new HashSet();
       Student s1 = new Student(1,12,"aa","bb");
Student s2 = new Student(1,12,"aa","bb");
Student s3 = new Student(2,13,"nn","cc");
Student s4 = new Student(2,13,"nn","cc");
Student s5 = new Student(3,43,"nc","dc");
s.add(s1);
s.add(s2);
s.add(s3);
s.add(s4);
s.add(s5);
System.out.println(s.size());
    }
}
