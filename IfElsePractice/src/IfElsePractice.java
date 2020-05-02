import java.util.Scanner; 
	public class IfElsePractice {
		public static void main(String[] args) {
			Scanner userInput = new Scanner(System.in); 
		// TODO Auto-generated method stub
			System.out.println("Let's play a game! Enter dog or cat to see what sound the animal makes.");
			String animalName = userInput.nextLine(); 
			
			if (animalName == "dog")
			{
				System.out.println("Woof Woof!");
			}
			
			else if (animalName == "cat")
			{
				System.out.println("Meow!");
			}
			
			else if (animalName == "pig") {
				System.out.println ("Oink Oink!");
			}
			
			else if (animalName == "duck") {
				System.out.println ("Quack Quack!");
			}
			
			else if (animalName == "cow") {
				System.out.println ("Moo!");
			}

			else {
				System.out.println("Animal unknown. Please enter cat or dog.");
			}
				
		
		}

	}

 
