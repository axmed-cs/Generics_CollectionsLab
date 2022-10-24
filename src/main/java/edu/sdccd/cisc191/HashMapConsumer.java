package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapConsumer {
    private HashMap<String, String> map;
    public HashMapConsumer(HashMap<String, String> hashMap)
    {
        map = hashMap;
    }

    public String consume(String string)
    {
       return map.get(string);
    }
}
