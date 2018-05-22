package com.aia.minproject;

import java.util.Scanner;

public class MinProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IRule rules=new RuleImpl();
        for (int i=1;i<101;i++){
            Student student=new Student(i,rules);
            System.out.println(student.toString());
        }
	}

}
