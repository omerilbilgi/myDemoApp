package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App
{
  public static int findMostFrequentNumber(String text, Integer number1, Integer number2, ArrayList<Integer> additionalNumbers) {
    // 1. Extract all integers from the text (assuming comma separated)
    Set<Integer> allNumbers = new HashSet<>();
    for (String numberString : text.split(",")) {
      try {
        int number = Integer.parseInt(numberString);
        allNumbers.add(number);
      } catch (NumberFormatException e) {
        // Ignore non-integer strings
      }
    }
    
    // 2. Add the provided parameters
    allNumbers.add(number1);
    allNumbers.add(number2);
    if (additionalNumbers != null) {
      allNumbers.addAll(additionalNumbers);
    }
    
    // 3. Find the number with the highest frequency
    int mostFrequentNumber = -1;
    int maxCount = 0;
    for (int number : allNumbers) {
      int count = Collections.frequency(allNumbers, number);
      if (count > maxCount) {
        maxCount = count;
        mostFrequentNumber = number;
      }
    }
    
    // 4. Return the most frequent number
    return mostFrequentNumber;
  }
  
    public static void main(String[] args) {
      port(getHerokuAssignedPort());

      get("/", (req, res) -> "Hello, World");

      post("/compute", (req, res) -> {
        //System.out.println(req.queryParams("input1"));
        //System.out.println(req.queryParams("input2"));

        String input1 = req.queryParams("input1");
        java.util.Scanner sc1 = new java.util.Scanner(input1);
        sc1.useDelimiter("[;\r\n]+");
        java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
        while (sc1.hasNext())
        {
          int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
          inputList.add(value);
        }
        System.out.println(inputList);


        String input2 = req.queryParams("input2").replaceAll("\\s","");
        int input2AsInt = Integer.parseInt(input2);

        boolean result = App.search(inputList, input2AsInt);

       Map map = new HashMap();
        map.put("result", result);
        return new ModelAndView(map, "compute.mustache");
      }, new MustacheTemplateEngine());


      get("/compute",
          (rq, rs) -> {
            Map map = new HashMap();
            map.put("result", "not computed yet!");
            return new ModelAndView(map, "compute.mustache");
          },
          new MustacheTemplateEngine());
  }

  static int getHerokuAssignedPort() {
      ProcessBuilder processBuilder = new ProcessBuilder();
      if (processBuilder.environment().get("PORT") != null) {
          return Integer.parseInt(processBuilder.environment().get("PORT"));
      }
      return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
