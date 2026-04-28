package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		Member member = new Member();
		Member member2 = new Member("Miura Manabu", 28, 2);

		System.out.println("---SHOW DATA(NULL)---");
		member.showMember();

		System.out.println("---SHOW DATA(Miura)---");
		member2.showMember();
	}

}
