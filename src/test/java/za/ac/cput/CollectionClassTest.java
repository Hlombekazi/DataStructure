package za.ac.cput;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import java.util.*;
import org.junit.jupiter.api.Test;


class CollectionClassTest {


    // Testing Collection Class
    //Creating an object for collectionClass
    CollectionClass col = new CollectionClass();

    @Test
    public void testCollection()
    {
        col.addRunner(30);
        col.addRunner(45);
        col.addRunner(95);
        Assertions.assertEquals(3,col.sizeOfArray()," The runner has been added");

        col.removerRunner(95);
        Assertions.assertEquals(2,col.sizeOfArray(), " Runner has been removed");

        col.findRunner(30);
        col.findRunner(45);
        Assertions.assertEquals(2, col.sizeOfArray(), "Both runners are found");
    }

    //Test for ListClass
    @Test
    public void testList()
    {
        List<ListClass> list = new LinkedList<>();

        list.add(new ListClass(1 , "Hlombekazi"));
        list.add(new ListClass(2 , "Mbelu"));
        list.add(new ListClass(3, "Sinelitha"));


        ListClass sinelitha = new ListClass(3 , "Sinelitha");
        ListClass lukhona = new ListClass(0, "Lukhona");

        if (list.contains(sinelitha))
        {
            Assertions.assertSame(3 , sinelitha );
        }
        else if(list.remove(sinelitha))
        {
            Assertions.assertEquals(3 , sinelitha);
        }
        else if(list.add(lukhona))
        {
            Assertions.assertSame(lukhona , lukhona);
        }

    }

    //Test for MapClass
    @Test
    public void testMapClass()
    {
        HashMap<Integer , MapClass> colors = new HashMap<>();

        MapClass map1 = new MapClass(1 , "Yellow");
        MapClass map2 = new MapClass(2 , "Black");
        MapClass map3 = new MapClass(3 , "Red");

        colors.put(1 , map1);
        colors.put(2, map2);
        colors.put(3 , map3);

        Assertions.assertTrue(colors.containsValue(map1));

        Assertions.assertEquals(map1 , colors.remove(map1));

        Assertions.assertSame(map2 , colors.get(2));


    }

    //Testing the SetClass
    @Test
    public void testSet()
    {
        HashSet<SetClass> set = new HashSet<>();

        set.add(new SetClass(1 , "CapeTown"));
        set.add(new SetClass(2 , "KingWillie"));
        set.add(new SetClass(3, "EastLondon"));


        SetClass cape = new SetClass(3 , "Sinelitha");
        SetClass west = new SetClass(0, "Lukhona");
        if (set.contains(cape))
        {
            Assertions.assertSame(3 , cape );
        }
        else if(set.remove(cape))
        {
            Assertions.assertEquals(3 , cape);
        }
        else if(set.add(west))
        {
            Assertions.assertSame(west , west);
        }

    }



}