package day5;

import java.util.ArrayList;

public class SearchAndFilterExample {

    public static void main(String[] args) {
        ArrayList<String> jobStatuses = new ArrayList<>();

        jobStatuses.add("Applied");
        jobStatuses.add("Interview");
        jobStatuses.add("Rejected");
        jobStatuses.add("Offer");
        jobStatuses.add("On Hold");

        // Searching
        if (jobStatuses.contains("Interview")) {
            System.out.println("Interview status found");
        }

        // Filtering
        System.out.println("Filtered results:");
        for (String status : jobStatuses) {
            if (!status.equals("Rejected")) {
                System.out.println(status);
            }
        }
    }
}
