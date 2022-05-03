public class Program1 {
    public static void main(String[] args) {
        char[][] ans ={
            {'A', 'B', 'A', 'C', 'C' ,'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'A'};

        for(int i = 0; i<ans.length; i++){
            int countCorrect = 0;
            for(int j = 0; j < ans[i].length; j++){
                if(ans[i][j] == keys[j]){
                    countCorrect++;
                }
            }
            System.out.println("Student " + i +"'s correct count is "+ countCorrect);
        }

    }
}
