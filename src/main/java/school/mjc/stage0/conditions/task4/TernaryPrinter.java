package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
    	
    	int bigger = first >= second ? first: second;
    	System.out.println(bigger);
    }
    public static void main(String[] args) {
    	TernaryPrinter greater = new TernaryPrinter();
    	greater.printWhichIsBigger(50, 300);
    }
}
