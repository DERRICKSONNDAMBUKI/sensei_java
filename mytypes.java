public class mytypes {
    public static void main(String[] args){
        byte mybyte=-128;
        int myint= 1565789;//or 156_789
        short myshort=6576;
        long mylong=987653234567l;
        float myfloat=6.374f;
        double mydouble=57.234567887654;
        boolean isboolean=true;
        char mychar='R';//primitive start in lowercase
        String name=("Ndambuki Consolidate");//refence type-start in uppercase
        //LocalDate today=LocalDate.now(); #ricky has bugs
        int numbers[]={34,45,66,76,44,55,66};
        int a=0;
        

        System.out.println(mybyte);
        System.out.println(myint);
        System.out.println(myshort);
        System.out.println(mylong);
        System.out.println(myfloat);
        System.out.println(mydouble);
        System.out.println(isboolean);
        System.out.println(mychar);
        System.out.println(name);
        System.out.println(name.toUpperCase());
        //System.out.println(today);
        System.out.println(name.charAt(0));
        System.out.println("Array at space 3= "+numbers[3]);
        //System.out.println("All array= "+numbers.toString());  #ricky has bugs
        System.out.println("The elements in the array="+numbers.length);
        System.out.println("All elements of the array: ");
        //loops
        for(a=0;a<numbers.length;a++){
            System.out.println(numbers[a]);
        }//or
        System.out.println("While loop array: ");
        int c=0;
        while(c<numbers.length){
            System.out.println(numbers[c]);
            c++;  
        }//or
        int b=0;
        System.out.println("Do_wwhile loop array: ");
        do{
            System.out.println(numbers[b]);
            b++;
        }while(b<=(numbers.length-1));
    }
}