//append
StringBuffer sb = new StringBuffer(); //객체 sb생성
sb.append('hello');
sb.append(' ');
sb.append('jump to java');
String result = sb.toString();
System.out.println(result); //hello jump to java

//StringBuilder도 StringBuffer와 유사
StringBuilder sb = new StringBuilder();

//insert, 원하는 위치에 원하는 문자열 삽입
StringBuffer sb = new StringBuffer();
sb.append('jump to java');
sb.insert(0, 'hello ');
System.out.println(sb.toString()); //hello jump to java

//substring
StringBuffer sb = new StringBuffer();
sb.append('Hello jump to java');
System.out.println(sb.substring(0, 4)); //Hell
