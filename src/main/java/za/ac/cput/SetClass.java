package za.ac.cput;

public class SetClass {

    public SetClass()
    {
    }

    public SetClass(int index, String city)
    {
        this.index = index;
        this.city = city;
    }

    private int index;
    private String city;

    public void setIndex(int index)
    {
        this.index = index;
    }

    public void setName(String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "ListClass{" +
                "index=" + index +
                ", name='" + city + '\'' +
                '}';
    }
}
