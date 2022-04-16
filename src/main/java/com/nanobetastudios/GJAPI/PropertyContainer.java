package com.nanobetastudios.GJAPI;

import java.util.HashMap;

public class PropertyContainer {
    private HashMap<String, String> properties;

    public PropertyContainer(PropertyContainer other){
        properties = new HashMap<>();
        properties.putAll(other.getProperties());
    }

    public PropertyContainer(){
        properties = new HashMap<String, String>();
    }

    public void addProperty(String key, String value){
        properties.put(key, value);
    }

    public String getProperty(String key){
        return properties.get(key);
    }

    public HashMap<String, String> getProperties(){
        return properties;
    }
}
