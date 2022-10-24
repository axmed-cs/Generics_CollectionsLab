package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetProducer {
    private HashSet<String> set;
    public HashSetProducer(HashSet<String> hashSet)
    {
        set = hashSet;
    }

    public boolean produce(String string)
    {
       return set.add(string);
    }
}
