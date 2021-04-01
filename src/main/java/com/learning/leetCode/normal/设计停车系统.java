package com.learning.leetCode.normal;

public class 设计停车系统 {

    int[] bigNum;
    int[] mediumNum;
    int[] smallNum;
    public void parkingSystem(int big, int medium, int small) {
        bigNum = new int[big];
        mediumNum = new int[medium];
        smallNum = new int[small];
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            for (int i = 0; i < bigNum.length; i++) {
                if (bigNum[i] == 0) {
                    bigNum[i] = 1;
                    return true;
                }
            }
        }else if(carType == 2) {
            for (int i = 0; i < mediumNum.length; i++) {
                if (mediumNum[i] == 0) {
                    mediumNum[i] = 1;
                    return true;
                }
            }
        }else if(carType == 3) {
            for (int i = 0; i < smallNum.length; i++) {
                if (smallNum[i] == 0) {
                    smallNum[i] = 1;
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {


    }

}
