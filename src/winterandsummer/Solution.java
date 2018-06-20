package winterandsummer;

public class Solution {

    public int solution(int[] T){
        int winterMaxT = T[0], winterMinT = T[0], days = 1;
        int k = 1, lastMax = T[0]; 
        for (int i = 1; i < T.length; i++){
            if (winterMaxT < T[i])
                winterMaxT = T[i];

            if (winterMinT > T[i]){
                winterMinT = T[i];
                k = i;
                lastMax = winterMaxT;
            }            
        }
        //searching where summer starts
        for (int i = k; i < T.length; i++){
            if (lastMax < T[i]){
                lastMax = T[i];
                days = i;
                break;
            }       
        }
        return days;
    }
    
}
