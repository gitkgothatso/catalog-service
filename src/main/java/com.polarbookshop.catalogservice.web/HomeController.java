package com.polarbookshop.catalogservice.web;

//@RestController
public class HomeController {

   // @GetMapping("/")
    public String welcome(){
        return "Welcome to the book catalog.";
    }
}
