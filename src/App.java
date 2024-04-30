public class App {
    public static void main(String[] args) throws Exception {
        int numero = 5;
        System.out.println("O fatorial de "+numero+" é igual a ..."+fatorial(numero));
        System.out.println("O fatorial de "+numero+" é igual a ..."+fatorialRecursivo(numero));
    }

    // Versão sem recursividade
    public static int fatorial(int n){
        int resultado = 1;
        if (n>=0)
        {
            for(int i=n; i >=1;i--){
                resultado *= i; // resultado = resultado * 1;
            }
        }
        else
        {
            resultado = -1;
        }
        
        return resultado;
    }

    // Versão com recursividade
    public static int fatorialRecursivo(int n){
        /*
        if ((n==0) || (n==1))
        {
            return 1;
        }
        else
        {
            if(n>1)
            {
                return n * fatorialRecursivo(n-1);
            }
        }
        return -1;
        */
        if(n < 0) return -1;
        if(n < 2) return 1;
        return n * fatorialRecursivo(n-1);
    }


}

