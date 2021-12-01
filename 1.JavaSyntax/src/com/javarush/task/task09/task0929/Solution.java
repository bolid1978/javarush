package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream ;
        String sourceFileName;
        sourceFileName = reader.readLine();

      try {

          fileInputStream=getInputStream(sourceFileName);
      }
            catch (IOException e){
                System.out.println("Файл не существует");

                sourceFileName = reader.readLine();
                fileInputStream=getInputStream(sourceFileName);
            }

finally {

          String destinationFileName = reader.readLine();
          OutputStream fileOutputStream = getOutputStream(destinationFileName);



          fileInputStream=getInputStream(sourceFileName);
          while (fileInputStream.available() > 0) {
              int data = fileInputStream.read();
              fileOutputStream.write(data);
          }

          fileInputStream.close();
          fileOutputStream.close();

      }



    }



    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
