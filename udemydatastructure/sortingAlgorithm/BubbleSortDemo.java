package udemydatastructure.sortingAlgorithm;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] a= {20,33,-1,23,1,55};
		double now=System.currentTimeMillis();
		for(int i=a.length-1;i>0;i--) {
			for(int j=0; j<i; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(now);//1.709530224537E12
		for(int a1:a) {
			System.out.println(a1);
		}
	}

}
