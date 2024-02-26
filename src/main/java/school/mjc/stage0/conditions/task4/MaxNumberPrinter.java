package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
    	
    	if(first > second && first > third) {
    		System.out.println(first);
    	} else if (second > first && second > third) {
    		System.out.println(second);
    	} else if (third > first && third > second) {
    		System.out.println(third);
    	} else if (first == second || first == third  ) {
    		System.out.println(first);
    	}  else if (second == first || second == third  ) {
    		System.out.println(second);
    	} 
    	  else {
    		System.out.println("Wrong number!");
    	}
    	
    }
    public static void main(String[] args) {
    	MaxNumberPrinter max = new MaxNumberPrinter();
    	max.printGreatest(53000, 54000, 55000);
    }
}
