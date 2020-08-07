package WiproTalentNext4.SerializableExamples;

public class Video {
    String videoName;
    boolean checkout;
    int rating;
    Video(String name)
    {
        videoName = name;

    }
    public String getName()
    {
        return videoName;
    }
    public void doCheckout()
    {
        checkout = true;

    }
    public void doReturn()
    {
        checkout = false;
    }
    public void receiveRating(int rating)
    {
        this.rating = rating;
    }
    public boolean getCheckout() {
        return checkout;
    }

    public int getRating() {
        return rating;
    }
}
