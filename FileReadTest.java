package com.qingguatang;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.util.ArrayList;

public class FileReadTest {

    public static void main(String[] args){

        File file = new File("D:\\javasecond\\bike.txt");

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


        File newFile = new File("D:\\javasecond\\bike-filtes.txt");
        if (!newFile.exists()){

            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        BufferedWriter writer = null;
        try {
            FileWriter fileWriter = new FileWriter(newFile);

             writer = new BufferedWriter(fileWriter);
            for (Bike bike : bikes) {
                String isMall = "是";
                if (!bike.isMall()){
                    isMall = "否";

                }

                String Line = bike.getBrand() + "|" + bike.getType() + "|" + isMall + "|" + bike.getPublishTime() + "\n";
                writer.write(Line);

                writer.flush();


            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
