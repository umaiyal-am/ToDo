package com.practice.ToDo.Controller;



public class ValitationUtility {

    public static boolean validateCredentials(String uname, String pass) {
       boolean result = false;
        uname = uname.strip();
        pass = pass.strip();
            if(! uname.isEmpty() && !pass.isEmpty())
                return true;
        return result;
    }
}
