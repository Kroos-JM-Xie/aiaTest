package com.aia.minproject;

import java.util.Scanner;

public class RuleImpl implements IRule {
	private int number1 ;
	private int number2 ;
	private int number3 ;

	@Override
	public String sayRule(int number) {
		// TODO Auto-generated method stub
		number1=getNumber1();
		number2=getNumber2();
		number3=getNumber3();
		String result = "";
		boolean isRule = false;
		while (number1 == number2 || number2 == number3 || number1 == number3) {
			//���������ȵ�������Ҫ���������룬ֱ��û����ȵ���Ϊֹ
			System.out.println("It is required that every number are different");
			number1 = getNumber1();
			number2 = getNumber2();
			number3 = getNumber3();
		}
		if (number % 10 == number1 || number / 10 == number1 || number / 100 == number1 || number / 1000 == number1
				|| number / 10000 == number1) {
			// ���Ϲ���5�������number% 10
			// ��ʾ��λ�ǵ�һ����������,number/10==number1��ʾʮλ�ǵ�һ���������֣��Դ�����
			result = "Fizz";
			isRule = true;
		} else {
			if (number % number1 == 0) {
				result += "Fizz";
				isRule = true;
			}

			if (number % number2 == 0) {
				result += "Buzz";
				isRule = true;
			}

			if (number % number3 == 0) {
				result += "Whizz";
				isRule = true;
			}
		}
		if (!isRule) {
			result += number;
		}
		return result;
	}

	@Override
	public int getNumber1() {
		// TODO Auto-generated method stub
		int numberOne = 0;
		Scanner b = new Scanner(System.in);
		String c = b.nextLine();

		while (!c.matches("[1-9]")) {
			System.out.println("It is wrong,please input again!!");
			c = b.nextLine();
		}
		numberOne = Integer.parseInt(c);
		return numberOne;
	}

	@Override
	public int getNumber2() {
		// TODO Auto-generated method stub
		int numberTwo = 0;
		Scanner b = new Scanner(System.in);
		String c = b.nextLine();
		while (!c.matches("[1-9]")) {
			System.out.println("It is wrong,please input again!!");
			c = b.nextLine();
		}
		numberTwo = Integer.parseInt(c);
		return numberTwo;
	}

	@Override
	public int getNumber3() {
		// TODO Auto-generated method stub
		int numberThree = 0;
		Scanner b = new Scanner(System.in);
		String c = b.nextLine();
		while (!c.matches("[1-9]")) {
			System.out.println("It is wrong,please input again!!");
			c = b.nextLine();
		}
		numberThree = Integer.parseInt(c);
		return numberThree;
	}

}
