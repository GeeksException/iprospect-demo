package org.geeksexception.iprospect.main;

import static spark.Spark.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class Main {

	public static void main(String[] args) {
		staticFileLocation("/public");
		
		get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });
	}

}