package edu.sdccd.cisc191;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetConsumer {
    private HashSet<String> set;
    public HashSetConsumer(HashSet<String> hashSet)
    {
        set = hashSet;
    }

    public boolean consume(String string)
    {
        return set.remove(string);
    }
}
