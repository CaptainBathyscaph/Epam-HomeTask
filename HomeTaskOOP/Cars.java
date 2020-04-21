package HomeTaskOOP;

public abstract class Cars {
    protected String mark;
    protected String modelName;
    protected int yearOfIssue;
    protected int cost;

    public Cars(String mark, String modelName, int yearOfIssue, int cost) {
        this.mark = mark;
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.cost= cost;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "Mark = '" + mark + '\'' +
                ", Model Name = '" + modelName + '\'' +
                ", Year of issue = " + yearOfIssue +
                ", Cost = " + cost +
                '}';
    }
}
