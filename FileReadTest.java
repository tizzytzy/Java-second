package com.qingguatang;
import java.io.*;
import java.util.ArrayList;

public class FileReadTest {

    public static void main(String[] args){

        File file = new File("D:\\javabiii\\bikes.txt");

        ArrayList<Bike> bikes = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);

            bufferedReader = new BufferedReader(fileReader);
            String Line = null;
            Bike bike = null;
            while ((Line = bufferedReader.readLine()) !=null){

                System.out.println(Line);

                bike = new Bike();
                bikes.add(bike);
                String [] Lines = Line.split("\\|");
                bike.setBrand(Lines[0]);
                bike.setType(Lines[1]);
                if (Lines[2].equals("是")) {
                    bike.setMall(true);
                }else {

                    bike.setMall(false);
                }
                bike.setPublishTime(Lines[3]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null){

                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        for (Bike bike : bikes) {
            if (bike.getBrand().equals("捷安特")) {
                System.out.println(bike.getType());
            }
        }
    }
}
