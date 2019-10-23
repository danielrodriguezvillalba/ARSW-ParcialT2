package edu.eci.arsw.cache;

import edu.eci.arsw.model.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class AirportsFinderCache {
    private ConcurrentHashMap<String, List<Airport>> cache = new ConcurrentHashMap<>();

    public void agregueKey(String key, List<Airport> value){
        cache.put(key,value);
    }

    public boolean estaEnCache(String key){
        return cache.containsKey(key);
    }

    public List getValor(String city) {
        return cache.get(city);
    }

}
