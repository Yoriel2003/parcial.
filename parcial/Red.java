package parcial;

public class Red {
    private String PC1;
    private String PC2;
    private String PC3;
    private int A = 3;
    private int B = 5;
    private int C = 7;

    public Red(String PC1, String PC2, String PC3) {
        this.PC1 = PC1;
        this.PC2 = PC2;
        this.PC3 = PC3;
    }

    Red(String upc, String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPC1() {
        return PC1;
    }

    public String getPC2() {
        return PC2;
    }

    public String getPC3() {
        return PC3;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public void setPC1(String PC1) {
        this.PC1 = PC1;
    }

    public void setPC2(String PC2) {
        this.PC2 = PC2;
    }

    public void setPC3(String PC3) {
        this.PC3 = PC3;
    }

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public void setC(int C) {
        this.C = C;
    }
    
 
    public void  isLimitHost(){
        boolean limite;
        if (this.A > 3 ) {
            limite = true;
        } else {
            limite = false ;
        if (this.B > 5){
            limite = true;
        } else {
            limite = false;
                
        if (this.C > 7);
            limite = false;
        }
    }
    
    
}
}
