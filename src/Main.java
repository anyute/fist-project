public class Main {
    public static void main(String[] args) {
        long[] sales = new  long[] {1, 2, 300, 210};
        SalesManager salesManager = new SalesManager(sales);
       long max = salesManager.max();
       System.out.println(max);
    }
}
