import java.util.ArrayList;
import java.util.List;

public class MergeArray {

	public List<Integer> mergeSortedArrays(List<Integer> array1, List<Integer> array2) {
		int size1 = array1.size();
		int size2 = array2.size();
		
		List<Integer> mergedArray = new ArrayList<>(size1+size2);
		
		int currentPos1 = 0;
		int currentPos2 = 0;
		
		while (currentPos1 < size1 && currentPos2 < size2) {
			if (array1.get(currentPos1) < array2.get(currentPos2)) {
				mergedArray.add(array1.get(currentPos1));
				currentPos1++;
			} else {
				mergedArray.add(array2.get(currentPos2));
				currentPos2++;
			}
		}
		
		mergedArray.addAll(array1.subList(currentPos1, size1));
		mergedArray.addAll(array2.subList(currentPos2, size2));
		
		return mergedArray;
	}
}
