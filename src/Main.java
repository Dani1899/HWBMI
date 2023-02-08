public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 62;//вес
        double height = 1.66;//рост
        double bmi = service.calculate(62, 1.66);
        System.out.println(bmi);
    }
}
