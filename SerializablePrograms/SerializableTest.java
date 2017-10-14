//Serialization 

/*
	Change the objec into bytes   */

import java.io.*;
import java.util.*;

//convert the objec of this class to bytes so it must implement Serializable
class Officer implements Serializable
{
	public int id;
	public String name;

}

class SerialTest
{
	public static void main(String[] args)throws Exception 
	{

		FileOutputStream fout = new FileOutputStream("objectFile.txt");

		ObjectOutputStream os  = new ObjectOutputStream(fout);

		Officer man = new Officer();
		//man.show();

		man.id= 5;
		man.name = "rajesh";

		os.writeObject(man);

		System.out.println("Object saved in the file\n");
	}
}