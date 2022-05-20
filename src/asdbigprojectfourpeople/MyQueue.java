/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package asdbigprojectfourpeople;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author julio
 */
public class MyQueue {

    private String[][] antrian;
    private int depan, belakang, size, len;

    MyQueue(int outer, int inner) {
        this.size = outer;
        this.len = 0;
        this.antrian = new String[outer][inner];
        this.depan = -1;
        this.belakang = -1;
    }

    public boolean isEmpty() {
        return this.depan == -1;
    }

    public boolean isFull() {
        return this.depan == 0 && this.belakang == size - 1;
    }

    public void endQueue(String[] data) { // insert data ke paling akhir barisan
        if (isEmpty()) {
        	System.out.println("ab");
            this.depan = 0;
            this.belakang = 0;
            this.antrian[belakang] = data;
        } else if (this.belakang + 1 < this.size) {
            this.antrian[++belakang] = data;
        } else {
        	this.antrian = Arrays.copyOf(antrian, antrian.length + 1);
        	this.size++;
            this.antrian[++belakang] = data;
        }
        this.len++;
    }

    public String[] dequeque() { // kurangin atau pop data terdepan
        if (isEmpty()) {
            throw new NoSuchElementException("Data penuh");
        } else {
            this.len--;
            String elemen[] = this.antrian[depan];
            if (this.belakang == this.depan) {
                this.depan = -1;
                this.belakang = -1;
            } else {
                this.depan++;
            }
            return elemen;
        }
    }

	public void tampilData() {
		System.out.println("Antrian Pada Data : ");
		if (isEmpty()) System.out.println("Antrian Kosong");
		else {
			for (int i = this.depan ; i <= this.belakang; i++) {
				System.out.printf("Antrian %d : ",(i+1));
				for (var j = 0; j < this.antrian[i].length; j++) {
					if (j == 0) System.out.print("[ ");
					System.out.print(j == this.antrian[i].length - 1 ? antrian[i][j] + " ]" : antrian[i][j] + ", ");
				}
				System.out.println();
			}
		}
	}
}
