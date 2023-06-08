package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
    	int greatest = first >= second  && second>=third 
    			? first 
    			: second >=first && first>= third
    				? second
    				:third;
    	System.out.println(greatest);
    }
}
