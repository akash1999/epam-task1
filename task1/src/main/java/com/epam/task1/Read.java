package com.epam.task1;

import java.io.*;

/**
 * Program to read object in a file
 *
 */
 
public class Read
{
    public static void main( String[] args ) {
        try{
			FileInputStream fin = new FileInputStream("data.dat");
			ObjectInputStream in = new ObjectInputStream(fin);
			Student student = (Student) in.readObject();
			in.close();
			System.out.println("uid: " + student.uid);
			System.out.println("Name: " + student.name);
		} catch(Exception e){
			System.out.println(e);
		}
    }
}
