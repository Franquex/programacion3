public class Ejercicio1 {
    int[] vector_num = new int[10];
    public Ejercicio1() {
    }
    public void ejecutar () {
        for (int i=0; i < vector_num.length; i++) {
            int aleatorio = (int) (Math.random() *10+1) ;

            vector_num[i] = aleatorio;
        }

        for (int i=0; i< vector_num.length; i++) {
            int numero = vector_num[i];
            int cuadrado = (int) Math.pow(numero, 2);
            int cubo = (int) Math.pow(numero, 3);

            System.out.println("vector_num[" +i+ "]: "+numero+"," +cuadrado+ "," +cubo );
        }
    }
}
