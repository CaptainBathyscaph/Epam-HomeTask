package HomeTaskOOP;

public class CarClassJ extends Cars  {

    public CarClassJ(String mark, String modelName, int yearOfIssue, int cost) {
        super(mark, modelName, yearOfIssue, cost);
    }

    public void printDescription()
    {
        System.out.println("Class J is Sport Utility Vehicle ");
    }
}
