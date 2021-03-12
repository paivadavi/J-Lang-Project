package com.jlang;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class JLangFile {

    /*
        Necessary methods:

            boolean isContained = Checks if the word is contained in the file or not

            writeWord = Writes word in the file

            FileSorter = Sorts all the words contained in the file alphabetically


     */

    /*

    WriteWord

    Problems: It does Write the word, but it erases the ones that were there before. how to solve this?


    */

    public static String databasePathStr = "C:\\My Coding Projects\\Java\\J-Lang\\J-Lang Files - Davi\\Database.txt";

    public static void writeWord(String userWord){

        File database = new File(databasePathStr);

        try {

            FileWriter fileWriter = new FileWriter(database,true);//A stream that connects to the text file
            //that true parameter will prevent the FileWriter from overwriting the words.

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);//Connect the FileWriter

            bufferedWriter.write( userWord + "\n");//Writes word on the File

            bufferedWriter.close();//Closes the stream

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static boolean isContained(String userWord){
        /*
            There are two ways in which I know I can do this:

            1 - By using iterating and using BufferedReader

            2 - By using File.readAllLines( ) and iterating over the returned List

         */

        File database;

        database = new File(databasePathStr);

        Path databasePath = database.toPath();//File.toPath() method

        String currentWord;


        try {
            List<String> fileWords = Files.readAllLines(databasePath);//This method takes a Path class object as input.
            Iterator<String> fileWordsIterator = fileWords.iterator();

            while(fileWordsIterator.hasNext()){
                currentWord = fileWordsIterator.next();
                if(!currentWord.equalsIgnoreCase(userWord)) {
                    return true;
                }


            }



        } catch (IOException e) {
            e.printStackTrace();
        }


        return false;
    }
    }

