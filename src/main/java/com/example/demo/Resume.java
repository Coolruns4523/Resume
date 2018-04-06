package com.example.demo;


import java.util.ArrayList;
import java.util.Scanner;

public class Resume {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        Person p;
        EducationAchievement e;
        Experience h;
        Skills s;

        ArrayList<Person> persons = new ArrayList<>();
        String answer = "";


        boolean stop = false;

        do {


            p = new Person();


            System.out.println("Enter Name ");
            p.setName(scan.nextLine());

            System.out.println("Enter email address: ");
            p.setEmailAddress(scan.nextLine());


                    e = new EducationAchievement();
                    h = new Experience();
                    s = new Skills();


                    System.out.println("Enter educational achievements: ");
                    e.setEducation(scan.nextLine());
                    scan.nextLine();

                    System.out.println("Enter years of experience: ");
                    h.setExperience(scan.nextLine());
                    scan.nextLine();

                    System.out.println("Enter skills");
                    s.setSkills(scan.nextLine());
                    scan.nextLine();



            persons.add(p);


            System.out.println(p.getName());
            System.out.println(p.getEmailAddress());
            System.out.println();
            System.out.println("Education");
            System.out.println(e.getEducation());
            System.out.println();
            System.out.println("Experience");
            System.out.println(h.getExperience());
            System.out.println();
            System.out.println("Skill");
            System.out.println(s.getSkills());

            System.out.println("Your resume have been completed");
            System.out.println("Would you like to create another resume?");

            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no"))
                stop = true;
            {
                stop = false;
            }
        } while (!stop);

        for (Person eachPerson : persons)
        {
            System.out.println("Here's your Resume!!");
            System.out.println("Name     "+p.getName());
            System.out.println("Email    " + p.getEmailAddress());
            System.out.println("Education    " + e.getEducation());
            System.out.println("Experience    " + h.getExperience());
            System.out.println("Skill     " + s.getSkills());



        }


        {
            System.out.println();
        }
    }
}




