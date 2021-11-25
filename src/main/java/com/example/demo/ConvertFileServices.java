package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

@RestController
public class ConvertFileServices {


    String ApiUrl ="http://localhost:8082/stringInformation";

    @ResponseBody
    @RequestMapping(value = "/convertFile", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> convertFile(HttpServletRequest request) throws IOException, JSONException {

       if(request.getParameter("file_format").equals("TXT"))
       {

       }else if(request.getParameter("file_format").equals("XML"))
       {
           //<stringToCheck>'Where_is-1123!Banana'</stringToCheck>
           String sting =request.getParameter("file")
       }else if(request.getParameter("file_format").equals("JSON"))
       {

       }else if(request.getParameter("file_format").equals("CSV"))
       {

       }
        return  null;
    }


    @ResponseBody
    @RequestMapping(value = "/stringInformation", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> checkString(HttpServletRequest request) throws IOException, JSONException {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("string", request.getParameter("string"));
        map.add("format", request.getParameter("format"));

        HttpEntity<MultiValueMap<String, String>> req = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity( ApiUrl, req , String.class );
            return response;
        }catch (Exception e )
        {
            return null;
        }
    }
}
