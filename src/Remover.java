import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Remover {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String toMatch = reader.readLine();
        String toRead;
        StringBuilder build = new StringBuilder();
        while((toRead = reader.readLine())!= null) {
            if (toRead.contains(toMatch)) {
                toRead = toRead.replace(toMatch, " ");

                //System.out.println(toRead);
            }
            build.append(toRead).append(" ");
        }
        System.out.println(build.toString().replaceAll("\\s+", " ").trim());

    }
}

