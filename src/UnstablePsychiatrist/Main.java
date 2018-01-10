package UnstablePsychiatrist;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CodeHs_reader input = new CodeHs_reader();

        Psychiatrist psych;
        String Username = input.readLine("What's your name?: ");

        //Code for randomly selecting your psychiatrist
        Random rand = new Random();
        int pickPsychiatrist =   rand.nextInt(3) + 1;

        if (pickPsychiatrist == 1) {
            psych = new Psychiatrist("Aaron", 46, "My parents died in a car crash when I was 5");
        } else if (pickPsychiatrist == 2) {
            psych = new Psychiatrist("Barbara", 42, "My dad left my family when I was 6 and I have been " +
                    "searching for a man to take his place my whole life");
        } else {
            psych = new Psychiatrist("Charles", 55, "My whole family is dead now after our plane crashed on our" +
                    "way to Mexico, my life is over.");
        }

        System.out.println(psych.greet());

        String firstResponse = input.readLine("How has your day been " + Username + "?: ");
        if ((firstResponse).toLowerCase().contains("i'm ok") || (firstResponse).toLowerCase().contains("its been ok")
                || (firstResponse).toLowerCase().contains("im ok") || (firstResponse).toLowerCase().contains("its been fine")
                || (firstResponse).toLowerCase().contains("im alright") || (firstResponse).toLowerCase().contains("it's been ok")
                || (firstResponse).toLowerCase().contains("its been alright")) {
            String clientResponse1 = input.readLine("Well why are you just ok?: ");

            for (String trigger : psych.triggers.keySet()) {
                if (clientResponse1.toLowerCase().contains(trigger.toLowerCase())) {
                    String response = psych.triggers.get(trigger);
                    System.out.println(response);
                    input.readLine("");
                }
            }
        } else if ((firstResponse).toLowerCase().contains("i'm good") || (firstResponse).toLowerCase().contains("im good")
                 || (firstResponse).toLowerCase().contains("i'm alright") || (firstResponse).toLowerCase().contains("good")
                || (firstResponse).toLowerCase().contains("its been good") || (firstResponse).toLowerCase().contains("it was good")
                || (firstResponse).toLowerCase().contains("awesome") || (firstResponse).toLowerCase().contains("great")
                || (firstResponse).toLowerCase().contains("fantastic") || (firstResponse).toLowerCase().contains("chill")) {
            input.readLine("Why was it good?: ");
            System.out.println("Well that's good. ");
            String clientResponse1 = input.readLine("So why did you come talk to me today?: ");

            for (String trigger : psych.triggers.keySet()) {
                if (clientResponse1.toLowerCase().contains(trigger.toLowerCase())) {
                    String response = psych.triggers.get(trigger);
                    System.out.println(response);
                    input.readLine("");
                }
            }

        } else if ((firstResponse).toLowerCase().contains("bad") || (firstResponse).toLowerCase().contains("not so good")
                || (firstResponse).toLowerCase().contains("awful") || (firstResponse).toLowerCase().contains("it's been terrible")
                || (firstResponse).toLowerCase().contains("not good") || (firstResponse).toLowerCase().contains("not good")) {
            String clientResponse1 = input.readLine("That sucks, why hasn't your day been good?");

            for (String trigger : psych.triggers.keySet()) {
                if (clientResponse1.toLowerCase().contains(trigger.toLowerCase())) {
                    String response = psych.triggers.get(trigger);
                    System.out.println(response);
                    input.readLine("");
                }
            }
        }
        System.out.println("Well ok that's what I'm here for. Tell me more");
        String tellMeMore = input.readLine("");
        for (String trigger : psych.triggers.keySet()) {
            if (tellMeMore.toLowerCase().contains(trigger.toLowerCase())) {
                String response = psych.triggers.get(trigger);
                System.out.println(response);
                input.readLine("");
            }
        }

        if (pickPsychiatrist == 1) {
            String baitQuestion = input.readLine("Oh... ok can you tell me something about parents atleast?: ");
            for (String trigger : psych.triggers.keySet()) {
                if (baitQuestion.toLowerCase().contains(trigger.toLowerCase())) {
                    String response = psych.triggers.get(trigger);
                    System.out.println(response);
                    input.readLine("");
                }
            }
            System.out.println("Parents are so important to young kids. I wish that I had mine");
            input.readLine("");
            System.out.println("It's rare to find anyone who understands what it's like to have no parents");
            input.readLine("");
            String parents = input.readLine("Are your parents still alive?: ");
            if((parents).toLowerCase().contains("yes") || (parents).toLowerCase().contains("yeah")
                    || (parents).toLowerCase().contains("duh")){
                System.out.println("Of course they are, you don't know what it's like to be me. Nobody does");
            }
            else if ((parents).toLowerCase().contains("no") || (parents).toLowerCase().contains("nah")
            || (parents).toLowerCase().contains("nope")) {
                System.out.println("Oh is that true?... I think you're lying, you're just like the \nrest of them, SCUM");
            }

            input.readLine("");
            System.out.println("Ugh I cannot stand people like you, you guys give me headaches.\n" +
                    " You think that you're all and wonderful don't you?" +
                    "\n I swear people like you are gonna be the death of me");
            input.readLine("");
            System.out.println("Oh ok I offended you so now you gotta be hostile huh? For christ's sake\n" +
                    " GET OUT!");
            input.readLine("");
            System.out.println("LEAVE ALREADY!");
            System.out.println("");
            System.out.println("*You've been kicked from the room*");
            System.out.println("*Your session is over*");
        }
        if (pickPsychiatrist == 2) {
            String baitQuestion = input.readLine("Ok, well can you tell me about your family?: ");
            for (String trigger : psych.triggers.keySet()) {
                if (baitQuestion.toLowerCase().contains(trigger.toLowerCase())) {
                    String response = psych.triggers.get(trigger);
                    System.out.println(response);
                    input.readLine("");
                }
            }
            System.out.println("Do you even have a clue how awful it is not to have a father?");
            String fatherResponse = input.readLine("");
            if ((fatherResponse).toLowerCase().contains("yes") || (fatherResponse).toLowerCase().contains("yeah")) {
                System.out.println("NO YOU DON'T. You don't know what it's like to have nobody in " +
                        "\nyour family care about you. You don't know what it's like");
            }
            input.readLine("");
            System.out.println("It's so difficult dealing with people who don't know what it's like to be me" +
                    "\nyou can't open your heart and find some empathy can you?");
                input.readLine("");
                System.out.println("It's people like you that disgust me. You think that you can understand people" +
                        "\nbut deep down you're all just monsters. You just one of the Sheeple");
                input.readLine("");
            System.out.println("Just get out, I can't even stand looking at you anymore. You disgust me");
                input.readLine("");
            System.out.println("GET OUT!");
            System.out.println("");
            System.out.println("*You've been kicked from the room*");
            System.out.println("*Your session is over*");


        }
            if (pickPsychiatrist == 3) {
                String baitQuestion = input.readLine("Ok... so how's your family doing?: ");
                for (String trigger : psych.triggers.keySet()) {
                    if (baitQuestion.toLowerCase().contains(trigger.toLowerCase())) {
                        String response = psych.triggers.get(trigger);
                        System.out.println(response);
                        input.readLine("");
                    }
                }
                System.out.println("Do you know what It's like to have everyone you love die?");
                input.readLine("");
                System.out.println("Nobody knows what It's like, I know you don't, people just go about their lives like nothing happened " +
                        "\nand give me weird looks in the store. Do you know how that feels?");
                input.readLine("");
                System.out.println("I'M THE ONLY ONE WHO CAN TALK ABOUT IT. NOBODY ELSE WAS THERE");
                input.readLine("");
                System.out.println("YOU DIDN'T SEE IT. YOU COULDN'T");
                input.readLine("");
                System.out.println("You're easily the worst client I've ever had. ");
                input.readLine("");
                System.out.println("You might as well just get out. You don't understand me.");
                input.readLine("");
                System.out.println("LEAVE!");
                System.out.println("");
                System.out.println("*You have been kicked from the room*");
                System.out.println("*Your session is over*");

            }

        }
    }