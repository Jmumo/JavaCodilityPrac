
import java.util.Set;
import java.util.HashSet;

class isHappyclass {
    public static void main(String[] args) {
        System.out.println(isHappy(82));
    }
    
    public static boolean isHappy(int n){
        
        Set<Integer> usedNums = new HashSet<>();
        
        while(true){
            int sum = 0;
            
            while(n != 0){
                sum += Math.pow(n % 10, 2.0);
                n = n / 10;
            }
            n = sum;
            
            if (sum == 1){
                return true;
            }
            
            if (usedNums.contains(n)){
                return false;
            }else{
                usedNums.add(n);
            }
        }
    }
}
