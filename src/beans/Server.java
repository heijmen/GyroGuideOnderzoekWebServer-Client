package beans;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;

	private static PrintWriter out;

	public Server() {
		try {
			serverSocket = new ServerSocket(1337);
			clientSocket = serverSocket.accept();
			out = new PrintWriter(clientSocket.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static synchronized void sendMessage(Message message) {
		String st = MessageAssembler.assembleMessageJson(message);
		out.println(st);
		System.out.println(st);
	}
}
