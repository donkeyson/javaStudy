//int 자료형 배열
int[] odds = {1, 3, 5, 7, 9};

//String 자료형 배열
String[] weeks = {'월', '화', '수', '목', '금', '토', '일'};

//혹은
String[] weeks = new String[7]; //7개의 인덱스
weeks[0] = '월';
weeks[1] = '화';
weeks[2] = '수';
weeks[3] = '목';
weeks[4] = '금';
weeks[5] = '토';
weeks[6] = '일';

System.out.println(weeks[3]); //목

//배열 전체 출력하기 
for (int i = 0; i < weekslength; i++) {
  System.out.println(weeks[i]);
}
