
public class Test {
	
	public static void main(String[]ages){
		
Person taro=new Person();
Person jiro=new Person();
Person hanako=new Person();
Person fumika=new Person();
Robot aibo=new Robot();
Robot asimo=new Robot();
Robot pepper=new Robot();
   

taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="00-0000-0000";
taro.address="神奈川県";

jiro.name="木村次郎";
jiro.age=18;
jiro.phoneNumber="03-0000-0000";
jiro.address="東京都";

hanako.name="鈴木花子";
hanako.age=16;
hanako.phoneNumber="06-0000-0000";
hanako.address="大阪府";

fumika.name="佐藤文香";
fumika.age=28;
fumika.phoneNumber="03-1234-1234";
fumika.address="東京都";


System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);
taro.talk();
taro.walk();
taro.run();

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.address);
jiro.talk();
jiro.walk();
jiro.run();

System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.address);
hanako.talk();
hanako.walk();
hanako.run();

System.out.println(fumika.name);
System.out.println(fumika.age);
System.out.println(fumika.phoneNumber);
System.out.println(fumika.address);
fumika.talk();
fumika.walk();
fumika.run();

aibo.name="aibo";
aibo.talk();
aibo.walk();
aibo.run();

asimo.name="asimo";
asimo.talk();
asimo.walk();
asimo.run();

pepper.name="papper";
pepper.talk();
pepper.walk();
pepper.run();


	}

}
