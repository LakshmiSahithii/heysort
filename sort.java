public class Sorting{
	public static int sort(int [] a){
		for(int i=0;i<a.length;i++){
			for (int j=i+1;j<a.length;j++){
				int temp=0;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;}
		}
		return a;
	}
}
}
