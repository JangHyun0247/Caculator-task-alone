package calculator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int result = 0;
        String exit;

        ArrayList<Integer> resultList = new ArrayList<>();

        do {

            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과는 : " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과는 : " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과는 : " + result);
                    break;
                case '/':
                    if (!(num2 == 0)) {
                        result = num1 / num2;
                        System.out.println("결과는 : " + result);
                    } else System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호를 입력해주세요!");
            }

            resultList.add(result);

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제) : ");
            String remove = sc.next();
            if(remove.equals("remove")) {
                resultList.removeFirst();
            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
            String inquiry = sc.next();
            if(inquiry.equals("inquiry")) {
                System.out.println(resultList.toString());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            exit = sc.next();
        } while (!exit.equals("exit"));
    }
}
