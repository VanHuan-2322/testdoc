
import java.io.*;
import java.util.ArrayList;

public class AppComputer {
    public static void main(String[] args) {
        String fileName = "database.txt";

        // Tạo file có tên database.txt
        createFile(fileName);

        // Tạo 5 máy tính với thông tin khác nhau
        Computer computer1 = new Computer("Computer 1", "Manufacturer 1", "Model 1","HP",1500,true);
        Computer computer2 = new Computer("Computer 2", "Manufacturer 2", "Model 2","HP",1600,true);
        Computer computer3 = new Computer("Computer 3", "Manufacturer 3", "Model 3","HP",1700,false);
        Computer computer4 = new Computer("Computer 4", "Manufacturer 4", "Model 4","HP",1800,false);
        Computer computer5 = new Computer("Computer 5", "Manufacturer 5", "Model 5","HP",1900,true);

        // Lưu từng đối tượng vào file database.txt sử dụng phương thức addComputerToFile()
        addComputerToFile(computer1, fileName);
        addComputerToFile(computer2, fileName);
        addComputerToFile(computer3, fileName);
        addComputerToFile(computer4, fileName);
        addComputerToFile(computer5, fileName);

        // Hiển thị đối tượng của file database.txt sử dụng phương thức getComputerFromFile()
        System.out.println("Đối tượng của file database.txt:");
        Computer computerFromFile = getComputerFromFile(fileName);
        if (computerFromFile != null) {
            System.out.println(computerFromFile);
        }

        // Mảng đối tượng
        ArrayList<Computer> computerList = new ArrayList<>();
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);
        computerList.add(computer4);
        computerList.add(computer5);

        // Lưu từng đối tượng vào mảng danh sách máy tính sử dụng phương thức addComputerToArray()
        // Lưu mảng đối tượng máy tính vào file database.txt sử dụng phương thức addComputersToFile()
        addComputersToFile(computerList, fileName);

        // Hiển thị tất cả thông tin của file database.txt sử dụng phương thức getAllComputerFromFile()
        System.out.println("Tất cả thông tin của file database.txt:");
        ArrayList<Computer> allComputers = getAllComputerFromFile(fileName);
        for (Computer computer : allComputers) {
            System.out.println(computer);
        }
    }

    // Tạo file mới nếu chưa tồn tại
    private static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File " + fileName + " đã được tạo.");
            } else {
                System.out.println("File " + fileName + " đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo file " + fileName + ": " + e.getMessage());
        }
    }

    // Lưu đối tượng máy tính vào file
    private static void addComputerToFile(Computer computer, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(computer.toString() + "\n");
            System.out.println("Đã lưu đối tượng " + computer.getName() + " vào file " + fileName);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi lưu đối tượng " + computer.getName() + " vào file " + fileName + ": " + e.getMessage());
        }
    }

    // Đọc đối tượng máy tính từ file
    private static Computer getComputerFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String manufacturer = parts[1].trim();
                    String model = parts[2].trim();
                    return new Computer();
                }
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file " + fileName + ": " + e.getMessage());
        }
        return null;
    }

    // Lưu mảng đối tượng máy tính vào file
    private static void addComputersToFile(ArrayList<Computer> computerList, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (Computer computer : computerList) {
                writer.write(computer.toString() + "\n");
            }
            System.out.println("Đã lưu mảng đối tượng máy tính vào file " + fileName);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi lưu mảng đối tượng máy tính vào file " + fileName + ": " + e.getMessage());
        }
    }

    // Đọc tất cả thông tin từ file vào một mảng đối tượng
    private static ArrayList<Computer> getAllComputerFromFile(String fileName) {
        ArrayList<Computer> computerList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String manufacturer = parts[1].trim();
                    String model = parts[2].trim();
                    computerList.add((new Computer("Computer 6", "Manufacturer 6", "Model 6","HP",2000,true)));
                }
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file " + fileName + ": " + e.getMessage());
        }
        return computerList;
    }
}

