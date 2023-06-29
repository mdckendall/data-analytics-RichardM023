import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner scanner = new Scanner(System.in);

    int number = 0;
    while (number != 5){
      options();
      number = scanner.nextInt();
      switch (number) { 
        case 1:
          System.out.println("98,345 average salary in South Florida");
break;
        case 2: System.out.println("US News - 100 best Jobs!");
          break;
        case 3: 
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          students(fileScanner);
    
          fileScanner.close();
          fr = new FileReader("names.txt");
          fileScanner = new Scanner(fr);
          break;
        case 5:
          break;
        default:
          System.out.println("Enter valid number");  
      }
    }
  }
  public static void options(){
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
  }
  public static void students(Scanner names){
    System.out.println("Current Students:");
    while(names.hasNextLine()){
      System.out.println(names.nextLine());
    }
  }
}




