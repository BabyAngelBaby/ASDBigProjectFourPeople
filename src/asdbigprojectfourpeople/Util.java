/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asdbigprojectfourpeople;

/**
 *
 * @author julio
 */
public class Util {
    public static String namaPesanan(String index) {
        switch (Integer.parseInt(index)) {
            case 0:
                return "Paket Keluarga";
            case 1:
                return "Paket Kombo";
            case 2:
                return "Paket Hemat";
            case 3:
                return "Paket Sultan";
            default:
                return "null bois katek indexny";
        }
    }
    
    public static String hargaDariNamaPesanan(String index) {
        switch (index) {
            case "Paket Keluarga":
                return "120.000";
            case "Paket Kombo":
                return "150.000";
            case "Paket Hemat":
                return "78.000";
            case "Paket Sultan":
                return "220.000";
            default:
                return "null bois katek indexny";
        }
    }
    
    public static String hargaModalDariNamaPesanan(String index) {
        switch (index) {
            case "Paket Keluarga":
                return "100.000";
            case "Paket Kombo":
                return "120.000";
            case "Paket Hemat":
                return "56.000";
            case "Paket Sultan":
                return "170.000";
            default:
                return "null bois katek indexny";
        }
    }
    
    public static String metodePembaaran(String index) {
        switch (Integer.parseInt(index)) {
            case 0:
                return "Cash";
            case 1:
                return "Gopay";
            case 2:
                return "Shopeepay";
            default:
                return "null bois katek indexny";
        }
    }
    
    public static String makanDi(String index) {
        switch (Integer.parseInt(index)) {
            case 0:
                return "Tempat";
            case 1:
                return "Bawa Pulang";
            default:
                return "null bois katek indexny";
        }
    }
}
