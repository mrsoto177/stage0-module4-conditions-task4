package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
    	    	     
    	       int max = first>second? ((first>third)?first:third):((second > third)? second:third); 
    	       System.out.println(max);
    }
    
    public static void main(String[] args) {
    	TernaryMaxNumberPrinter max = new TernaryMaxNumberPrinter();
    	max.printGreatest(99030, 99400, 99040);
    }
}
