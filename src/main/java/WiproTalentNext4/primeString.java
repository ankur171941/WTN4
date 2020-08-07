package WiproTalentNext4;

public class primeString {
    String primestring(String s) {
        String fina = "";
        int num = 2;
        if (s.length() > 2) {
            while (num < s.length()) {
                boolean flag = false;
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    fina = fina + s.charAt(num);

                num++;
            }
        } else {
            System.out.println("No Prime String Found");
        }
        return fina;
    }

    public static void main(String[] args) {
        primeString pp = new primeString();
        System.out.println(pp.primestring("good morning chitkara university"));
    }
}



