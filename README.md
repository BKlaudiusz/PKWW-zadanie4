# PKWW-zadanie4
### This REST API convert format(CSV, JSON, XML,TXT) to selected format(CSV, JSON, XML,TXT)

`POST /convertFile`

    Put in body reqest two parameters
    body{
      "file": *Your file to format*,
      "file_format": **your format src** , //available format CSV, JSON, XML,TXT
      "out_format": **output format** ,  //available format CSV, JSON, XML,TXT
      }
      
      example:
       body{
        "file": "upperCase=2 \n  stringToCheck='Where_is-1123!Banana' \n  lowerCase=11 \n  countNumber=4 \n  specialMarks=3 \n  hasCombination=true \n",
        "file_format": "CSV",
        "out_format": "JSON",
      }
      
 **errors**
 
    Response: null
    
    
    
# Poprawa Zadania 3 

### This REST API provides you informations about string you passed, in selected format(CSV, JSON, XML)

`POST /stringInformation`

    Put in body reqest two parameters
    body{
      "string": *Your String you pass*,
      "format": **selected format** ,
      }
      
      example:
       body{
        "string": "Where_is-1123!Banana,
        "format": "CSV", //available format CSV, JSON, XML,TXT
      }

`Response for selected format/stringInformation`

 **TXT**
    {
    upperCase:2
    stringToCheck:'Where_is-1123!Banana'
    lowerCase:11
    countNumber:4
    specialMarks:3
    hasCombination:true"
    }
   
 **CSV**
 
    {
    "data": "upperCase=2 \n  stringToCheck='Where_is-1123!Banana' \n  lowerCase=11 \n  countNumber=4 \n  specialMarks=3 \n  hasCombination=true \n  "
    }
   
      
 **JSON**
    
    {
      "data": 
        "Analysis{
          upperCase=2,
          stringToCheck='Where_is-1123!Banana',
          lowerCase=11,
          countNumber=4,
          specialMarks=3,
          hasCombination=true
      }"
    }
      
 **XML**
 
 Response:
    
    {
    "data": "
        <?xml version="1.0" encoding="UTF-8" standalone="no"?>
        <upperCase>2</upperCase>
        <stringToCheck>'Where_is-1123!Banana'</stringToCheck>
        <lowerCase>11</lowerCase>
        <countNumber>4</countNumber>
        <specialMarks>3</specialMarks>
        <hasCombination>true</hasCombination>"
    }
    
 **errors**
 
    Response: null
