package me.mdzs.ais_3;

public class Earthquake {
    public boolean A1;
    public boolean A3;
    public boolean A4;
    public boolean A6_1;
    public boolean A6_2;
    public boolean A6_3;
    public boolean A5;
    public boolean A9_1;
    public boolean A9_2;
    public boolean A8_1;
    public boolean A8_2;
    public boolean A7;
    public boolean A10;
    public boolean A11;
    public boolean A12_1;
    public boolean A12_2;

    public Earthquake() {
        this.A1 = false;
        this.A3 = false;
        this.A4 = false;
        this.A6_1 = false;
        this.A6_2 = false;
        this.A6_3 = false;
        this.A5 = false;
        this.A9_1 = false;
        this.A9_2 = false;
        this.A8_1 = false;
        this.A8_2 = false;
        this.A7 = false;
        this.A10 = false;
        this.A11 = false;
        this.A12_1 = false;
        this.A12_2 = false;
    }
    public Earthquake(boolean A1, boolean A3, boolean A4, boolean A6_1, boolean A6_2, boolean A6_3, boolean A5,
                      boolean A9_1, boolean A9_2, boolean A8_1, boolean A8_2, boolean A7, boolean A10,
                      boolean A11, boolean A12_1, boolean A12_2) {
        this.A1 = A1;
        this.A3 = A3;
        this.A4 = A4;
        this.A6_1 = A6_1;
        this.A6_2 = A6_2;
        this.A6_3 = A6_3;
        this.A5 = A5;
        this.A9_1 = A9_1;
        this.A9_2 = A9_2;
        this.A8_1 = A8_1;
        this.A8_2 = A8_2;
        this.A7 = A7;
        this.A10 = A10;
        this.A11 = A11;
        this.A12_1 = A12_1;
        this.A12_2 = A12_2;
    }
    public String resultOfDegree() {
        String result = "";
        if (A12_1 || A12_2) return result = "Degree 12";
        else if (A11) return result = "Degree 11";
        else if (A10) return result = "Degree 10";
        else if (A9_1 || A9_2) return result = "Degree 9";
        else if (A8_1 || A8_2) return result = "Degree 8";
        else if (A7) return result = "Degree 7";
        else if (A6_1 || A6_2 || A6_3) return result = "Degree 6";
        else if (A5) return result = "Degree 5";
        else if (A4) return result = "Degree 4";
        else if (A3) return result = "Degree 3";
        else if (A1) return result = "Degree 1";
        else return result;
    }
}
