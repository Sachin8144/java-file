import java.util.*;


public class arr {
	// int num1, num2, Total = 0;

	arr() {
		System.out.println("I'm constustor of arr");
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// arr ass = new arr();
		control con = new control();
		con.control_fun();
	}
}

class control extends Number {

	public void control_fun() throws InterruptedException {

		Scanner scan = new Scanner(System.in);

		Number n = new Number();
		while (true) {
			int num1 = 0, num2 = 0, Total = 0;
			System.out.printf(
					"\n\nPress 1 For Addition\nPress 2 For Substarction\nPress 3 For Multiplication\nPress 4 For Division\nPress 5 for Sqr the number\nPress 6 For Swap Two Numbers\nPress 7 for Sum multiple numners\nPress 8 For Multiplication Table\nPress 9 For Dispaly Even Or Odd\nPress 10 For find Grestest Number\nPress 11 for Revers a number\nPress 0 for Exiting the window\n\n");

			try {
				System.out.print("Enter Your Choice: ");
				Total = scan.nextInt();
			} catch (Exception e) {
				System.out.print("Warnning:- Kindly enter an integer from 1-11");
				Thread.sleep(3000);
				control_fun();
			}

			if (Total == 0) {
				System.exit(0);
			}
			if (Total == 5 || Total == 8 || Total == 9 || Total == 11) {
				System.out.print("Enter a number:");
				try {
					num1 = scan.nextInt();
					num2 = 0;
					n.Number_var(num1, num2, Total);
				} catch (Exception e) {
					System.out.print("Warnning:- Enter a valid number");
					Thread.sleep(3000);
					control_fun();
				}

			}

			else if (Total == 7) {
				int[] arr = new int[10];

				System.out.println("Press 0 for quit");

				for (int i = 0; i < arr.length; i++) {

					System.out.print("Enter the value of arrey: ");

					arr[i] = scan.nextInt();

					if (arr[i] == 0) {
						break;
					}
				}

				n.arrey_method(arr, Total);
			}

			else {
				if (Total >= 12) {
					System.out.format("Press a Valid Opation");
					Thread.sleep(3000);
					control_fun();
				} else {
					try {
						System.out.print("Enter a number:");
						num1 = scan.nextInt();

						System.out.print("Enter a number:");
						num2 = scan.nextInt();

						n.Number_var(num1, num2, Total);
					} catch (Exception e) {
						System.out.print("Warnning:- Kindly enter an integer");
						Thread.sleep(3000);
						control_fun();
					}
				}
			}
			// scan.close();
		}
	}
}

class Sum_num {
	public int tot;
	int X, Y;
	int ar[] = new int[2];

	int sum(int x, int y) {
		tot = x + y;
		return tot;
	}

	int div(int x, int y) {
		tot = x / y;
		return tot;
	}

	int mult(int x, int y) {
		tot = x * y;
		return tot;
	}

	int sub(int x, int y) {
		tot = x - y;
		return tot;
	}

	int sqr(int x) {
		tot = x * x;
		return tot;
	}

	int swap(int x, int y) {
		tot = x;
		x = y;
		y = tot;

		X = x;
		Y = y;
		return tot;
	}

	int element_sum(int[] ar) {
		tot = 0;
		for (int i = 0; i < ar.length; i++) {
			tot += ar[i];
		}
		return tot;
	}

	int Multiplication_table(int X) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d\t", X * i);
		}

		System.out.println();
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d\t", i);
		}

		System.out.println();
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d\t", X);
		}

		System.out.println();
		return 0;
	}

	int Even_Odd(int x) {
		if (x % 2 == 0) {
			System.out.format("%d is Even", x);
		} else {
			System.out.format("%d is Odd", x);
		}
		return 0;
	}

	int Greatest_num(int x, int y) {
		if (x < y) {
			tot = y;
		} else {
			tot = x;
		}
		return tot;
	}

	int Revers_num(int x) {
		int rem = 0;

		while (true) {
			rem = x % 10;

			tot = tot * 10 + rem;

			x = x / 10;

			if (x == 0) {
				break;
			}
		}
		return tot;
	}

	void Display() {
		System.out.println("Result is :" + tot);
	}

	void swap_display() {
		System.out.println("Result is :X is :  " + X);
		System.out.println("Result is :Y is :  " + Y);
	}
}

class Number extends Sum_num {
	public Sum_num s = new Sum_num();

	void Number_var(int x, int y, int z) {
		switch (z) {
			case 1:
				s.sum(x, y);
				s.Display();
				break;
			case 2:
				s.sub(x, y);
				s.Display();
				break;
			case 3:
				s.mult(x, y);
				s.Display();
				break;
			case 4:
				s.div(x, y);
				s.Display();
				break;
			case 5:
				s.sqr(x);
				s.Display();
				break;
			case 6:
				s.swap(x, y);
				s.swap_display();
				break;
			case 8:
				s.Multiplication_table(x);
				break;
			case 9:
				s.Even_Odd(x);
				break;
			case 10:
				s.Greatest_num(x, y);
				s.Display();
				break;
			case 11:
				s.Revers_num(x);
				s.Display();
				break;
			default:
				System.out.format("Press a Valid Opation");
				break;
		}
	}

	void arrey_method(int[] ar, int z) {
		switch (z) {
			case 7:
				s.element_sum(ar);
				s.Display();
				break;

			default:
				System.out.format("Press a Valid Opation");
				break;
		}
	}
}
