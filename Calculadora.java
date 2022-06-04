import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        int op;
        do {
        System.out.println("|------------------------------|");
        System.out.println("| CALCULADORA                  |");
        System.out.println("|------------------------------|");
        System.out.println("|           1. SOMAR           |");
        System.out.println("|           2. SUBTRAIR        |");
        System.out.println("|           3. MULTIPLICAR     |");
        System.out.println("|           4. DIVIDIR         |");
        System.out.println("|------------------------------|");
        
        Scanner menu = new Scanner(System.in);
        op = menu.nextInt();

        processar(op);
    } while (op != 0);
    }
    public static void processar(int op) {
        Scanner numeros = new Scanner(System.in);

        switch(op) {
            case 1: {
                System.out.println("Somando dois algarismos...");

                System.out.print("Digite o primeiro número: ");
                int nu1 = numeros.nextInt();
                System.out.print("Digite o segundo número: ");
                int nu2 = numeros.nextInt();

                int resposta = nu1 + nu2;
                System.out.println("Resposta: "+resposta);
                break;
            }
            case 2: {
                System.out.println("Subtraindo dois algarismos...");

                System.out.print("Digite o primeiro número: ");
                int nu1 = numeros.nextInt();
                System.out.print("Digite o segundo número: ");
                int nu2 = numeros.nextInt();

                int resposta = nu1 - nu2;
                System.out.println("Resposta: "+resposta);
                break;
            }
            case 3: {
                System.out.println("Multiplicando dois algarismos...");

                System.out.print("Digite o primeiro número: ");
                int nu1 = numeros.nextInt();
                System.out.print("Digite o segundo número: ");
                int nu2 = numeros.nextInt();
                
                int resposta = nu1 * nu2;
                System.out.println("Resposta: "+resposta);
                break;
            }
            case 4: {
                System.out.println("Dividindo dois algarismos...");

                System.out.print("Digite o primeiro número: ");
                int nu1 = numeros.nextInt();
                System.out.print("Digite o segundo número: ");
                int nu2 = numeros.nextInt();
                
                int resposta = nu1 / nu2;
                System.out.println("Resposta: "+resposta);
                break;
            }
        }
    }
}