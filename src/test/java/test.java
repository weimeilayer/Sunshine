import org.apache.commons.lang.RandomStringUtils;

import com.sunshine.util.MD5Util;

public class test {
	//生成邀请码
	public static String getRandomChar(){
		String randChar = "";
		for (int i = 0; i < 6; i++) {
			int index = (int) Math.round(Math.random() * 1);
			switch (index) {
			case 0:// 大写字符
				randChar += String
						.valueOf((char) Math.round(Math.random() * 25 + 65));
				break;
			default:// 数字
				randChar += String.valueOf(Math.round(Math.random() * 9));
				break;
			}
		}
		return randChar;
	}
	//测试
	public static void main(String[] args) {
		//md5加密
		String password="123456";
		System.out.println(MD5Util.encode(password));
		//生成6位码
		System.out.println(getRandomChar());
		//任意随机数(6)
		String code=RandomStringUtils.randomNumeric(6);
		System.out.println(code);
	}
}
