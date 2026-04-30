package q02_advanced.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		ConsoleReader cr = new ConsoleReader();
		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		Member[] members = { member1, member2 };

		MemberManager.showAllMembers(members);

	}

}
