package UnstablePsychiatrist;

import java.util.HashMap;


public class Psychiatrist {
    public HashMap<String, String> triggers = new HashMap<String, String>();




    private String name;
    private int age;
    private String issue;

    public Psychiatrist(String name, int age, String issue) {
        this.name = name;
        this.age = age;
        this.issue = issue;

        if(name == "Aaron"){
            triggers.put("mom", "I wish I still had my mom. Both of my parents died what I was 5");
            triggers.put("mother", "I wish I still had my mom. Both of my parents died what I was 5") ;
            triggers.put("parents", "When I was 5 both of my parents died in a car crash. I was forced to live" +
                    "in the foster care system until I was 18");
            triggers.put("you", "Why are you talking about me, this session is about you");
            triggers.put("you're annoying", "Why do you think that I'm annoying?");
            triggers.put("they", "Both of my parents died when I was 5. You're lucky you still have a family.");

        }
        if(name == "Barbara"){
            triggers.put("father", "You're lucky you even had a father, mine left when I was 6. It's never been the same without him");
            triggers.put("dad", "You're lucky you even had a father, mine left when I was 6. It's never been the same without him");
            triggers.put("family", "When I was 6 my father left my family");
            triggers.put("kids", "Be thankful that you have them, after my father left...");
            triggers.put("you", "Why are you talking about me, this session is about you");
            triggers.put("you're annoying", "Why do you think that I'm annoying?");
            triggers.put("they", "You're lucky you still have a family. My father tore mine apart");
        }
        if(name == "Charles"){
            triggers.put("drinking", "Ah i've always been one to have a drink. You know they say that drinking shots" +
                    "\nof vodka improves liver function");
            triggers.put("Mexico", "That reminds me of the plane that I was on as it went down in Mexico." +
                    "\nI was the only one that lived.");
            triggers.put("family", "That just reminds me of my family... they all died on the plane");
            triggers.put("you", "Why are you talking about me, this session is about you");
            triggers.put("you're annoying", "Why do you think that I'm annoying?");
            triggers.put("they", "That just reminds me of my family... they all died on the plane");
            triggers.put("they're", "That just reminds me of my family... they all died on the plane");
            triggers.put("no", "WHY WON'T YOU ANSWER MY QUESTIONS?");
        }


    }

    public String greet() {
        return "Hi I'm " + name + " and I will be your psychiatrist today.";
    }

    public String sayName() {
        return name;
    }
    public String spoutInsecurities(){
        return issue;
    }
}

