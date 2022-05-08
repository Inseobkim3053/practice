import java.io.IOException;

public class alphabet {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                char result = (char) (j + 65);
                sb.append(result).append(" ");
            }
            System.out.println(sb);
        }

        for (int i = 0; i < 10; i ++ ) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j <10; j++) {
                char result = (char) (j +  65);
                sb.append(result).append(" ");
            }
            System.out.println(sb);

        }
    }


}
