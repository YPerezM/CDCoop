package examencod;

public class ExamenCOD {

    public static void main(String[] args) {
        int num = 11;
        if (Comprobacion(num)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (Comprobacion(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean Comprobacion(int variable) {
        int j = 2;
        boolean aux = true;
        while ((aux) && (j != variable)) {
            if (variable % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}
//COMMIT FINAL DEL CODIGO