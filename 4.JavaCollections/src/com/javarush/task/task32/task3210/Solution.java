package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String... args) throws IOException {
            String fileName = args[0];
            long position = Long.parseLong(args[1]);
            String text = args[2];
            byte[] buffer = new byte[text.getBytes().length];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        raf.seek(position);
        raf.read(buffer, 0, text.length());
        raf.seek(raf.length());
        if (convertByteToString(buffer).compareTo(text) != 0) {
            raf.write("false".getBytes());
        }
        else {
            raf.write("true".getBytes());
        }
        raf.close();
    }

    public static String convertByteToString(byte readBytes[])
    {
        return new String(readBytes);
    }
}
