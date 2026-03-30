package org.example;

public class HelloApp2{
    public static void main(String[] args){
        String name = "World";

        if(args.length>0){
            name=args[0];
        }
        System.out.println("Hello "+name+" !");
    }
}
//use this to run the code
/*javac -d bin HelloApp2.java
PS C:\Users\KKS\HelloApp\src> java -cp bin HelloApp2.java prachi */
