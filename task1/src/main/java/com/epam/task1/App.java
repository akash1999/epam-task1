package com.epam.task1;

import java.io.*;

/**
 * Program to write object in a file
 *
 */
 
 class Student implements Serializable{
	 public int uid;
	 public String name;
	 
	 Student(int uid, String name) {
		this.uid = uid;
		this.name = name;
	 }
 }
 
public class App 
{
    public static void main( String[] args ) {
		Student student = new Student(44, "Akash Chaudhary");
        try{
			FileOutputStream fout = new FileOutputStream("data.dat");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(student);
			out.close();
			System.out.println("Success");
		} catch(IOException e){
			System.out.println(e);
		}
    }
}
