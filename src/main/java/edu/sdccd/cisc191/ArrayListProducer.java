
package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer
{
    private ArrayList<String> list;
    public ArrayListProducer(ArrayList<String> arraylist)
    {
        list = arraylist;
    }

    public void produce(int i, String string)
    {
        list.add(i,string);
    }
}