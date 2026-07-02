package JavaBasics;

import java.net.StandardSocketOptions;

public class stringUseCase {


    public static void main(String[] args) {

        String abc  = "abc";

        String str1 = "JavaBasics";

        String str2 = str1.substring(2);
        System.out.println("return value from index 2 : " + str2);

        String str3 = str1.substring(3, 7);
        System.out.println("return value from index 3 to 7 : " + str3);

        //Output :

        //return value from index 2 : vaBasics
        //return value from index 3 to 7 : aBas


        String ac = str1.concat(abc);

        System.out.println("Concating abc to str1  : " + ac);

        // output:

        // Concating abc to str1  : JavaBasicsabc

    }
}
