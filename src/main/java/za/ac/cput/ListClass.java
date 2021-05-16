package za.ac.cput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ListClass {
    public ListClass() {

    }

    public ListClass(int index, String name) {
        this.index = index;
        this.name = name;
    }

    private int index;
    private String name;

    public void setIndex(int index)
    {
        this.index = index;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ListClass{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }
}
