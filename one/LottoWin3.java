package com.one;

import java.util.Arrays;
import java.util.Random;

public class LottoWin3 {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random ran = new Random();
		// for문으로 배열에 입력 받기
		ranLotto(arr, ran);
		sortLotto(arr);
	}
	private static void ranLotto(int[] arr, Random ran) {
		for (int i = 0; i < arr.length; i++) {
			int rNum = ran.nextInt(45) + 1;
			arr[i] = rNum;
			// 중복회피
			for (int j = 0; j < i; j++) {
				if (arr[j] == rNum) {
					i = i - 1;
				}
			}
		}
		// Arrays.sort(arr); //정렬
		// 정렬 알고리즘
		System.out.println(arr[0] + "," + arr[1] + "," 
				+ arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5]);
	}
	private static void sortLotto(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]){
					int num = arr[j];
					arr[j] = arr[i];
					arr[i] = num;
				}
			}
		}
		System.out.print(arr[0] + "," + arr[1] + "," 
		+ arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5]);
	}
}