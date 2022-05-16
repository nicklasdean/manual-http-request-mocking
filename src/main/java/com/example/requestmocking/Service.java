package com.example.requestmocking;

import org.springframework.web.context.request.WebRequest;

public class Service {
    public String getRequestAndPrintSomething(WebRequest wr){
        return wr.getParameter("name");
    }
}
