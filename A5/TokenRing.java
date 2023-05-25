import java.util.*;

public class TokenRing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" ENTER NUMBER OF NODES YOU WANT IN THE RING ");
        int  n = sc.nextInt();

        System.out.print("THE RING FORMED IS AS BELOW ");
        for(int i = 0; i < n; i++){
            System.out.print(i + " ");
        }

        System.out.print("0 ");

        int choice = 0;
        do{
            System.out.println("ENTER SENDER: ");
            int sender = sc.nextInt();

            System.out.println("ENTER Receiver: ");
            int receiver = sc.nextInt();

            System.out.println("ENTER DATA TO SEND: ");
            int data = sc.nextInt();

            int token = 0;
            System.out.println("TOKEN PASSING: ");

            for(int i = token; i < sender; i++){
                System.out.print(" " + i + " -> ");
            }

            System.out.println(" " + sender );
            System.out.println("Sender: " + sender + " Sending Data: " + data);

            for(int i = sender; i != receiver; i = (i + 1) % n ){
                System.out.println("Data : " + data + " Forwarded by: " + i);
            }

            System.out.println("Receiver: " + receiver + " received the data " + data);

            token = sender;

            System.out.print("DO U WANT TO SEND DATA AGAIN, IF YES enter 1, if no enter 0");
            choice = sc.nextInt();

        }while( choice == 1);



    }
}