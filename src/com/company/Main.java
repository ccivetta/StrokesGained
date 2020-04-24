package com.company;
import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Double> T = new ArrayList<>();
    static ArrayList<Double> f1 = new ArrayList<>();
    static  ArrayList<Double> f2= new ArrayList<>();
    static ArrayList<Double> f3= new ArrayList<>();
    static ArrayList<Double> f4= new ArrayList<>();
    static  ArrayList<Double> f5= new ArrayList<>();
    static  ArrayList<Double> f6= new ArrayList<>();
    static ArrayList<Double> f7= new ArrayList<>();
    static ArrayList<Double> r1= new ArrayList<>();
    static ArrayList<Double> r2= new ArrayList<>();
    static ArrayList<Double> r3= new ArrayList<>();
    static ArrayList<Double> r4= new ArrayList<>();
    static ArrayList<Double> r5= new ArrayList<>();
    static ArrayList<Double> r6= new ArrayList<>();
    static ArrayList<Double> r7= new ArrayList<>();
    static ArrayList<Double> s1= new ArrayList<>();
    static ArrayList<Double> s2= new ArrayList<>();
    static ArrayList<Double> s3= new ArrayList<>();
    static ArrayList<Double> s4= new ArrayList<>();
    static ArrayList<Double> s5= new ArrayList<>();
    static ArrayList<Double> s6= new ArrayList<>();
    static ArrayList<Double> s7= new ArrayList<>();
    static ArrayList<Double> x1= new ArrayList<>();
    static ArrayList<Double> x2= new ArrayList<>();
    static ArrayList<Double> x3= new ArrayList<>();
    static ArrayList<Double> x4= new ArrayList<>();
    static ArrayList<Double> x5= new ArrayList<>();
    static ArrayList<Double> x6= new ArrayList<>();
    static ArrayList<Double> x7= new ArrayList<>();
    static ArrayList<Double> g1= new ArrayList<>();
    static ArrayList<Double> g2= new ArrayList<>();
    static ArrayList<Double> g3= new ArrayList<>();
    static ArrayList<Double> g4= new ArrayList<>();
    static ArrayList<Double> g5= new ArrayList<>();
    static ArrayList<Double> g6= new ArrayList<>();
    static ArrayList<Double> g7= new ArrayList<>();
    static ArrayList<Double> g8= new ArrayList<>();
    static ArrayList<Double> g9= new ArrayList<>();
    static ArrayList<Double> g10= new ArrayList<>();
    static ArrayList<Double> g11= new ArrayList<>();
    static ArrayList<Double> g12= new ArrayList<>();
    static ArrayList<Double> g13= new ArrayList<>();
    static ArrayList<Double> g14= new ArrayList<>();
    static ArrayList<Double> g15= new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Double> gDistances = new ArrayList<>();
    static int hole = 1;
    static double num1 = 0;
    static double num2 = 0;
    static ArrayList<String> shots = new ArrayList<>();
    static ArrayList<Double> distances = new ArrayList<>();
    static double[] Tvalues = {0, 0, 0, 0, 2.92, 2.99, 2.97, 2.99, 3.05, 3.12, 3.17, 3.25, 3.45, 3.65, 3.71, 3.79, 3.86, 3.92, 3.96, 3.99, 4.02, 4.08, 4.17, 4.28, 4.41, 4.54, 4.65, 4.74, 4.79, 4.82};
    static double[] Rvalues = {2.59, 2.78, 2.91, 2.96, 3.02, 3.08, 3.15, 3.23, 3.31, 3.42, 3.53, 3.64, 3.74, 3.83, 3.9, 3.95, 4.02, 4.11, 4.21, 4.3, 4.34, 4.39, 4.48, 4.59, 4.72, 4.85, 4.97, 5.05, 5.1, 5.13};
    static double[] Svalues = {2.53, 2.82, 3.15, 3.24, 3.23, 3.21, 3.22, 3.28, 3.4, 3.55, 3.7, 3.84, 3.93, 4, 4.04, 4.12, 4.26, 4.41, 4.55, 4.69, 4.73, 4.78, 4.87, 4.98, 5.11, 5.24, 5.36, 5.44, 5.49, 5.52};
    static double[] Gvalues = {1.04, 1.13, 1.23, 1.34, 1.42, 1.5, 1.56, 1.61, 1.78, 1.87, 1.98, 2.06, 2.14, 2.21, 2.4, 0.0};
    static double[] Xvalues = {0, 0, 0, 0, 3.8, 3.78, 3.8, 3.81, 3.82, 3.87, 3.92, 3.97, 4.03, 4.1, 4.2, 4.31, 4.44, 4.56, 4.66, 4.75, 4.79, 4.84, 4.93, 5.04, 5.17, 5.3, 5.42, 5.5, 5.55, 5.58};
    static double[] Fvalues = {2.4, 2.6, 2.7, 2.75, 2.8, 2.85, 2.91, 2.98, 3.08, 3.19, 3.32, 3.45, 3.58, 3.69, 3.78, 3.84, 3.88, 3.95, 4.03, 4.11, 4.15, 4.2, 4.29, 4.4, 4.53, 4.66, 4.78, 4.86, 4.91, 4.94};

    public static void startHole(int h, ArrayList<String> shots) {
        System.out.println("Hole " + h + ":");

    }

    public static void doit(){
        double d = Double.parseDouble(shots.get(shots.size()-2).substring(shots.get(shots.size()-2).indexOf(" ")).trim());
        //System.out.println("slot = " + slot);
        char c = shots.get(shots.size()-2).charAt(0);
        d = getDistance(d, distances, gDistances, c);
        //System.out.println(d);
        int slot;
        if (c == 'g' || c == 'G'){
            slot = gDistances.indexOf(d);
        } else {
            slot = distances.indexOf(d);
        }
        //System.out.println("str = " + c);
        double d2 = Double.parseDouble(shots.get(shots.size()-1).substring(shots.get(shots.size()-1).indexOf(" ")).trim());
        //System.out.println("d2 = " + d2);
        //System.out.println("slot2 = " + slot2);
        char c2 = shots.get(shots.size()-1).charAt(0);
        d2 = getDistance(d2, distances, gDistances, c2);
        //System.out.println(d2);
        int slot2;
        if (c2 == 'g' || c2 == 'G'){
            slot2 = gDistances.indexOf(d2);
        } else {
            slot2 = distances.indexOf(d2);
        }

        //System.out.println("str2 = " + c2);
        if (c == 'T' || c == 't') {
            num1 = Tvalues[slot];
        } else if (c == 'F' || c == 'f') {
            num1 = Fvalues[slot];
        } else if (c == 'X' || c == 'x') {
            num1 = Xvalues[slot];
        } else if (c == 'S' || c == 's') {
            num1 = Svalues[slot];
        } else if (c == 'R' || c == 'r') {
            num1 = Rvalues[slot];
        } else if (c == 'G' || c == 'g'){
            num1 = Gvalues[slot];
        }
        if (c2 == 'T' || c2 == 't') {
            num2 = Tvalues[slot2];
        } else if (c2 == 'F' || c2 == 'f') {
            num2 = Fvalues[slot2];
        } else if (c2 == 'X' || c2 == 'x') {
            num2 = Xvalues[slot2];
        } else if (c2 == 'S' || c2 == 's') {
            num2 = Svalues[slot2];
        } else if (c2 == 'R' || c2 == 'r') {
            num2 = Rvalues[slot2];
        } else if (c2 == 'G' || c2 == 'g'){
            num2 = Gvalues[slot2];
        }
        Double diff = (num1 - 1) - num2;
        if (c == 'T' || c == 't') {
            T.add(diff);
        } else if (c == 'F' || c == 'f') {
            if (slot >= 0 && slot <=1){
                f1.add(diff);
            } else if (slot >= 2 && slot <= 3){
                f2.add(diff);
            }else if (slot >= 4 && slot <= 5){
                f3.add(diff);
            }else if (slot >= 6 && slot <= 7){
                f4.add(diff);
            }else if (slot >= 8 && slot <= 9){
                f5.add(diff);
            }else if (slot >= 10 && slot <= 11) {
                f6.add(diff);
            }else if (slot >= 12 && slot <= 13) {
                f7.add(diff);
            }
        } else if (c == 'X' || c == 'x') {
            if (slot >= 0 && slot <=1){
                x1.add(diff);
            } else if (slot >= 2 && slot <= 3){
                x2.add(diff);
            }else if (slot >= 4 && slot <= 5){
                x3.add(diff);
            }else if (slot >= 6 && slot <= 7){
                x4.add(diff);
            }else if (slot >= 8 && slot <= 9){
                x5.add(diff);
            }else if (slot >= 10 && slot <= 11) {
                x6.add(diff);
            }else if (slot >= 12 && slot <= 13) {
                x7.add(diff);
            }
        } else if (c == 'S' || c == 's') {
            if (slot >= 0 && slot <=1){
                s1.add(diff);
            } else if (slot >= 2 && slot <= 3){
                s2.add(diff);
            }else if (slot >= 4 && slot <= 5){
                s3.add(diff);
            }else if (slot >= 6 && slot <= 7){
                s4.add(diff);
            }else if (slot >= 8 && slot <= 9){
                s5.add(diff);
            }else if (slot >= 10 && slot <= 11) {
                s6.add(diff);
            }else if (slot >= 12 && slot <= 13) {
                s7.add(diff);
            }
        } else if (c == 'R' || c == 'r') {
            if (slot >= 0 && slot <=1){
                r1.add(diff);
            } else if (slot >= 2 && slot <= 3){
                r2.add(diff);
            }else if (slot >= 4 && slot <= 5){
                r3.add(diff);
            }else if (slot >= 6 && slot <= 7){
                r4.add(diff);
            }else if (slot >= 8 && slot <= 9){
                r5.add(diff);
            }else if (slot >= 10 && slot <= 11) {
                r6.add(diff);
            }else if (slot >= 12 && slot <= 13) {
                r7.add(diff);
            }
        } else if (c == 'G' || c == 'g') {
            if (slot == 0){
                g1.add(diff);
            } else if (slot == 1){
                g2.add(diff);
            }else if (slot == 2){
                g3.add(diff);
            }else if (slot == 3){
                g4.add(diff);
            }else if (slot ==4){
                g5.add(diff);
            }else if (slot == 5){
                g6.add(diff);
            }else if (slot == 6){
                g7.add(diff);
            }else if (slot == 7){
                g8.add(diff);
            }else if (slot == 8){
                g9.add(diff);
            }else if (slot == 9){
                g10.add(diff);
            }else if (slot == 10){
                g11.add(diff);
            }else if (slot == 11){
                g12.add(diff);
            }else if (slot == 12){
                g13.add(diff);
            }else if (slot == 13){
                g14.add(diff);
            }else if (slot == 14){
                g15.add(diff);
            }
        }
    }

    public static double average(ArrayList<Double> a) {
        double av = 0;
        for (Double aDouble : a) {
            av += aDouble;
        }
        if (a.size() != 0){
            return Math.round((av / a.size())*100.0)/100.0;
        }
        return 0;
    }

    public static int addShot(ArrayList<String> shots, String s) {

        if (s.length() <= 2){
            return 2;
        }
        char c = s.charAt(0);
        if (s.equalsIgnoreCase("end")) {
            return 1;
        } else if (s.indexOf(' ') == -1){
            return 2;
        } else if (!(c == 'f' || c == 'F' || c == 'g' || c == 'G'|| c == 'r'|| c == 'R'|| c == 'x'|| c == 'X'|| c == 's'|| c == 'S'|| c == 't'|| c == 'T')){
            return 2;
        }
        shots.add(s);
        return 0;
    }

    public static double getDistance(double d, ArrayList<Double> distances, ArrayList<Double> gDistances, char c){
        boolean trip = false;
        double dx = d;
        if (c != 'g' && c != 'G'){
            if (distances.indexOf(d) != -1){
                return d;
            }
            if (d < 30){
                return 20;
            }
            if (d >= 590){
                return 600;
            }
            double r = d%10;
            if (r >= 5){
                dx += (10 - r);
                if (distances.indexOf(dx) != -1) {
                    return dx;
                } else {
                    return (d - r);
                }
            } else {
                dx -= r;
                if (distances.indexOf(dx) != -1) {
                    return dx;
                } else {
                    return (d + (10 - r));
                }
            }
        } else {
            if (d == 0){
                return 0;
            }
            d = Math.round(d);
            if (d < 3){
                return 3;
            }
            if (d >= 13 && d < 18){
                return 15;
            }
            if (d >= 75){
                return 90;
            }
            if (d >= 60){
                return 60;
            }
            if (gDistances.indexOf(d) != -1) {
                return d;
            }
                double r = d%10;
                if (r >= 5){
                    dx += (10 - r);
                    if (gDistances.indexOf(dx) != -1) {
                        return dx;
                    } else {
                        return (d - r);
                    }
                } else {
                    dx -= r;
                    if (gDistances.indexOf(dx) != -1) {
                        return dx;
                    } else {
                        return (d + (10 - r));
                    }
                }
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            distances.add((double) (20 * i));
            //System.out.print(distances.get(i-1) + " ");
        }
        for (int i = 3; i < 11; i++){
            gDistances.add((double)i);
        }
        gDistances.add(15.0);
        for (int i = 2; i < 7; i++){
            gDistances.add((double)(i*10));
        }
        gDistances.add(90.0);
        gDistances.add(0.0);
        System.out.println("Commands:\nTee->T\nFairway->F\nRough->R\nSand->S\nRecovery->X\nGreen->G");
        System.out.println("Input all shots on this hole in format \"Shot Type, Distance\". Type \"End\" when finished");
        startHole(hole, shots);
        int iter = 1;
        while (true) {
            int er = addShot(shots, scan.nextLine());
            if (er == 1) {
                if (iter == 1) {
                    break;
                }
                shots.add("g, 0");
                doit();
                hole++;
                startHole(hole, shots);
                shots.clear();
                iter = 1;
                continue;
            }
            if (er == 2){
                System.out.println("Error: Incorrect format. Please try again.");
                continue;
            }
            if (iter != 1) {
                doit();
            }
            iter++;
        }

        System.out.println("Tee:\n\tAll: " + average(T));
        System.out.println("Fairway:\n\t20-40: " + average(f1) + "\n\t60-80: " + average(f2) + "\n\t100-120: " + average(f3) + "\n\t140-160: " + average(f4) + "\n\t180-200: " + average(f5) + "\n\t220-240: " + average(f6) + "\n\t260-280: " + average(f7));
        System.out.println("Rough:\n\t20-40: " + average(r1) + "\n\t60-80: " + average(r2) + "\n\t100-120: " + average(r3) + "\n\t140-160: " + average(r4) + "\n\t180-200: " + average(r5) + "\n\t220-240: " + average(r6) + "\n\t260-280: " + average(r7));
        System.out.println("Sand:\n\t20-40: " + average(s1) + "\n\t60-80: " + average(s2) + "\n\t100-120: " + average(s3) + "\n\t140-160: " + average(s4) + "\n\t180-200: " + average(s5) + "\n\t220-240: " + average(s6) + "\n\t260-280: " + average(s7));
        System.out.println("Recovery:\n\t20-40: " + average(x1) + "\n\t60-80: " + average(x2) + "\n\t100-120: " + average(x3) + "\n\t140-160: " + average(x4) + "\n\t180-200: " + average(x5) + "\n\t220-240: " + average(x6) + "\n\t260-280: " + average(x7));
        System.out.println("Green:\n\t1-3: " + average(g1) + "\n\t4: " + average(g2)+ "\n\t5: " + average(g3)+ "\n\t6: " + average(g4)+ "\n\t7: " + average(g5)+ "\n\t8: " + average(g6)+ "\n\t9: " + average(g7)+ "\n\t10: " + average(g8)+ "\n\t15: " + average(g9)+ "\n\t20: " + average(g10)+ "\n\t30: " + average(g11)+ "\n\t40: " + average(g12)+ "\n\t50: " + average(g13)+ "\n\t60: " + average(g14)+ "\n\t90: " + average(g15));
    }
}
