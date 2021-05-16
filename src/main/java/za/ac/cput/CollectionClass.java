package za.ac.cput;

import java.util.*;

public class CollectionClass {

    private Collection<Integer> runner = new ArrayList<Integer>() ;

    public  int addRunner(int number)
    {
        runner.add(number);
        return number;
    }
    public  int removerRunner(int number)
    {
        runner.remove(number);
        return number;
    }
    public  int findRunner(int number)
    {
        runner.contains(number);
        return number;
    }

    public int sizeOfArray()
    {
        return runner.size();
    }
}
