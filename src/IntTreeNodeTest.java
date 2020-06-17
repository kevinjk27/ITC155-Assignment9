import static org.junit.Assert.*;

import org.junit.Test;

public class IntTreeNodeTest {

	@Test
	public void testCountEmpty() {
		IntTreeNode sampleTree = new IntTreeNode();
		IntTreeNode overallRoot = null;
		overallRoot = sampleTree.add(17);
		overallRoot = sampleTree.add(14);
		overallRoot = sampleTree.add(5);
		overallRoot = sampleTree.add(27);
		overallRoot = sampleTree.add(31);
		overallRoot = sampleTree.add(28);
		overallRoot = sampleTree.add(8);

		sampleTree.printSideways();
		System.out.println();
		System.out.println("There are " + sampleTree.countEmpty() + " empty branches in this tree");
		assertEquals(8, sampleTree.countEmpty());
		System.out.println();

		IntTreeNode sampleTree1 = new IntTreeNode();
		overallRoot = sampleTree1.add(3);
		overallRoot = sampleTree1.add(2);
		overallRoot = sampleTree1.add(5);
		overallRoot = sampleTree1.add(1);
		overallRoot = sampleTree1.add(4);
		overallRoot = sampleTree1.add(6);
		sampleTree1.printSideways();
		System.out.println();
		System.out.println("There are " + sampleTree1.countEmpty() + " empty branches in this tree");
		assertEquals(7, sampleTree.countEmpty());
	}

}
