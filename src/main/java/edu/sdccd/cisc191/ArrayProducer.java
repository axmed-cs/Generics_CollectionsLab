package edu.sdccd.cisc191;

public class ArrayProducer {
    private String[] list;
    public ArrayProducer(String[] array)
    {
        list = array;
    }

    public void produce(int i, String string)
    {
        list[i] = string;
    }
}
