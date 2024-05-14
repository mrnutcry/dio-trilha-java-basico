import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
            //Conhecer e importar a classe Scanner
            
                Scanner scanner = new Scanner (System.in).useLocale(Locale.US); {
            
            //Exibir as mensagens para o nosso usuário
                System.out.println("Por favor, digite o numero da conta: ");
                int conta = scanner.nextInt();

                System.out.println("Digite sua agencia: ");
                String agencia = scanner.next();

                System.out.println("Digite seu nome e sobrenome: ");
                String nome = scanner.next();
                String sobrenome = scanner.next();

                System.out.println("Digite seu saldo: ");
                double saldo = scanner.nextDouble();

            //Obter pela scanner os valores digitados pelo terminal
                scanner.close();
            

        //Exibir a mensagem conta criada

                System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + ", já está disponível para saque");
        
                }
            }
        }
        