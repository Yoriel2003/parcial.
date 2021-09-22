
package parcial;

public class Host {
    private int A, B, C, D;
    
    public Host(){
    
    
    }

    public Host(int A, int B, int C, int D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }


    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }
    void configurar(int A, int B, int C, int D){
    
    }
    boolean conectar(Red red){
        
        return false;
    }
    void ping (Host host, String msg){
    
    
    }
    void ping (String msg){
    
    }
    
}
