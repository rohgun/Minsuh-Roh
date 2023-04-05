import java.util.Scanner;
 class Phone{
	String name;
	String tel;
	public boolean search(int d, String searchName) {
		int i=0;
		if(name.equals(searchName))
			return true;
		else return false;
	}
}
public class PhoneBook {
	public static void main(String [] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.print("인원수>>");
	int d = scanner.nextInt();
	Phone phone[] = new Phone[d];
	for(int i=0;i<d;i++)
		phone[i]=new Phone();
	for(int i=0; i<d;i++) {
		System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
		String name = scanner.next();
		phone[i].name = name;
		String tel = scanner.next();
		phone[i].tel = tel;
	}
	System.out.println("저장되었습니다...");
	for(;;) {
	System.out.print("검색할 이름>>");
	String searchName = scanner.next();
	if(searchName.equals("그만")) break;
	for(int i=0; i<d;i++) {
		if(true==phone[i].search(d,searchName))
{System.out.println(searchName+"의 번호는 " +phone[i].tel+ "입니다.");
	break;
}
else if(false==phone[i].search(d, searchName)&&i==d-1)
	System.out.println(searchName+"이 없습니다.");
	}
	}
}
}