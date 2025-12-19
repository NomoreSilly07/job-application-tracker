package day4;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> jobStatuses = new ArrayList<>();

        jobStatuses.add("Applied");
        jobStatuses.add("Interview");
        jobStatuses.add("Offer");

        for (String status : jobStatuses) {
            System.out.println(status);
        }
    }
}
