package xchange;

import java.net.*;
import java.io.*;

/*
 * This is a simple echo server. The server is dedicated to 
 * echo messages received from clients. When it receives a 
 * message it sends the message back to the client.
 */

public class ServerXchange {

	//create server socket. this is dedicated to listen/accept connections from clients
	ServerSocket xchangeServer; //equal to MyService
	try {
		xchangeServer = new ServerSocket(portNumber);
		
	} catch (IOException exceptionOne) {
		System.err.println(exceptionOne);
	}
	
	//create a client socket to communicate with client
	Socket clientSocket = null; //<-- could be serviceSocket
	try {
		serviceSocket = xchangeServer.accept();
	
	} catch (IOException exceptionTwo) {
		System.err.println(exceptionTwo);
	}
	
	//create an input stream to receive inputs from the client
	DataInputStream input;
	try {
		input = new DataInputStream(serviceSocket.getInputStream());
		
	} catch (IOException exceptionThree) {
		System.err.println(exceptionThree);
	}
	
	//create an output stream to send data to the client
	PrintStream output;
	try {
		output = new PrintStream(serviceSocket.getOutputStream());
		
	} catch (IOException exceptionFour) {
		System.err.println(exceptionFour);
	}
	
	//close the input and output streams, then the two sockets
	try {
		output.close();
		input.close();
		serviceSocket.close();
		xchangeServer.close(); //this is usually kept open as long as server is running to allow new incoming client connections
		
	} catch (IOException exceptionFive) {
		System.err.println(exceptionFive);
	}
	
}
