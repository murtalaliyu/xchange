/*
 * Author: Murtala Aliyu
 */

package xchange;

import java.net.*;
import java.io.*;

/*
 * This is a simple echo server. The server is dedicated to 
 * echo messages received from clients. When it receives a 
 * message it sends the message back to the client.
 */

public class XchangeServer {
	
	//we'll use port number 2222 for now
	static int portNumber = 3333;

	//open a server socket on port 2222. Note that we cannot choose a port less than 1023 if we are not privileged (root) users
	static ServerSocket xchangeServerSocket;
	public static void openServerSocket() {
		try {
			xchangeServerSocket = new ServerSocket(portNumber);
			
		} catch (IOException exceptionOne) {
			System.out.println(exceptionOne);
		}
	}
	
	//create a socket object from the ServerSocket to listen/accept client connections
	static Socket xchangeClientSocket = null;
	public static void listenAndAcceptClientConnection() {
		System.out.println("The xchange server started. press <CTRL + C> to stop.");
		try {
			System.out.println("before");
			xchangeClientSocket = xchangeServerSocket.accept();
			System.out.println("after");
			
		} catch (IOException exceptionTwo) {
			System.out.println(exceptionTwo);
		}
	}
	
	//open an input stream to receive inputs from the client
	static DataInputStream serverInputStream;
	public static void openServerInputStream() {
		try {
			serverInputStream = new DataInputStream(xchangeClientSocket.getInputStream());
			
		} catch (IOException exceptionThree) {
			System.out.println(exceptionThree);
		}
	}
	
	//open an output stream to send data to the client
	static PrintStream serverOutputStream;
	public static void openServerOutputStream() {
		try {
			serverOutputStream = new PrintStream(xchangeClientSocket.getOutputStream());
			
		} catch (IOException exceptionFour) {
			System.out.println(exceptionFour);
		}
	}
	
	/*
	 * This isn't necessary because we're already closing on client side
	 * (not in current use) close the server input and output streams and the client socket
	 */
	public static void closeServerStreamsAndClientSocket() {
		try {
			serverOutputStream.close();
			serverOutputStream.close();
			xchangeClientSocket.close();
			
		} catch (IOException exceptionFive) {
			System.out.println(exceptionFive);
		}
	}
	
	/*
	 * close the server socket when done listening/accepting client connections.
	 * this is usually kept open as long as server is running to allow new incoming client connections
	 */
	public static void closeServerSocket() {
		try {
			xchangeServerSocket.close();
			
		} catch (IOException exceptionSix) {
			System.out.println(exceptionSix);
		}
	}
	
	/*
	 * -----------------------------------------------------------------------------------------------------------------------------
	 */
	
	//keep echoing data back to the client as long as we keep receiving the data
	static String line;
	public static void echoDataBackToClient() {
		try {
			while (true) {
				line = serverInputStream.readLine();
				serverOutputStream.println("From server: " + line);
				
				//stop listening for connections
				/*if (line.equals("stop")) {
					System.out.println("You've decided to stop this server. Bye");
					closeServerSocket();
				}*/
			}
			
		} catch (IOException exceptionSeven) {
			System.out.println(exceptionSeven);
		}
	}
	
	//run server in its entirety
	public static void runXchangeServer() {
		openServerSocket();
		listenAndAcceptClientConnection();
		openServerInputStream();
		openServerOutputStream();
		echoDataBackToClient();
	}
	
}
