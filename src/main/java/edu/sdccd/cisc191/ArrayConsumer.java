package edu.sdccd.cisc191;


public class ArrayConsumer {

    private String[] list;
    private int index = 0;
    public ArrayConsumer(String[] array)
    {
        list = array;
    }

    public String consume()
    {
        String object = list[index];
        list[index] = null;
        index++;
        return object;
    }
}
