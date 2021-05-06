package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra : ");
        int num = sc.nextInt();
        boolean checkNum = true;
        if (num<2){
            System.out.println(num+" không phải số nguyên tố");
        }else {
            for (int i = 2; i< num;i++){
                if (num%i!=0){
                    checkNum = true;
                    break;
                }else {
                    checkNum = false;
                    break;
                }
            }
        }
        if (checkNum==false){
            System.out.println(num+" không phải số nguyên tố");
        }else {
            System.out.println(num+" là số nguyên tố");
        }
    }
}
