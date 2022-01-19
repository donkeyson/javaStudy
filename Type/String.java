//문자열
String a = new String('Haapy Java'); //new는 객체 생성을 의미
String a = 'happy java'; //리터럴 표기

//원시(primitive) 자료형. 원시 자료형은 new 키워드로 값 생성 불가능.
boolean result = true;
char capitalC = 'C';
int i = 100000;

//Wrapper 클래스. 객체를 주고받을 수 있게하는 클래스 
//integer, Long, Double, Float, Boolean, Char

//문자열 내장 메소드
String a = 'hello';
String b = 'java';
System.out.println(a.equals(b)); // false

//객체 구분 
String a = 'hello';
String b = new String('hello');
System.out.println(a.equals(b)); // true
System.out.println(a == b); // false, 서로 다른 객체이기 때문에.

//indexOf, 인덱스 위치
String a = 'Hello Java';
System.out.println(a.indexOf('Java')); //6

//contains, 포함 여부
String a = 'Hello Java';
System.out.println(a.contains('Java')); //true

//charAt, 특정 위치 문자 리턴
String a = 'Hello Java';
System.out.println(a.charAt(6)); //J

//replaceAll, 특정 문자열 바꾸기
String a = 'Hello Java';
System.out.println(a.replaceAll('Java', 'World')); //Hello World

//substring, 특정 부분 뽑아내기
String a = 'Hello Java';
System.out.println(a.substring(0, 4)); //Hell, 4번째 인덱스는 포함x

//toUpperCase, 대문자 변경
String a = 'Hello Java';
System.out.println(a.toUpperCase()); //HELLO JAVA

//split, 특정 구분자로 분리
String a = 'a:b:c:d';
String[] result = a.split(':'); //{'a', 'b', 'c', 'd'}
