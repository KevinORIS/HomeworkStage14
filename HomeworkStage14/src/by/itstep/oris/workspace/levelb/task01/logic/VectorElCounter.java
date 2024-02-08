package by.itstep.oris.workspace.levelb.task01.logic;

public class VectorElCounter {
	public static int countElInVector(int el, int... vector) {
		if (vector == null) {
			return -1;
		}

		int count = 0;

		for (int element : vector) {
			if (el == element) {
				count++;
			}
		}

		return count;
	}
}
