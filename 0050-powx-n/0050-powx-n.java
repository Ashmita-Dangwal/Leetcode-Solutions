class Solution {
    public double myPow(double x, int n) {
        long power = n;
        if(power < 0){
            x = 1.0/x;;
            power = -power;
        }

        double res = 1.0;
        double currentProduct = x;

        while(power > 0){
            if(power % 2 ==1){
                res *= currentProduct;
            }
            currentProduct*=currentProduct;
            power/=2;
        }

        return res;
        
    }
}