/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Brad
 */
public class Eliza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    while(true){
        String user;
        System.out.println("Please talk about your feelings, I'm definetly listening");
        user = input.nextLine();
      //  System.out.println(user);
        if(user.equals("Goodbye")){
            System.out.println("I'll be waiting for our next session.");
            break;
        }
        char space;
        for(int x=0;x != user.length();x++){
            space = user.charAt(x);
            if(space == ' '||x==0){
                //System.out.println(user.substring(x+1,x+3));
               if(space == ' '){
                   x++;
                   
               }
                if(user.substring(x,x+4).equals("love")  || user.substring(x,x+4).equals("hate")){
                    System.out.println("You seem to have strong feelings about that");
                    break;
                }
                
                else if(user.substring(x,x+2).equals("my")){
                    int y;
                    char my = 'a';
                    for(y=x+4; my != ' '&&y != user.length();y++){
                        my = user.charAt(y);
                       // System.out.println(my);
                    }
                    y++;
                    String catchNoun;
                    //System.out.println(y + user.substring(x+4));
                    catchNoun  = user.substring(x+3,y-1);
                    System.out.println("Tell me more about your " + catchNoun);
                    break;
                }
            
            
            }
        
        
        }
      //outside first forloop  
        Random randomPhrase = new Random(1);
        randomPhrase.nextInt(3);
        int num;
        num = randomPhrase.nextInt(3);
        if(num==1){
            System.out.println("Please go on!");
        }
        else if(num==2){
        System.out.println("Tell me more!");
        }
        else if (num==3){
            System.out.println("Continue!");
        }
    }
  
    
    
    }
    
}
