package com.example.felipemartins.waterhole;

class loginTask {

    String email, password;


    public loginTask(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Boolean efetuarLogin() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return true;

    }
}
