package variaveis;

/*
 * Aula prática sobre variáveis no Java.
 * As variavéis são conteiners de dados.
 */
public class VariaveisNotasEstudo {
    public static void main(String[] args) {
        int dia = 29;
        int mes = 04;
        int ano = 2023;

        dia = 30;
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
        outroMetodo();
    }

    public static void outroMetodo(){
        int dia = 30;
        System.out.println(dia);
    }
}
