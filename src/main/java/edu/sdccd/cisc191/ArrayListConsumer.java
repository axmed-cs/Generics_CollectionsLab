package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer
{
private ArrayList<String> list;
    public ArrayListConsumer(ArrayList<String> arraylist)
    {
        list = arraylist;
    }

    public String consume()
    {

        return list.remove(0);
    }

}