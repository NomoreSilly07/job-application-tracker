import org.example.Job;
import org.example.JobService;

public class Main {
    public static void main(String[] args) {
        JobService service=new JobService();

        Job job1 =new Job();
        job1.company="Amazon";
        job1.position="Java Developer";
        job1.status="Applied";

        Job job2 =new Job();
        job2.company="Google";
        job2.position="Backend Developer";
        job2.status="Applied";

        Job job3 =new Job();
        job3.company="Linkedin";
        job3.position="junior Java Developer";
        job3.status="Rejected";

        service.addJob(job1);
        service.addJob(job2);
        service.addJob(job3);

        System.out.println("All jobs "+service.getActiveJobs().size());
        System.out.println("Active jobs "+service.getAllJobs().size());
    }
}