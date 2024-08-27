package ru.courses.otherTests;

import java.io.File;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        filePath();

    }


    public static void filePath() {
        System.out.println("Введите путь к файлу: ");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);

        boolean fileExists = file.exists();
        boolean isDirectory = file.isDirectory();
        int count = 0;

        while (isDirectory)   {


        if (fileExists){
            count+=1;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + count);
        } else {
            System.out.println("Данный путь ведет к папке. Повторите ввод.");

        }


        }

        }
    }

