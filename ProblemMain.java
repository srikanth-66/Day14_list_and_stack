package Classes;

public class ProblemMain {
		public static void main(String[] args) {
			// UC1 case add last
			System.out.println("adding at last -");
			UC1 uc1 = new UC1();
			uc1.addNode(56);
			uc1.addNode(30);
			uc1.addNode(70);
			uc1.printList();

			// UC2 case add at start
			System.out.println("adding at start -");
			UC2 uc2 = new UC2();
			uc2.addNode(70);
			uc2.addNode(30);
			uc2.addNode(56);
			uc2.printList();
			
			System.out.println("appending data -");
			UC3 uc3=new UC3();
			uc3.addNode(56);
			uc3.addNode(30);
			uc3.addNode(70);
			uc3.printList();

			
			System.out.println("appending in between data -");
			UC4 uc4=new UC4();
			uc4.addNode(56);
			uc4.addNode(70);
			uc4.printList();
			//inserting data inbetween
			uc4.insertInBetween(30);
			uc4.printList();
			
			
			System.out.println("removing first element -");
			UC5 uc5 = new UC5();
			uc5.addNode(56);
			uc5.addNode(30);
			uc5.addNode(70);
			uc5.printList();
			uc5.deleteHead();
			uc5.printList();
			
			
			System.out.println("removing last element -");
			UC6 uc6 = new UC6();
			uc6.addNode(56);
			uc6.addNode(30);
			uc6.addNode(70);
			uc6.printList();
			uc6.deleteLast();
			uc6.printList();

			
			System.out.println("Search element -");
			UC7 uc7 = new UC7();
			uc7.addNode(56);
			uc7.addNode(30);
			uc7.addNode(70);
			uc7.printList();
			uc7.search(30);
			
			System.out.println("remove 40 -");
			UC9 uc9 = new UC9();
			uc9.addNode(56);
			uc9.addNode(30);
			uc9.addNode(70);
			uc9.insertAfter(40);
			uc9.printList();
			uc9.size();
			uc9.deleteAfter(40);
			uc9.printList();
			uc9.size();
			
			
			//sorting list
			System.out.println("sorting list -");
			UC10 uc10 = new UC10();
			uc10.addNode(56);
			uc10.addNode(30);
			uc10.addNode(40);
			uc10.addNode(70);
			uc10.printList();
			uc10.sortList();
			uc10.printList();

		}
	}
