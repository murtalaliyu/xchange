/*
 * Author: Murtala Aliyu
 */

package xchange;

import java.net.*;
import java.io.*;

public class XchangeClient {
	
	//open a client socket on port the same port as our server (2222)
	static Socket clientSocket; 
	public static void openClientSocket() {
		try {
			int serverPortNumber = XchangeServer.portNumber;
			clientSocket = new Socket("localhost", serverPortNumber);
			
		} catch (IOException exceptionOne) {
			System.err.println(exceptionOne);
		}
	}
	
	//open an input stream to receive responses from the server
	static DataInputStream clientInputStream = null;
	public static void openClientInputStream() {
		try {
			clientInputStream = new DataInputStream(clientSocket.getInputStream());
			
		} catch (IOException exceptionTwo) {
			System.err.println(exceptionTwo);
		}
	}
	
	//open an output stream to send data to the server socket
	static PrintStream clientOutputStream = null;
	public static void openClientOutputStream() {
		try {
			clientOutputStream = new PrintStream(clientSocket.getOutputStream());
			
		} catch (IOException exceptionThree) {
			System.err.println(exceptionThree);
		}
	}

	//close the client input and output streams, then the client socket
	public static void closeClientStreamsAndSocket() {
		try {
			clientOutputStream.close();
			clientInputStream.close();
			clientSocket.close();
			
		} catch (IOException exceptionFive) {
			System.err.println(exceptionFive);
		}
	}
	
	/*
	 * -------------------------------------------------------------------------------------------------------
	 */
	
	//after socket initialization, write some data to the socket we have opened a connection to at port 2222
	static DataInputStream clientInputLine = null;
	public static void writeClientDataToSocket() {
		try {
			clientInputLine = new DataInputStream(new BufferedInputStream(System.in));
			
			//keep reading from/to the socket till we receive the "Ok" from the server
			System.out.println("The xchange client started. Type any text. To quit it type 'Ok'.");
			String serverResponseLine;
			clientOutputStream.println(clientInputLine.readLine());
			while ((serverResponseLine = clientInputStream.readLine()) != null) {
				System.out.println(serverResponseLine);
				if (serverResponseLine.indexOf("Ok") != -1) {
					break;
				}
				clientOutputStream.println(clientInputLine.readLine());
			}
			
		} catch (IOException exceptionFour) {
			System.err.println(exceptionFour);
		}
	}
	
	//run client in its entirety
	public static void runXchangeClient() {
		openClientSocket();
		openClientInputStream();
		openClientOutputStream();
		writeClientDataToSocket();
		closeClientStreamsAndSocket();
	}
	
}
