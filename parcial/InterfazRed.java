package parcial;

public class InterfazRed {
    public static void main(String[] args) {
        Red red = new Red("UPC", "A");
        
        Host host1 = new Host("PC1","WINDOWS");
        host1.configurar(187, 158, 0, 1);
        
        Host host2 = new Host("PC2","linux");
        host1.configurar(187, 158, 0, 3);
        
        Host host3 = new Host("PC3","Mac");
        host1.configurar(187, 158, 7, 2);
        
        Host host4 = new Host("PC4","Intol");
        host1.configurar(187, 178, 0, 9);
   
        
        
        System.out.println(host1.conectar(red));
        System.out.println(host2.conectar(red));
        System.out.println(host3.conectar(red));
        System.out.println(host4.conectar(red));
        
        red.details();
        System.out.println("");
        
        host1.ping(host3, "paquete 1");
        System.out.println("");
        
        host1.ping("paquete 2");
        System.out.println("");
        
    }
}
