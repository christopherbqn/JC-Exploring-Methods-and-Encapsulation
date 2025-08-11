package org.example;

public class User {

    private String password;

   public User(String initialPassword){
       this.setPassword(initialPassword);
   }

    public String getPassword() {
        if(this.password != null && !this.password.isEmpty()){
            return "*****************";
        }else{
            return "No valid Password set.";
        }
    }

    public void setPassword(String password){

        if(password != null && password.length() >= 8){
            this.password = password;
        }else{
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }


}
