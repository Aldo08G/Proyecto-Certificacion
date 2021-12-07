package restaurante;

public class datos {
    static int hamburguesa = 50, alitas = 65, boneless = 70, burritos = 45, ensalada = 50, total = 0, total1 = 0;
    static String ticket = "", totalVenta = "";
    
    public void imprimir (int a, int b, String n){
        String x, y, msg;
        x = Integer.toString(a);
        y = Integer.toString(b);
        msg = n + "Cantidad: " + x + ", Precio: $" + y + "\n";
        ticket = ticket + msg;
    }
    
    public void totalVenta (int a, int b, String n){
        String x, y, msg;
        x = Integer.toString(a);
        y = Integer.toString(b);
        msg = n + "Cantidad: " + x + ", Precio: $" + y + "\n";
        totalVenta = totalVenta + msg;
    }
    
    public void total (int t){
        total = total + t;
    }
    
    public void total1 (int t){
        total1 = total1 + t;
    }
    
}
