//문자열 포매팅
System.out.println(String.format('I eat %d apples.', 3)); //I eat 3 apples.
System.out.println(String.format('I eat %s apples.', 'five')); //I eat five apples.

//%c = 문자 1개
//%f = 부동 소수
//%o = 8진수
//%x = 16진수
//%% = Literal %

//문자열 정렬과 공백
System.out.println(String.format('%10s', 'hi')); //'        hi' 오른쪽 정렬.
System.out.println(String.format('%-10s', 'hi')); //'hi        ' 왼쪽 정렬.
System.out.println(String.format('%.4f', 3.42134234)); // 3.4213

//String.format과 String.out.printf의 차이
System.out.println(String.format('I eat %d apples.', 3)); //문자열을 '리턴'
System.out.printf('I eat %d apples.', 3); //문자열을 '출력'
