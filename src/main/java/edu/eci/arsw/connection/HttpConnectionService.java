package edu.eci.arsw.connection;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.model.Airport;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class HttpConnectionService {
    public List<Airport> getAirportByName(String city)  {
        System.out.println("LLEGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text="+city)
                    .header("x-rapidapi-host", "cometari-airportsfinder-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", "1759ba3543msh66bafcef00a4184p15436ajsn800e6a99c56f")
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println(response.getBody().toString());
        Gson gson = new Gson();
        Type lis = new TypeToken<ArrayList<Airport>>(){}.getType();
        List<Airport> res = gson.fromJson(response.getBody(),lis);
        System.out.println("LLegaaaa  22222 ");
        System.out.println(res);
        return res;
    }

}
