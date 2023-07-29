package com.ledningClub.deposits;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/* @RestController helps to Expose API in the class */
@RestController
public class MathController {
    /* Create GET API to add 2 numbers  */
   @GetMapping("add/{n1}/{n2}")
    public MathResponse add(@PathVariable int n1,@PathVariable int n2)
   {
       /*  show response in json format in http://localhost/8080/add/n1/n2  */
return new MathResponse(n1,n2,n1+n2);
   }
}
