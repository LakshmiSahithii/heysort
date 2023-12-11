public class BinarySearch{
	public static int binarysearch(int [] array,int target){
		int low=0;
		int high=array.length-1;
		while(low<=high){
			int mid=low+high-low/2;
			if(array[mid]==target){
				return array[mid];
			}
			else if(array[mid]<target){
				low=mid+1;
			}
			else{
				high=mid-1;

			}
		}
		return -1;
	}
	public static void main(String[],args){
		int sarray[]={10,2,16,34,97};
		int target=2;
		int sresult[]=Sorting.sort(sarray);
		int result=binarysearch(sresult,target);
		if(result!=-1){
			System.out.println(result);
		}
		else{
			System.out.println("element not found");
		}
	}
}
