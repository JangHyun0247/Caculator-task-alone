if (count >= intArray.length){
//index 9까지 다 밀기
for (int i = 0; i < intArray.length -1; i++) {
intArray[i] = intArray[i+1];
}
//다 밀면 index 9가 비니깐 (마지막 index 9) result 넣기
intArray[intArray.length-1] = result;
} else {
intArray[count] = result;
count++;
}
System.out.println(Arrays.toString(intArray));