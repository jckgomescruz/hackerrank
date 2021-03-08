package hackerrank.day23.binarysearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LevelOrder {

	
	
	static void levelOrder(Node root) {
		// Write your code here
		Queue<Node> queue = new LinkedList<Node>();
		
		if (null != root) {
			queue.add(root);
			
			while (!queue.isEmpty()) {
				Node current = queue.poll();
				
				System.out.print(current.data + " ");
				
				if (null != current.left) {
					queue.add(current.left);
				}
				
				if (null != current.right) {
					queue.add(current.right);
				}
			}
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		
		sc.close();
	}
}
