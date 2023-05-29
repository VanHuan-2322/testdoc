import java.io.*;

public class TestIOText {
    private static  String FILE_NAME = "list_song.txt";
    private static  String[] arraySong = {
            "Hello California",
            "We don't talk anymore",
            "Nắng ấm xa dần",
            "Em của ngày hôm qua",
            "Thất tình"
    };

    public static void main(String[] args) {
        writeDataToFileWithFileWriter();
        readDataFromFileWithFileReader();
        writeDataToFileWithBufferedWriter();
        readDataFromFileWithBufferedReader();
    }

    public static void writeDataToFileWithFileWriter() {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
            for (String song : arraySong) {
                fileWriter.write(song + "\n");
            }
            System.out.println(" successfully ");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public static void readDataFromFileWithFileReader() {
        try (FileReader fileReader = new FileReader(FILE_NAME)) {
            int character;
            StringBuilder data = new StringBuilder();
            while ((character = fileReader.read()) != -1) {
                data.append((char) character);
            }
            System.out.println(" Mang la \n" + data.toString());
        } catch (IOException e) {
            System.out.println(" error ");
            e.printStackTrace();
        }
    }

    public static void writeDataToFileWithBufferedWriter() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String song : arraySong) {
                bufferedWriter.write(song);
                bufferedWriter.newLine();
            }
            System.out.println("finish");
        } catch (IOException e) {
            System.out.println(" error ");
            e.printStackTrace();
        }
    }

    public static void readDataFromFileWithBufferedReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            StringBuilder data = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                data.append(line).append("\n");
            }
            System.out.println("Mang duoc ghi: \n" + data.toString());
        } catch (IOException e) {
            System.out.println("Errol");
            e.printStackTrace();
        }
    }
}
