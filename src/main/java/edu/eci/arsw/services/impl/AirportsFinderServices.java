package edu.eci.arsw.services.impl;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.cache.AirportsFinderCache;
import edu.eci.arsw.connection.HttpConnectionService;
import edu.eci.arsw.model.Airport;
import edu.eci.arsw.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportsFinderServices implements Services {
    @Autowired
    HttpConnectionService httpConnection;

    @Autowired
    AirportsFinderCache cache;

    public List<Airport> getAirportByName(String city) throws UnirestException {
        List respuesta = null;

        if(!cache.estaEnCache(city)) {
            respuesta = httpConnection.getAirportByName(city);
            cache.agregueKey(city, respuesta);
        }
        else {
            respuesta = cache.getValor(city);
        }
        return respuesta;
    }

    @Override
    public ArrayList<Object> allElements() {
        return null;
    }

    @Override
    public Object getElement(Object obj) throws Exception {
        return null;
    }
}
