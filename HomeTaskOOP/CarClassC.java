package HomeTaskOOP;

public class CarClassC extends Cars {
    public CarClassC (String mark, String modelName, int yearOfIssue, int cost )
    {
        super(mark, modelName, yearOfIssue, cost);
    }
    public void printDescription()
    {
        System.out.println("Class C is Medium cars ");
    }
}
