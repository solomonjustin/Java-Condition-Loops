package Lab6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class FileArray {
	
	public static void writeArray(String fileName, ArrayList<Integer> arrayList) throws IOException{
		//open or create the binary file
		RandomAccessFile randomAccessFile = new RandomAccessFile(fileName + ".dat", "rw");
		DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Lab6/" + fileName + ".dat"));
		
		//write array contents to the binary file
		//uses for loop
		for (int i = 0; i < arrayList.size(); i++) {
			outputStream.writeInt(arrayList.get(i));
		}
		
		//close the binary file
		outputStream.close();
		randomAccessFile.close();
	}
	
	public static void readArray(String fileName, ArrayList<Integer> arrayList) throws IOException{
		//open or create the binary file
		DataInputStream inputStream = new DataInputStream(new FileInputStream("Lab6/" + fileName + ".dat"));
		boolean endOfFile = false;
		int count = 0;
		//read from binary file
		//uses while statement
		while(!endOfFile){
			try{
				arrayList.add(count, inputStream.readInt());
			}
			catch(EOFException e){
				endOfFile = true;
			}
			
			++count;
		}
		
		for(Integer number: arrayList)
			System.out.print(number);
		
		//close the binary file
		inputStream.close();
	}

}
