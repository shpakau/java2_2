package Homework2.Task3;
import java.io.IOException;


public class task3 {
    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[J");
        String input = "[{\"фамилия\": \"Иванов\",\"оценка\": \"5\",\"предмет\": \"Математика\"}, {\"фамилия\": \"Петрова\",\"оценка\": \"4\",\"предмет\": \"Информатика\"}, {\"фамилия\": \"Краснов\",\"оценка\": \"5\",\"предмет\": \"Физика\"}]";
        input = clip (input);
        String[] students = input.split(", ");
        for(String student: students){
            student = clip (student);
            String[] keyValues = student.split (",");
            String name = "", grade = "", subject = "";
            for (String keyValue : keyValues){
                String[] keyValueParts = keyValue.split(":");
                String key = clip (keyValueParts[0]);
                String value = clip (keyValueParts[1]);

                if( key.equals ("фамилия"))
                    name = value;
                else if( key.equals ("оценка"))
                    grade = value;
                else if( key.equals ("предмет"))
                    subject = value;
                //else
                    //throw new IllegalStateException("Неизвестное поле");
            }
            System.out.printf("Студент %s получил %s по предмету %s\n", name, grade, subject);
        }
        
    }
    private static String clip (String str)
    {
        return str.substring(1,str.length() - 1);
    }

}
