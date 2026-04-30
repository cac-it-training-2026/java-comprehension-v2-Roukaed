package q02_advanced.question02;

public class MemberManager {
	private MemberManager() {
	}

	public static void showAllMembers(Member[] members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(Member[] members, int targetId, String newPassword) {
		for (Member member : members) {
			int id = member.getId();
			if (id == targetId) {
				Member gotMember = member;
				gotMember.setPassword(newPassword);
				break;
			} else {
				System.out.println("該当者はいませんでした。");
			}
		}

	}
}
