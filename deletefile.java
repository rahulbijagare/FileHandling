package com.filehandling;
import java.io.File; 


public class deletefile {
	public static void main(String[] args) {
		File Obj = new File("myfile.txt");
        if (Obj.delete()) {
            File myObj = null;
			System.out.println("The deleted file is : "
                               + myObj.getName());
        }
        else {
            System.out.println(
                "Failed in deleting the file.");
        }
	
	}
}



