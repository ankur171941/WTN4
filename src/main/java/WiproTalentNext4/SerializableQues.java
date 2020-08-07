package WiproTalentNext4;

import java.io.*;

class democlass implements Serializable
{
    String name;
    transient int phoneno;
    String Designation;
    public democlass(String n, String d)
    {
        name = n;
        Designation = d;
    }
}
public class SerializableQues {
    public static void main(String args[]) {
        democlass dd = new democlass("Ankur","Employee");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file.log");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(dd);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object Serialized");
        } catch (Exception e) {
            System.out.println("Inside catch");
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("file.log");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            democlass democlas = (democlass) objectInputStream.readObject();
            System.out.println(democlas.phoneno+" "+ democlas.name);


        } catch (Exception e) {
            System.out.println("inputstream");
        }
    }
}
