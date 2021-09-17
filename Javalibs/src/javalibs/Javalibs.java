/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;

import java.util.Scanner;

/**
 *
 * @author ldavoll
 */
public class Javalibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your first name: ");
        String firstName = sc.next();
        
        System.out.println("Please enter a person's name: ");
        String personsName1 = sc.next();
        
        System.out.println("Please enter a place to work: ");
        String jobFacility1 = sc.next();
        
        System.out.println("Please enter a verb: ");
        String verbED1 = sc.next();
        
        System.out.println("Please enter an adverb: ");
        String adverb1 = sc.next();
        
        System.out.println("Please enter a noun: ");
        String noun1 = sc.next();
        
        System.out.println("Please enter a noun: ");
        String noun2 = sc.next();
        
        System.out.println("Please enter a noun: ");
        String noun3 = sc.next();
        
        System.out.println("Please enter a noun: ");
        String noun4 = sc.next();
        
        System.out.println("Please enter a verb ending in \"ing\": ");
        String verbING1 = sc.next();

        System.out.println("Please enter an exclamation: ");
        String exclamation1 = sc.next();
        
        System.out.println("Please enter a type of liquid: ");
        String liquid1 = sc.next();
        
        System.out.println("Please enter an adverb: ");
        String adverb2 = sc.next();
        
        System.out.println("Please enter a number: ");
        int number1 = sc.nextInt();
        
        System.out.println("Please enter a noun: ");
        String noun5 = sc.next();
        
        System.out.println("Please enter a person's name: ");
        String personsName2 = sc.next();
        
        System.out.println("Please enter an item of interest: ");
        String objectOfInterest1 = sc.next();
        
        System.out.println("Please enter a noun: ");
        String noun6 = sc.next();
        
        System.out.println("Please enter an occupation: ");
        String occupation1 = sc.next();
        
        System.out.println("Please enter an item granting flight: ");
        String objectOfFlight1 = sc.next();
        
        System.out.println("Please enter an undesirable location: ");
        String undesirableLocation1 = sc.next();
        
        System.out.println("Here's your funny story "+firstName +".");
        System.out.println("Title: A strange job application");
        System.out.println(personsName1 +" went to "+ jobFacility1 +" to get a "
        + "job. However "+ personsName1 +" thought it was weird there was no "
        + "\none inside to let them in. The doors were all locked so they"
        + "\n"+ verbED1 +" through one of the windows "+ adverb1 +". They looked"
        + "\naround and it was just as they thought,there was no one in the"
        + "\nbuilding, not even behind the "+ noun1 +"! Then "+ personsName1 +""
        + "\nhears something from the back of the establishment. They walk into"
        + "\nthe "+ noun2 +" and saw that someone had left the "+ noun3 +" on and"
        + "\nthere was a "+ noun4 +" still on it, "+ verbING1 +"."
        + "\n\""+ exclamation1 +"! No one would leave the "+ noun3 +" on!\" "
        + "\n"+ personsName1 +" shouted. Then they heard a sound from the "
        + "\nstorage closet. It was only then they had noticed there "
        + "\nwas "+ liquid1 +" on and around the door. "+ personsName1 +" "
        + "\n"+ adverb2 +" opened the door to reveal "+ number1 +" "+ noun5 +", "
        + "\nbut that wasn't all! There was also a person in the closet! It was a "
        + "\nvery famous serial killer named "+ personsName2 +". They steal all "
        + "\nof the "+ objectOfInterest1 +" from the backs of "+ jobFacility1 +"'s "
        + "\nall over the country after killing everyone in sight! \"I thought I "
        + "\nkilled everyone, but I guess I was wrong!\" "+ personsName2 +" said "
        + "\nwhat they thought was a cool last one-liner. Then "+ personsName1 +""
        + "\npulled out a "+ noun6 +" and said \"Stop right there!\" "+ personsName1 +""
        + "\nwas acually an undercover "+ occupation1 +" looking for work!"
        + "\n\"You may have me cornered this time, but how will you handle THIS?!\""
        + "\n"+ personsName2 +" said as they pulled out a "+ objectOfFlight1 +""
        + "\nin an attempt to break through the ceiling. However, the ceiling"
        + "\nwas too tough and "+ personsName1 +" arrested them and took them"
        + "\nto "+ undesirableLocation1 +".");

    }
    
}
