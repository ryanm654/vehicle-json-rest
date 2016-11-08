package com.ryan.vehiclejsonrest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class VehicleRESTController {
    private final VehicleJSONHandler handler = new  VehicleJSONHandler("vehicles.json");

    @RequestMapping(value="/ex1", produces="text/plain")
    @ResponseBody
    public String ex1() {
      return handler.printAscending();
    }

    @RequestMapping(value="/ex2", produces="text/plain")
    @ResponseBody
    public String ex2() {
      return handler.printSpec();
    }

    @RequestMapping(value="/ex3", produces="text/plain")
    @ResponseBody
    public String ex3() {
      return handler.printHighestRated();
    }

    @RequestMapping(value="/ex4", produces="text/plain")
    @ResponseBody
    public String ex4() {
      return handler.printHighestScoring();
    }

}
