package Test_0308;
/*
204. 计数质数
 统计所有小于非负整数 n 的质数的数量。
示例:
输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class LeetcodeTest {
	public static void main(String[] args) {
		Solution So = new Solution();
		int n = 10;
		System.out.println(So.countPrimes(n));
	}
}
class Solution {
    public int countPrimes(int n) {
        int[] res = new int[n];
        int count = 0;
        //0,1不是质数，从2开始
        for(int i=2; i<n; i++){
        	if(res[i] == 0){
        		count++;
        		for(int j=2; i*j<n; j++){
        			res[i*j] = 1;
        		}
        	}
        }
        return count;
    }
}