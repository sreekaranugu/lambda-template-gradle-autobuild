package com.sreekar;

import com.amazonaws.services.lambda.runtime.Context;

public class Main {

    public String handleRequest(Object input, Context context) {
        return "Hello World !!";
    }
}
