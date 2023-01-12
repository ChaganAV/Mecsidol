import java.io.*;


public class Main {
    public static void main(String[] args) {
        try {
            String crypto = "91EE0792yI4xP208NNPk8AuN+TJZnEkOm0OFJFKWJQr+cwggnD8=";
            Kiz kiz = new Kiz("01","04607085319445", "21", crypto);
            String fileCodes = "C:\\Projects\\Java\\мексидол-коды.txt";
            String fileOut = "C:\\Projects\\Java\\meksidol-out.txt";
            FileReader fin = new FileReader(fileCodes);
            BufferedReader br = new BufferedReader((fin));
            FileWriter fout = new FileWriter(fileOut);
            BufferedWriter bw = new BufferedWriter(fout);
            String code = "";
            while (true) {
                code = br.readLine();
                if (code == null)
                    break;
                kiz.GetKiz(code);
                bw.write(kiz.kiz);
                bw.newLine();
//                kiz.ShowKiz();
            }
            br.close();
            bw.close();
        }
        catch (IOException ex){
            System.out.println("Ошибка ввода/вывода: " + ex);
        }
    }
}