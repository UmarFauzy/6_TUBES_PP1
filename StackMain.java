 package TubesKel6;

public class StackMain {
	public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Case 1 Lakukan Push
//        System.out.println("#Pushing 3 times:");
        stack.push(new Tugas("TGS001", "Praktikum Pemograman 1", "2024-06-01"));
        stack.push(new Tugas("TGS002", "Praktikum Multimedia", "2024-06-02"));
        stack.push(new Tugas("TGS003", "Praktikum Berorientasi objek", "2024-06-03"));

//        // Case 1 Setelah Melakukan Push
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        
          //Case 2 Lakukan Push melebihi kapastisa array
//        System.out.println("#Pushing 3 times:");
        stack.push(new Tugas("TGS001", "Praktikum Pemograman 1", "2024-06-01"));
        stack.push(new Tugas("TGS002", "Praktikum Multimedia", "2024-06-02"));
        stack.push(new Tugas("TGS003", "Praktikum Berorientasi objek", "2024-06-03"));
        stack.push(new Tugas("TGS004", "Sistem Manajment Basis Data", "2024-06-04"));


        // Case 2 Setelah Melakukan Push Push melebihi kapastisa array
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        
        
        //Lakukan Pop
//        System.out.println("\n#Popping 1 time:");
        Tugas
        poppedTask = stack.pop();
        if (poppedTask != null) {
            System.out.println("Popped task: " + poppedTask);
        }

        //Setelah Melakukan Pop
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
        
          //Case 3 Pop Kemudian Melakukan Push
        System.out.println("\n#Pushing after pop:");
        stack.push(new Tugas("TGS04", "Pemograman Berbasis Jaringan", "2024-06-05"));

        // Setelah Melakukan Push setelah Pop
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
    }
}
