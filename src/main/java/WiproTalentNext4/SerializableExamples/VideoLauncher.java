package WiproTalentNext4.SerializableExamples;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args)
    {
        VideoStore videoStore = new VideoStore();
        Scanner sc = new Scanner(System.in);
        int n=1;
        do
        {
        System.out.println("MAIN MENU");
                System.out.println("============");
        System.out.println("1. Add Videos");
        System.out.println("2. Check Out Video");
        System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
        System.out.println("5. List Inventory");
        System.out.println("6. Exit");
        System.out.print("Enter your choice (1..6):");
        n = sc.nextInt();

        switch (n) {
            case 1:
                videoStore.addVideo(sc.next());
                break;
            case 2:
                System.out.println("Enter the name of the video you want to check out: ");
                videoStore.doCheckout(sc.next());
                break;
            case 3:
                System.out.println("Enter the name of the video you want to Return: ");
                videoStore.doReturn(sc.next());
                break;
            case 4:
                System.out.println("Enter the name of the video you want to Rate ");
                String f = sc.next();
                System.out.println("Enter the rating for this video: ");
                int ff = sc.nextInt();
                videoStore.receiveRating(f, ff);
                break;
            case 5:
                videoStore.listinventory();
                break;
            case 6:
                System.out.println("Enter Thanks for using app");
                System.exit(1);
        }

        }while(!(n==6));
        sc.close();
    }
}
