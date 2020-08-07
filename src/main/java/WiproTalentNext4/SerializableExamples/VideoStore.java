package WiproTalentNext4.SerializableExamples;

public class VideoStore {

    Video [] store = new Video[99];
    int count=0;
    void addVideo(String name)
    {
        store[count] = new Video(name);
        count++;
    }
    void doCheckout(String name)
    {
        int k=search(name);
        store[k].doCheckout();

    }
    void doReturn(String name)
    {
        int k = search(name);
        store[k].doReturn();
    }
    void receiveRating(String name,int rating)
    {
        int k =search(name);
        store[k].receiveRating(rating);
    }
    void listinventory() {
        for (int i = 0; i < count; i++) {
            System.out.println(store[i].getName()+" "+ store[i].getRating() + " "+ store[i].getCheckout());
        }
    }
    int search(String name)
    {
        int found =0;
        for(int i=0;i<count;i++)
        {
            if(store[i].videoName.equals(name))
            {
                found = i;
            }
        }
        return found;
    }


}
