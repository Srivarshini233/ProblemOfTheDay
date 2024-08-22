class Solution {
    public int findComplement(int num) {
        if(num==0){
            return 1;
        }
        int a = Integer.toBinaryString(num).length();
        int res = (1<<a)-1;
        return num^res;

    }
}