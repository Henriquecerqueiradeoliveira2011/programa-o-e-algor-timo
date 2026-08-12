import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args) {
        // Declaração da matriz A na ordem 2x2 (matriz quadrada)
        int [][] A = {
                {1, 4},
                {2, 8}
        };
        //Declaração da matriz B na ordem 2x2 (matriz quadrada)
        int [][] B = {
                {3, 6},
                {7, 9}
        };
        //Declaração da matriz C que receberá o resultado
        int [][]C = new int[2][2];
        for (int i = 0; i <2;i++){
            for(int j = 0; j<2;j++){
                //Soma das matrizes
                C[i][j] = A[i][j]+B[i][j];
            }
        }
        //Exibe a matriz A
        System.out.println("Matriz A: ");
        for(int i = 0; i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        };
        //Exibe a matriz B
        System.out.println("\n Matriz B: ");
        for (int i = 0; i <2; i++){
            for (int j=0;j<2;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        //Exibe a matriz C
        System.out.println("\n Matriz C: ");
        for (int i = 0; i <2; i++){
            for(int j=0;j<2;j++){
                System.out.print(C[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    }