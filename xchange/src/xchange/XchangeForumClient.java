/*
* Author: Murtala Aliyu
* Useful links and credits: http://www.di.ase.md/~aursu/ClientServerThreads.html
*
* the multi-threaded chat client.
* it uses 2 threads.
* thread 1 reads data from standard input (physical input from you or me). 
* thread 1 sends standard input to server.
* thread 2 reads data from server.
* thread 2 prints out on the standard output
*/
//package xchange;
import java.io.*;
import java.util.*;
import java.net.*;

public class XchangeForumClient implements Runnable {
	
	//the client socket
	private static Socket clientSocket = null;
	//the input stream
	private static DataInputStream is = null;
	//the output stream
	private static PrintStream os = null;

	private static BufferedReader inputLine = null;
	private static boolean closed = false;

	//main
	public static void main(String[] args) {

		//host
		String host = "192.168.0.7";	//use FindServerIP class if host changes
		//chat server port
		int portNumber = 2222;

		//calibrate port
		if (args.length < 2) {
			System.out.println("Usage: default host=" + host + 
			" and random port number=" + portNumber);
		} else {
			host = args[0];
			portNumber = Integer.valueOf(args[1]).intValue();
			System.out.println("\nUsage: host=" + host + 
			" and port number=" +portNumber);
		}

		/* open a socket on given host and port. 
		 * open input stream.
		 * open output stream.
		 */
		try {
			clientSocket = new Socket(host, portNumber);
			inputLine = new BufferedReader(new InputStreamReader(System.in));
			os = new PrintStream(clientSocket.getOutputStream());
			is = new DataInputStream(clientSocket.getInputStream());
		} catch (UnknownHostException e) {
			System.err.println("Don't know about host=" + host);
		} catch (IOException e) {
			System.out.println("Couldn't get I/O for the connection to the host=" + host + "\nReason: Server is offline. Please contact [murtalaliyu10@gmail.com] for more details\n");
		}

		/*
		 * write data to the socket we have opened a connection to on the port number
		 */
		if (clientSocket != null && os != null & is != null) {
			try {
				//create a thread to read from the server
				new Thread(new XchangeForumClient()).start();
				while (!closed) {
					os.println(inputLine.readLine().trim());
				}
				
				/* close the input stream
				 * close the output stream
				 * close the socket
				 */
				is.close();
				os.close();
				clientSocket.close();
			} catch (IOException e) {
				System.err.println("IOException: " + e);
			}
		}
	} 

	/*
	 * create a thread to read from the server(non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		
		/* keep on reading from the socket till we receive "Bye" from the server.
		 * once we receive that; break.
		 */
		String responseLine;
		try {
			while ((responseLine = is.readLine()) != null) {
				System.out.println(responseLine);
				if (responseLine.indexOf("*** Bye") != -1) {
					break;
				}
			}
			closed = true;
		} catch (IOException e) {
			System.err.println("IOException: " + e);
		}
	}
}

