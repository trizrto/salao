import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String codigo = sc.next();
    // lavado e m de obra tintura
    if (codigo.equals("1387")) {
      System.out.println("MO tintura 52 reais");
    }
    if (codigo.equals("1241")) {
      System.out.println("lavado prof 10 reais");
    }
    if (codigo.equals("1240")) {
      System.out.println("lavado especial 22 reais");
    }
    // escova
    if (codigo.equals("1195")) {
      System.out.println("prancha ou tirar excesso 15 reais");
    }
    if (codigo.equals("1200")) {
      System.out.println("Secado arrumado 25 reais");
    }
    if (codigo.equals("1201")) {
      System.out.println("Secado arrumado 30 reais");
    }
    if (codigo.equals("1202")) {
      System.out.println("escova 35 reais");
    }
    if (codigo.equals("1203")) {
      System.out.println("escova 40 reais");
    }
    if (codigo.equals("1327")) {
      System.out.println("escova 45 reais");
    }
    if (codigo.equals("1328")) {
      System.out.println("escova 50 reais");
    }
    if (codigo.equals("1509")) {
      System.out.println("escova 55 reais");
    }
    // corte
    if (codigo.equals("1600")) {
      System.out.println("corte 60 reais");
    }
    // penteados
    if(codigo.equals("1216")){
      System.out.println("penteado ou cachos manuais 100 reais");
    }

    sc.close();
  }

}