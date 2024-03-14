public class Operaciones {

    public static void main(String[] args) {

        // variables

        int resultadoSuma = 0;
        int resultadoMulti10 = 0;
        int resultadoResta = 0;
        int resultadoFinal = 0;

        // Creacción de un objeto

        Operaciones objOperaciones = new Operaciones();

        // asignaciones a las variables de los resultodos de los metodos del objeto

        resultadoSuma = objOperaciones.suma(42, 8);
        resultadoMulti10 = objOperaciones.multiplica10(resultadoSuma);

        resultadoResta = objOperaciones.resta(100, 80, 10);

        resultadoFinal = resultadoMulti10 - resultadoResta;

        // Imprimir resulado de la variables fianl

        System.out.println(resultadoFinal);

    }

    public int suma(int parametroNumero1, int parametroNumero2) {
        int resultado = 0;
        resultado = parametroNumero1 + parametroNumero2;
        imprimirResultados("SUMA", resultado);
        return resultado;
    }

    public int multiplica10(int parametroNumero1) {
        int resultado = 0;
        resultado = parametroNumero1 * 10;
        imprimirResultados("MULTI10", resultado);
        return resultado;
    }

    public int resta(int numero1, int numero2, int numero3)

    {
        int resultado = 0;
        resultado = numero1 - numero2 - numero3;
        imprimirResultados("RESTA", resultado);
        return resultado;

    }

    public void imprimirResultados(String nombreOperacion, int resultadoDeLasOperaciones) {

        System.err.println(nombreOperacion + "-------" + resultadoDeLasOperaciones);

    }

}
