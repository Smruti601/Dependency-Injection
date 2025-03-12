public class Sprrow {
    Bird bird;

    Sprrow(Bird bird1)
    {
        this.bird = bird1;
    }

    public void flyHigh()
    {
        int fly = bird.fly();

        if(fly >= 1)
        {
            System.out.println("Start Flying Higher...");
        }
    }
    public void flyLow()
    {
        int fly = bird.fly();

        if(fly >= 1)
        {
            System.out.println("Start Flying Lower...");
        }
    }
}
