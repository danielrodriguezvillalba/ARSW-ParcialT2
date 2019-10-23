package edu.eci.arsw.services;

import java.util.ArrayList;


public interface Services {

    public ArrayList<Object> allElements();

    public Object getElement( Object obj) throws Exception;
}