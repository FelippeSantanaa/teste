
package revisaoprova;

public class RevisaoProva {

    
    public static void main(String[] args) {
       int p = 
    }
    
    public static int pot (int base, int expo){
    
        if (expo ==0) {
            return 1;
        }
        return base  * pot (base, expo -1);
    }
}
