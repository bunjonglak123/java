/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

/**
 *
 * @author bunjo
 */
public class pop {
    public static void main(String[] args){
        int sec = 5*365*24*60*60;
	int birth = sec/7;
	int death = sec/13;
	int immi = sec/45;
	int pop = (312032486+birth-death+immi);
	System.out.printf("%d",pop);
    }
}
