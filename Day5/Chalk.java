package ProblemOfTheDay.Day5;

public class Chalk {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        int n = chalk.length;
        while(k>=chalk[i]){
            k = k-chalk[i];
            i++;
            if(i==n){
                i=0;
            }
        }
        return i;
    }
    
}
