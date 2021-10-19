
public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//Adding prepend()
		list.prepend(1);
		list.prepend(2);
		list.prepend(3);
		list.prepend(4);
		list.prepend(5);
		
		//Print Prepend list
		System.out.println(list);
//		System.out.println(list.getSize());
		
		//Adding Append()
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
		list.append(9);
		list.append(10);
		
		//Print Append list
		System.out.println(list);
		
		//Adding insertAt()
		//inserting 78 at first position
		list.insertAt(1, 78);
		//inserting 127 at third position
		list.insertAt(3, 127);
		//Print Append list
		System.out.println(list);
	}

}
