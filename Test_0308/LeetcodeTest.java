package Test_0308;
/*
204. 计数质数
 统计所有小于非负整数 n 的质数的数量。
示例:
输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
/*
 * 分析：
 * 创建长度为n的数组res，初始默认为0，0,1不是质数，所以指针i从索引2开始遍历数组res,
 * 遇到为0的元素，将数组内索引为其索引倍数的元素全部改为1,1表示不是质数，0表示是质数，
 * （如：第一次遇到2,2是质数，将索引为4,6,8...的元素全改为1，表示他们不是质数）
 * 一边遍历，一边修改，一边统计质数的个数（元素为0的个数），完毕后返回统计到的质数的个数。
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