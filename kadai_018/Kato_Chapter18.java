package kadai_018;

import java.util.Scanner;

public abstract class Kato_Chapter18 {

	
	public String familyName = "加藤"; //姓
	public String givenName; //名
	public String address = "東京都中野区〇×"; //住所
	
	
	
	public void commonIntroduce() {
		
		System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
      //Scannerクラスのオブジェクトを生成する
      		Scanner scanner = new Scanner(System.in);
      int input = scanner.nextInt();
    }
		
    public abstract void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
	    System.out.println("");
	    }
		
	}