import java.util.*;
public class historyquiz {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        System.out.println("Welcome to the History Quiz.");
        System.out.println("You will get 15 questions. You will be given 4 answer choices. Answer with either a,b,c, or d. \n\n");

        System.out.println("When did World War II end?");
        //String inp1=kb.nextLine();
        System.out.println("a)1943\nb)1944\nc)1945\nd)1946");
        System.out.print("Answer here:");
        String ans1=kb.nextLine();
        if(ans1.equals("c")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is  \"c\"");
        }


        System.out.println("\n\nThe Cold War was primarily between what two nations?");
        System.out.println("a) United States and Germany\nb)Soviet Union and United States\nc)China and Japan\nd)Britain and France");
        System.out.print("Answer here:");
        String ans2=kb.nextLine();
        if(ans2.equals("b")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"b\"");
        }

        System.out.println("\n\nWhat was the main goal of the Civil Rights Movement in the US?");
        System.out.println("a)To end the Vietnam War\nb)To promote women's rights\nc)To lower taxes\nd)To end racial segregation and discrimination");
        System.out.print("Answer here:");
        String ans3=kb.nextLine();
        if(ans3.equals("d")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"d\"");
        }

        System.out.println("\n\nWhat event started World War I?");
        System.out.println("a)The assassination of Archduke Franz Ferdinand\nb)The bombing of Pearl Harbor\nc)The signing of The Treaty of Versailles\nd)The fall of The Ottoman Empire");
        System.out.print("Answer here:");
        String ans4=kb.nextLine();
        if(ans4.equals("a")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"a\"" );
        }

        System.out.println("\n\nWhich ancient civilization built the pyramids?");
        System.out.println("a)The Romans\nb)The Egyptians\nc)The Greeks\nd)The Mesopotamians");
        System.out.print("Answer here:");
        String ans5=kb.nextLine();
        if(ans5.equals("b")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"b\"");
        }

        System.out.println("\n\nWhat was the main purpose of the Silk Road?");
        System.out.println("a)To trade goods between Asia and Europe\nb)To spread religion\nc)To move armies\nd)To exchange political ideas");
        System.out.print("Answer here:");
        String ans6=kb.nextLine();
        if(ans6.equals("a")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"a\"");
        }

        System.out.println("\n\nWhat is the name of the ship that brought the pilgrims to America in 1620?");
        System.out.println("a)The Mayflower\nb)Santa Maria\nc)The Titanic\nd)Beagle");
        System.out.print("Answer here:");
        String ans7=kb.nextLine();
        if(ans7.equals("a")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"a\"");
        }

        System.out.println("\n\nWhat was the main cause of the American Civil War?");
        System.out.println("a)Disputes over foreign trade\nb)Taxation on imports\nc)Disagreements over slavery and states' rights\nd)Border conflicts with Mexico");
        System.out.print("Answer here:");
        String ans8=kb.nextLine();
        if(ans8.equals("c")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"c\"");
        }

        System.out.println("\n\nWhich ancient civilization developed democracy?");
        System.out.println("a)Egypt\nb)Greece\nc)India\nd)China");
        System.out.print("Answer here:");
        String ans9=kb.nextLine();
        if(ans9.equals("b")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"b\"");
        }

        System.out.println("\n\nWhat was the main purpose of the Underground Railroad?");
        System.out.println("a)To transport goods\nb)To train soldiers\nc)To build railroads\nd)To help enslaved people escape to freedom");
        System.out.print("Answer here:");
        String ans10=kb.nextLine();
        if(ans10.equals("d")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"d\"");
        }


        System.out.println("\n\nThe Boston Tea Party was a revolt against what?");
        System.out.println("a)Religious restrictions\nb)British taxes on tea\nc)Forced military service\nd)The Stamp Act");
        System.out.print("Answer here:");
        String ans11=kb.nextLine();
        if(ans11.equals("b")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"d\"");
        }
       
        System.out.println("\n\nWho invented the printing press in Europe?");
        System.out.println("a)Johannes Gutenberg\nb)Vincent Van Gogh\nc)Galileo Galilei\nd)Martin Luther");
        System.out.print("Answer here:");
        String ans12=kb.nextLine();
        if(ans12.equals("a")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"a\"");
        }


        System.out.println("\n\nWho was the famous activist who refused to give up her bus seat in Montgomery, Alabama?");
        System.out.println("a)Harriet Tubman\nb)Rosa Parks\nc)Sojourner Truth\nd)Coretta Scott King");
        System.out.print("Answer here:");
        String ans13=kb.nextLine();
        if(ans13.equals("b")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"b\"");
        }

        System.out.println("\n\nWhat was the main purpose of the Crusades?");
        System.out.println("a)To spread democracy\nb)To control trade routes\nc)To reclaim the Holy land from Muslim control\nd)To explore new continents");
        System.out.print("Answer here:");
        String ans14=kb.nextLine();
        if(ans14.equals("c")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"c\"");
        }

        System.out.println("\n\nThe term Renaissance means what?");
        System.out.println("a)Revolution\nb)Enlightenment\nc)Discovery\nd)Rebirth");
        System.out.print("Answer here:");
        String ans15=kb.nextLine();
        if(ans15.equals("d")){
            System.out.println("You are correct!");
        }else{
            System.out.println("You are incorrect! The correct answer is \"d\"");
        }

        System.out.println("Yayyy! You have successfully completed this quiz. Hope you enjoyed it!");
    }

}