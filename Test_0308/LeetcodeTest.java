package Test_0308;
/*
204. ��������
 ͳ������С�ڷǸ����� n ��������������
ʾ��:
����: 10
���: 4
����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
 */
/*
 * ������
 * ��������Ϊn������res����ʼĬ��Ϊ0��0,1��������������ָ��i������2��ʼ��������res,
 * ����Ϊ0��Ԫ�أ�������������Ϊ������������Ԫ��ȫ����Ϊ1,1��ʾ����������0��ʾ��������
 * ���磺��һ������2,2��������������Ϊ4,6,8...��Ԫ��ȫ��Ϊ1����ʾ���ǲ���������
 * һ�߱�����һ���޸ģ�һ��ͳ�������ĸ�����Ԫ��Ϊ0�ĸ���������Ϻ󷵻�ͳ�Ƶ��������ĸ�����
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
        //0,1������������2��ʼ
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