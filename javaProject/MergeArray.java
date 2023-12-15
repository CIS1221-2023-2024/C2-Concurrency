import java.util.ArrayList;
import java.util.List;

public class MergeArray {

	public List<Integer> mergeSortedArrays(List<Integer> array1, List<Integer> array2) {
		int size1 = array1.size();
		int size2 = array2.size();
		
		List<Integer> mergedArray = new ArrayList<>();
		
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
		
		while (currentPos1 < size1) {
			mergedArray.add(array1.get(currentPos1));
			currentPos1++;
        }

        while (currentPos2 < size2) {
			mergedArray.add(array2.get(currentPos2));
        	currentPos2++;
        }
		
		return mergedArray;
	}
}
