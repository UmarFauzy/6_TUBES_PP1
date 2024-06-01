package TubesKel6;

public class Tugas {
	//Membuat Variable Bertipe String
    private String taskId;
    private String description;
    private String deadline;
    
    //Membuat instanname untuk Variable
    public Tugas(String taskId, String description, String deadline) {
        this.taskId = taskId;
        this.description = description;
        this.deadline = deadline;
    }
    //Mendefinisikan metode getTaskId yang mengembalikan nilai taskId, getter untuk taskId.
    public String getTaskId() {
        return taskId;
    }
    //Mendefinisikan metode getDescription yang mengembalikan nilai description, getter untuk description.
    public String getDescription() {
        return description;
    }
    //Mendefinisikan metode getDeadline yang mengembalikan nilai getDeadline, getter untuk deadline.
    public String getDeadline() {
        return deadline;
    }

   //Mengembalikan toString berupa String agar 
   //menghasilkan ID tugas, deskripsi, dan tenggat waktu dalam format yang rapi
    public String toString() {
        return "Task{" + 
               "taskId='" + taskId + '\'' + 
               ", description='" + description + '\'' + 
               ", deadline='" + deadline + '\'' + 
               '}';
    }
}




