package xchange;

import java.net.*;
import java.io.*;

public class ClientXchange {
	
	//open a client socket on port 2222
	static Socket xchangeClientSocket; 
	static int portNumber = 2222;
	public static void openClientSocket() {
		try {
			xchangeClientSocket = new Socket("localhost", portNumber);
			
		} catch (IOException exceptionOne) {
			System.err.println(exceptionOne);
		}
	}
	
	//create an input stream to receive responses from the server
	static DataInputStream inputStream = null;
	public static void createInputStream() {
		try {
			inputStream = new DataInputStream(xchangeClientSocket.getInputStream());
			
		} catch (IOException exceptionTwo) {
			System.err.println(exceptionTwo);
		}
	}
	
	//create an output stream to send data to the server socket
	static PrintStream outputStream = null;
	public static void createOutputStream() {
		try {
			outputStream = new PrintStream(xchangeClientSocket.getOutputStream());
			
		} catch (IOException exceptionThree) {
			System.err.println(exceptionThree);
		}
	}
	
	//after socket initialization, write some data to the socket we have opened a connection to at port 2222
	static DataInputStream inputLine = null;
	public static void writeDataToSocket() {
		try {
			inputLine = new DataInputStream(new BufferedInputStream(System.in));
			
			//keep reading from/to the socket till we receive the "Ok" from the server
			System.out.println("The client started. Type any text. To quit it type 'Ok'.");
			String responseLine;
			outputStream.println(inputLine.readLine());
			while ((responseLine = inputStream.readLine()) != null) {
				System.out.println("client received: " + responseLine);
				if (responseLine.indexOf("Ok") != -1) {
					break;
				}
				outputStream.println(inputLine.readLine());
			}
			
		} catch (IOException exceptionFour) {
			System.err.println(exceptionFour);
		}
	}

	//close the input and output streams, then the socket
	public static void closeStreamsAndSocket() {
		try {
			outputStream.close();
			inputStream.close();
			xchangeClientSocket.close();
			
		} catch (IOException exceptionFive) {
			System.err.println(exceptionFive);
		}
	}
	
	//run client in its entirety
	public static void runXchangeClient() {
		openClientSocket();
		createInputStream();
		createOutputStream();
		writeDataToSocket();
		closeStreamsAndSocket();
	}
	
}
