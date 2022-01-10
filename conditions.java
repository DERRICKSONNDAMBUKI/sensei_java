public class conditions{
    public static void main(String[] args){
        int age=17;
        if(age>=18){
            System.out.println("You are an adult,go to the party!");
        }else if(age>=16 && age<18){
            System.out.println("You are an adult now,but you cannot go to the party yet.");
        }else{
            System.out.println("You are still young,you canot go to the party");
        }
        //or for only one condition
        String message=age>=19?"You are an adult,you can go to the party!":"You are still young,you cannnot go to the party";
        System.out.println(message);

        String gender="";
        switch(gender){
            case "male":
            System.out.println("I am male.");
            break;
            case "female":
            System.out.println("I am female.");
            break;
            default:
            System.out.println("I prefer not say.");
        }
    }
}
