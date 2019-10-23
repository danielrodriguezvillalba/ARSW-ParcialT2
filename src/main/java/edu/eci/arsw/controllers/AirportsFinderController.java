package edu.eci.arsw.controllers;

import edu.eci.arsw.services.impl.AirportsFinderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/airports")
public class AirportsFinderController {

    @Autowired
    private AirportsFinderServices services;



    @RequestMapping(method = RequestMethod.GET, path ="/{city}" )
    public ResponseEntity<?> getAirportByName( @PathVariable String city) {
        try {
            //System.out.println(city);
            return new ResponseEntity<>(services.getAirportByName(city), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AirportsFinderController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error bla bla bla", HttpStatus.FORBIDDEN);
        }
    }
}
