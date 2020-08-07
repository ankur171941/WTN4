package WiproTalentNext4;

import java.io.*;

public class Copy_one_file_to_Other implements Serializable {
    public static void main(String[] args)
    {
//        EmployeeDetails employeeDetails =new EmployeeDetails();
//        employeeDetails.setName("Ankur");
//        employeeDetails.setDepartment("Account");
//        employeeDetails.setSalary(100000);
//        employeeDetails.setD("12/02/2020");
        try {
            FileReader fileReader = new FileReader("emplo.log");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("employcopy.log",true);
            String s;
            while((s = bufferedReader.readLine())!=null)
            {
                fileWriter.write(s);
                fileWriter.flush();
            }
            bufferedReader.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Inside catch");
        }

    }

}
