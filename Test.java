public class Test {
    public static void main(String[] args)
    {
        Sprrow sprrow = new Sprrow(new LowFlyingBird());

        sprrow.flyLow();
        Sprrow sprrow2 = new Sprrow(new HighFlyingBird());
        sprrow2.flyHigh();
    }
}
