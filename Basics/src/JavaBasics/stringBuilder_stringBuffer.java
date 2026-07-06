package JavaBasics;

public class stringBuilder_stringBuffer {

    public static void main(String[] args) {
        StringBuilder z= new StringBuilder("start");
        z.append("le");

        z.append("ab");

        System.out.println("I'm StringBuilder : " +z);

        StringBuffer a= new StringBuffer("a");
        a.append("oo");

        a.append("ab");

        System.out.println("I'm StringBuffer : " +a);


//        Output :
//        I'm StringBuilder : startleab
//        I'm StringBuffer : aooab
    }
}
