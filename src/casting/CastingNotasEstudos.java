package casting;

/*
 * Casting: Operação de transformar um tipo de dados em outro.
 *  
 * Widening Casting vs Narrowing Casting
 */
public class CastingNotasEstudos {

    public static void main(String[] args) {
        //* Widening Casting (Implicito)     
        byte variavePequena = 1;
        int variaveGrande = variavePequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variaveGrande);
        System.out.println(variavelInt);

        //*Narrowing Casting (Explicito)
        long variavelLong = 7897;
        int variavelInt2 = (int) variavelLong;
        System.out.println(variavelInt2);

        //? Operações de divisão entre números inteiros
        int num1 = 9;
        int num2 = 2;
        float resultadoDivisao = (float) num1 / num2;
        System.out.println(resultadoDivisao);

    }
}
