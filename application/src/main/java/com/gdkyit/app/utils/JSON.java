package com.gdkyit.app.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {

    public static String toJsonString(Object obj){

        ObjectMapper mapper = new ObjectMapper();
        String result = "";
        try {
            result = mapper.writeValueAsString(obj);
        }catch (Exception e){

        }
        return result;
    }
}
