package com.one;

import java.util.Random;

public class LottoWin {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random ran = new Random();
		// for������ �迭�� �Է� �ޱ�
		for (int i = 0; i < arr.length; i++) {
			int rNum = ran.nextInt(45) + 1;
			arr[i] = rNum;
			// �ߺ�ȸ��
			for (int j = 0; j < i; j++) {
				if (arr[j] == rNum) {
					i = i - 1;
				}
			}
		}
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
