import java.util.Scanner;
public class java3week {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			System.out.print("USER : ");

			int count = 0; 
			int win = 0; 
			int draw = 0; 

			String winStr = "이겼습니다 !";
			String loseStr = "졌습니다 ";

			while (true) {
				int comInt = (int) (Math.random() * 3);
				String comStr = null;
				switch (comInt) {
				case 0:
					comStr = "가위";
					break;
				case 1:
					comStr = "바위";
					break;
				case 2:
					comStr = "보";
					break;
				}

				System.out.print("가위바위보 : ");
				String userStr = sc.nextLine();

				String result = null;

				if (userStr.equals("가위") || userStr.equals("바위") || userStr.equals("보")) {
					if (comStr.equals(userStr)) {
						result = "비겼습니다.";
						draw++;
					} else {
						if (comStr.equals("가위")) {
							switch (userStr) {
							case "바위":
								result = winStr;
								win++;
								break;
							case "보":
								result = loseStr;
								break;
							}
						} else if (comStr.equals("바위")) {
							if (userStr.equals("보")) {
								result = winStr;
								win++;
							} else {
								result = loseStr;
							}
						} else {
							result = userStr.equals("가위") ? winStr : loseStr;
							if (result.equals(winStr)) {
								win++;
							}
						}

					}
				}else if(!userStr.equals("그만")) {
					System.out.println("게임을 종료합니다.... ");;
					continue;
				}else {
					break;
				}
				count++;
				System.out.println("컴퓨터 : " + comStr);
				System.out.println("USER: "   + userStr);
	          System.out.println(result);
			}
			System.out.printf("%wjs, %승 % d패 d패", count, win, draw, (count-win-draw));
		}
	}	  

