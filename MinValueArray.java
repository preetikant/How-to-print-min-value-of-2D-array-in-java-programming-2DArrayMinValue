class MinValueArray{
	final static int R = 4;
		final static int C = 4;
	public static void main(String[] args) {
		
		int arr1[][] = {{2,3,4,5},{8,7,6,9},{33,22,23,25},{11,12,13,14}};
		System.out.println(minValue(arr1));
	}

	public static int minValue(int[][] arr){
		int min = Integer.MAX_VALUE;
		for (int i=0;i<R;i++ ) {
			for (int j=0;j<C ;j++ ) {
				if (arr[i][j]<min) {
					min = arr[i][j];
				}
			}
		}                                
		return min;
	}
}