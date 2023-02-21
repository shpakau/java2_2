package Homework2.Task1;

import java.io.IOException;

public class task1 {
    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[J");

        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        input = input.substring(1,input.length() - 1);

        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM students WHERE ");


        String[] parts = input.split(", ");
        boolean isFirst = true;
        for (String part : parts){
            String[] keyValue = part.split(":");
            String key = keyValue[0];
            key = key.substring(1,key.length() - 1);
            String value = keyValue[1];
            //value = value.substring(1,input.length() - 1);
            //System.out.println(key);
            //System.out.println(value);
            if (value.equals ("\"null"))
                continue;
            if(!isFirst)
                builder.append (" AND ");
            builder.append(String.format ("%s = %s", key, value));
            isFirst = false; 
        }
        builder.append(String.format (";"));

        System.out.println(builder.toString()); 
}
}
