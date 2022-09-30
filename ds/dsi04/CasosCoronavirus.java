package learningjava;

import java.util.Scanner;

public class CasosCoronavirus {

    public static void main(String[] args) {

        // criando as vari�veis que v�o armazenar a quantidade de casos em cada regi�o e no brasil

        int sudeste;
        int sul;
        int centro_oeste;
        int nordeste;
        int norte;
        int brasil;

        // criando as vari�veis que v�o armazenar o percentual de casos de cada regi�o

        double percentualSudeste;
        double percentualSul;
        double percentualCentro_Oeste;
        double percentualNordeste;
        double percentualNorte;

        // criando uma classe Scanner chamada "sc" que vai receber dados do usu�rio

        Scanner sc = new Scanner(System.in);

        // exibindo mensagem no console  para solicitar dados ao usu�rio, e logo em seguida armazenando na vari�vel o valor digitado pelo usu�rio

        System.out.println("Digite o n�mero de casos da regi�o Sudeste:");
        sudeste = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Sul:");
        sul = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Centro-Oeste:");
        centro_oeste = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Nordeste:");
        nordeste = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Norte:");
        norte = sc.nextInt();

        // calculando o total de casos no brasil e armazenando na vari�vel "brasil"
        // calculando o percentual de casos de todas as regi�es

        brasil = sudeste + sul + centro_oeste + nordeste + norte;
        percentualSudeste = (sudeste * 100.0) / brasil;
        percentualSul = (sul * 100.0) / brasil;
        percentualCentro_Oeste = (centro_oeste * 100.0) / brasil;
        percentualNordeste = (nordeste * 100.0) / brasil;
        percentualNorte = (norte * 100.0) / brasil;

        // exibindo na tela uma mensagem com o n�mero de casos e o percentual de cada regi�o
        // detalhe: \r\n e \n (em laranja) s�o apenas para realizar a quebra de linha no texto (capricho), sua exclus�o n�o afeta o c�digo em si

        System.out.println("N�mero de casos no Brasil: " + brasil + "\r\nPercentual: 100%\n");
        System.out.println("N�mero de casos na regi�o Sudeste: " + sudeste + "\r\nPercentual: " + percentualSudeste + "%\n");
        System.out.println("N�mero de casos na regi�o Sul: " + sul + "\r\nPercentual: " + percentualSul + "%\n");
        System.out.println("N�mero de casos na regi�o Centro-Oeste: " + centro_oeste + "\r\nPercentual: " + percentualCentro_Oeste + "%\n");
        System.out.println("N�mero de casos na regi�o Nordeste: " + nordeste + "\r\nPercentual: " + percentualNordeste + "%\n");
        System.out.println("N�mero de casos na regi�o Norte: " + norte + "\r\nPercentual: " + percentualNorte + "%\n");

        // fechando a classe Scanner "sc", indicando que ela n�o ser� mais utilizada no c�digo
        
        sc.close();

    }

}
