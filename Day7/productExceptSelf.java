public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int pre[] = new int[n];
        int suf[] = new int[n];
        int pro = 1;
        pre[0] = 1;
        for(int i=1;i<n;i++){
            pro = pro*nums[i-1];
            pre[i] = pro;
        }
        suf[n-1] = 1;
        int mul = 1;
        for(int i=n-1;i>=1;i--){
            mul = mul*nums[i];
            System.out.println(mul);
            suf[i-1] = mul;
            
        }
        for(int i=0;i<n;i++){
            res[i] = pre[i] * suf[i];
        }
        return res;
    }
}