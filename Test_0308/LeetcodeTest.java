package Test_0308;
/*
204. ��������
 ͳ������С�ڷǸ����� n ��������������
ʾ��:
����: 10
���: 4
����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
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