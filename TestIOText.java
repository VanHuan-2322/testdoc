import java.io.*;

public class TestIOText {

    public static void writeDataToFileWithFileWriter(String fileName, String[] duLieu) {
        try {
            FileWriter write1 = new FileWriter(fileName);
            for (String strings : duLieu) {
                write1.write(strings + "\n");
            }
            write1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readDataFromFileWithFileReader(String fileName) {
        StringBuilder duLieu = new StringBuilder();
        try {
            FileReader docFile = new FileReader(fileName);
            int file;
            while ((file = docFile.read()) != -1) {
                duLieu.append((char) file);
            }
            docFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return duLieu.toString();
    }

    public static void writeDataToFileWithBufferedWriter(String fileName, String[] duLieu) {
        try {
            BufferedWriter write2 = new BufferedWriter(new FileWriter(fileName));
            for (String strings : duLieu) {
                write2.write(strings);
                write2.newLine();
            }
            write2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readDataFromFileWithBufferedReader(String fileName) {
        StringBuilder duLieu = new StringBuilder();
        try {
            BufferedReader Read2 = new BufferedReader(new FileReader(fileName));
            String string;
            while ((string = Read2.readLine()) != null) {
                duLieu.append(string);
                duLieu.append("\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return duLieu.toString();
    }

    public static void main(String[] args) {
        String fileName = "list_song.txt";
        String[] arraySong = {"Hello california", "We don't talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình"};
        System.out.println("sử dụng FileWriter để ghi dữ liệu từ mảng ");
        writeDataToFileWithFileWriter(fileName, arraySong);
        String Read1 = readDataFromFileWithFileReader(fileName);
        System.out.println(Read1);
        System.out.println("sử dụng BufferWriter để ghi dữ liệu từ mảng");
        writeDataToFileWithBufferedWriter(fileName, arraySong);
        String Read2 = readDataFromFileWithBufferedReader(fileName);
        System.out.println(Read2);
    }
}
