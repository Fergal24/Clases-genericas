public class Principal {
    public static void main(String[] args) {
        Caja<String> caja1 = new Caja<>();
        caja1.setArticulo("reloj");
        System.out.println("caja con " + caja1.getArticulo());
        Caja<Integer> caja2 = new Caja<Integer>();
        caja2.setArticulo(10);
        System.out.println("caja con " + caja2.getArticulo());
        
    }
}
 