package com.demo.io;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Main {

	public static void main(String args[]){
		
		
		
		Path path=FileSystems.getDefault().getPath("WebRoot", "index.jsp");
		
		//System.out.println(path.`)
		
		try {
			nioFileStoreSpace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*Path currentDirectory = Paths.get("").toAbsolutePath();
		
		System.out.println(currentDirectory);
		
		
		
		
		try {
			nioBasicFileAttributes(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		
	}
	
	public static void nioFileStoreSpace() throws IOException {

		// Loop through the set of FileStores for the default FileSystem
		for (FileStore fileStore : FileSystems.getDefault().getFileStores()) {
			System.out.println("Name: " + fileStore.name());
			System.out.println("Type: " + fileStore.type());
			System.out.println("Total Space (MB): " + fileStore.getTotalSpace()
					/ 1024 / 1024);
			System.out.println("Unallocated Space (MB): "
					+ fileStore.getUnallocatedSpace() / 1024 / 1024);
			System.out.println("Usable Space (MB): "
					+ fileStore.getUsableSpace() / 1024 / 1024);
		}
	}
	
	public static void nioBasicFileAttributes(Path path) throws IOException {

		BasicFileAttributes basicFileAttributes = Files.readAttributes(path,
			BasicFileAttributes.class);

		// Print basic file attributes
		System.out.println("Creation Time: "
				+ basicFileAttributes.creationTime());
		System.out.println("Last Access Time: "
				+ basicFileAttributes.lastAccessTime());
		System.out.println("Last Modified Time: "
				+ basicFileAttributes.lastModifiedTime());
		System.out.println("Size: " + basicFileAttributes.size());
		System.out.println("Is Regular file: "
				+ basicFileAttributes.isRegularFile());
		System.out
				.println("Is Directory: " + basicFileAttributes.isDirectory());
		System.out.println("Is Symbolic Link: "
				+ basicFileAttributes.isSymbolicLink());
		System.out.println("Other: " + basicFileAttributes.isOther());

		// modify the lastmodifiedtime
		FileTime newModifiedTime = FileTime.fromMillis(basicFileAttributes
				.lastModifiedTime().toMillis() + 6000000);
		Files.setLastModifiedTime(path, newModifiedTime);
		// check if the lastmodifiedtime is changed
		System.out.println("After Changing lastModifiedTime, ");
		System.out.println("Creation Time: "
				+ basicFileAttributes.creationTime());
		System.out.println("Last Access Time: "
				+ basicFileAttributes.lastAccessTime());
		System.out.println("Last Moodified Time: "
				+ basicFileAttributes.lastModifiedTime());
		}
	
	
	
}
