class Factorial{
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class Suma{
    public static int suma(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + suma(n - 1);
        }
    }
}

class Potencia{
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}

class ContarDigitos{
    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(n / 10);
        }
    }
}

class InvertirCadena{
    public static String invertir(String cadena) {
        if (cadena.length() <= 1) {
            return cadena;
        } else {
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}

class Pruebas{
    public static void main(String[] args){
        System.out.println("Factorial de 5: "+Factorial.factorial(5));
        System.out.println("Suma desde 20: "+Suma.suma(20));
        System.out.println("Potencia de base 5, exponente 10: "+Potencia.potencia(5, 10));
        System.out.println("Contar dígitos de 7666549: "+ContarDigitos.contarDigitos(7666549));
        System.out.println("Invertir la palabra candado: "+InvertirCadena.invertir("candado") );
    }
}