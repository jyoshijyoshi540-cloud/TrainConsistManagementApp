import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> consist = new ArrayList<>();
        System.out.println("Initial bogie count: " + consist.size());
    }
}
git add .
git commit -m "UC1: Initialize Train and Display Consist "
git push origin feature/UC1
