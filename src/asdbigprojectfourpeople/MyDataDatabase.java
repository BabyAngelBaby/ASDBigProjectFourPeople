/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asdbigprojectfourpeople;

import java.util.Arrays;

/**
 *
 * @author julio
 */
public class MyDataDatabase {

    private String[][] data;
    private int size;

    MyDataDatabase(int outer, int inner) {
        this.size = 0;
        this.data = new String[outer][inner];
    }

    public void sortingData(int index) {
        if (index == 0) {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (Long.valueOf(this.getData()[i][7]) > Long.valueOf(this.getData()[j][7])) {
                        String[] temp = data[j];
                        data[j] = data[i];
                        data[i] = temp;
                    }
                }
            }
        } else if (index == 1) {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (Long.valueOf(this.getData()[i][7]) < Long.valueOf(this.getData()[j][7])) {
                        String[] temp = data[j];
                        data[j] = data[i];
                        data[i] = temp;
                    }
                }
            }
        }
    }
    
    public String[][] searchData(String find) {
        MyDataDatabase result = new MyDataDatabase(1,8);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j].contains(find)) {
                    result.push(data[i]);
                    break;
                }
            }
        }
        return result.getData();
    }

    public String[][] getData() {
        return data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(String[] inputData) {
        if (size >= this.data.length) {
            this.data = Arrays.copyOf(data, data.length + 1);
            this.data[size] = inputData;
        } else {
            this.data[size] = inputData;
        }
        this.size++;
    }

    public void tampilData() {
        System.out.println("Antrian Pada Data : ");
        for (int i = 0; i < this.size; i++) {
            System.out.printf("Antrian %d : ", (i + 1));
            for (var j = 0; j < this.data[i].length; j++) {
                if (j == 0) {
                    System.out.print("[ ");
                }
                System.out.print(j == this.data[i].length - 1 ? data[i][j] + " ]" : data[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
