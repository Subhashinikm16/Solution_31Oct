package Oct31Test;

import java.util.ArrayList;

public class ProductofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4};
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
        	int temp=arr[i];
            int ans=1;
        	for(int j=0;j<arr.length;j++) {
        		if(temp!=arr[j]) {
        			ans=ans*arr[j];
        		}
        	}
        	al.add(ans);
        }
        System.out.println(al);
	}
}
