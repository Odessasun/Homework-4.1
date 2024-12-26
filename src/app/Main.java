package app;

public class Main {
    public static void main(String[] args) {
        // номер заказа
        int t = 1;
        int k = 2;
        // название товара
        String product1 = "smartfone";
        String product2 = "laptop";
        // цена товара
        double y,z;
        y = 1215.34;
        z = 499.37;
        // количество продаж в день
        int c = 2;
        int d = 3;
        // количество дней торговли
        int q = 5;
        int m = 7;
        //загальнa сумa продажів
        double h=y*c*q;
        double i=z*d*m;
        // Середньоденна сума продажів
        double a = h/q;
        double b = i/m;
               System.out.printf("""
               Product No %d: %s,
               total sales for %d days is EUR %.2f,
               sales by day is EUR %.2f.
               """,
               t,product1,q,h,a);
               //
        System.out.printf("""
               Product No %d: %s,
               total sales for %d days is EUR %.2f,
               sales by day is EUR %.2f.
               """,
                k,product2,m,i,b);
    }
}
