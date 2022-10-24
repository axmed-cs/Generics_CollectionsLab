package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapProducer {
    private HashMap<String, String> map;
    public HashMapProducer(HashMap<String, String> hashMap)
    {
       map = hashMap;
    }

    public void produce(String key, String value)
    {
        map.put(key, value);
    }
}
