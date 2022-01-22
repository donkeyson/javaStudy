String[] numbers = {'one', 'two', 'three'};
for(int i = 0; i < numbers.length; i++) { //초기치; 조건문; 증가치
  System.out.println(numbers[i]);
}

//continue
int[] marks = {90, 25, 67, 45, 80};
for(int i = 0; i < marks.length; i++) {
  if (marks[i] < 60) {
    continue;
  }
  System.out.println((i+1)+'번 학생 축하합니다. 합격합니다.'); //60 이상만 출력
}

//이중 for 문. 구구단
for(int i = 2; i < 10; i++) {
  for(int j = 1; j < 10; j++) {
    System.out.print(i*j+' '); //println은 줄바꿈문자(\를 포함해서 출력
  }
  System.out.println(''); //줄바꿈
}
