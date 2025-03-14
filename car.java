public class car
{
    private Engine engine;

    public void drive() {
        int start = engine.start();
        if (start >= 1) {
            System.out.println("Car is running...");
        }
        else
        {
            System.out.println("Car is not starting...");
        }
    }
}
