package za.ac.cput;

public class MapClass {
    public MapClass()
    {
    }

    public MapClass(int index, String colors)
    {
        this.index = index;
        this.colors = colors;
    }

    private int index;
    private String colors;

    public void setIndex(int index) {
        this.index = index;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
}
