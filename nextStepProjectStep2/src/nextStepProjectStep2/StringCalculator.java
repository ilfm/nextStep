package nextStepProjectStep2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public void stringCalculator(String str) {
		
		String pattern = "[\\,\\:]";
		str = str.replaceAll(pattern, "");
		System.out.println("str===="+str);
		
	}
	
	// 구분자 찾기 
	public void findCustomSeperator(String str ) {
		
		String result ="";
		Pattern pattern = Pattern.compile("//(.)\n(.*)");
		Matcher matcher = pattern.matcher(str);
		String str2 = "";
		String seperator = "";
		String[] num ;
		while(matcher.find()) {
			//System.out.println(matcher.group(1).trim()+"222");
			//System.out.println(matcher.group(2).trim()+"222");
		
			if(matcher.group(1)==null) {
				break;
			}
			seperator =  matcher.group(1).trim();
			str2 =  matcher.group(2).trim();
		}
		num = str2.split(seperator);
		int total =0;
		for(int i =0; i<num.length;i++){
			System.out.println(Integer.parseInt(num[i]));
			total += Integer.parseInt(num[i]);
			
		}
		System.out.println("total==="+total);
		if(total<0) {
			throw new RuntimeException("음수예용~");
		}
		
		
	}
	
	public void cutomStringCalculator(String str) {
		
		// custom 구분자 찾기
		
		// 구분자로 없애기 
		
	}
}

// 검색해볼것 
// 1. Pattern
// 2. Matcher


// 하면서 느낀점
/*
 * 1. 깃에 올리면  서로 소스 공유하고 스터디하기 좋을듯 
 * 
 *  이게 첨부터 검색해서 하니깐 너무 빠른 답을 찾는 느낌
 *  그래서 이러면 안될것 같아 삽질좀 하고 ㅋ
 *  2차 부터는 그렇게 해야겠다.
 * 2. 뭘 나누면 좋을까? 
 *    하면서 시행착오, 새로 알게 된거 키워드 공유(깊게 간단하게 알기) 
 *    - 뭔가 하나 골라서 좀 알려주기 이런거..
 *    
 *  2차는 좀 어려워 보이는데 기간을 좀 길게 잡아야 할것 같은데
 *  이게 안 지루하고 잘 하려면 어케해야할까? * 
 * 
 * */
// 하면서 느낀점, 좀 잘게 쪼개서 해야할것 같음 안그럼 몰아서 하니깐 
// 하면서 새로 알게 된 것 키워드만 정리 
