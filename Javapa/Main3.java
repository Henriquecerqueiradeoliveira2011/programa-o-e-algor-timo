public class Main3 {
    public static void main (String[] args){
        int [][] A = {
                {10, 20, 30},
                {40, 50 , 60}
        };
        int [][] B = {
                {2, 4 , 6},
                {8, 10, 12}
        };
        int[][] C = new int[3][3];
        for (int i = 0; i<2; i++){
            for(int j=0; j<2;j++){
                C[i][j]= A[i][j]/B[i][j];
                if(B[i][j]!= 0){
                }else{
                    System.out.println(
                            "Erro: Divisão por zero na posição"
                    )
                }
            }
        }
    }

}
