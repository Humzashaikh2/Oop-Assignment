Students data
public class StudentDataSplitter {
 public static void main(String[] args) {
 // Declare and initialize the student data string
 String studentData = "John: 85,Emily:92,Michael:78,Alice:95";
 // Split the student data into an array of individual student records
 String[] studentRecords = studentData.split(",");
 // Iterate through the student records
 for (String record : studentRecords) {
 // Split each record into name and score
 String[] parts = record.split(":");
 if (parts.length == 2) {
 String name = parts[0];
 String score = parts[1];
 System.out.println("Name: " + name + ", Score: " + score);
 }
 }
 }
}
In t