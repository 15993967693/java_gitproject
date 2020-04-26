package package_socket;
import java.io.*;
import java.net.*;
import java.util.*;

public class VerySimpleChatServer {
	ArrayList clientOutputStreams;
	public class ClientHandler implements Runnable{
		BufferedReader reader;
		Socket sock;
		public ClientHandler(Socket clientSocket) {
			// TODO Auto-generated constructor stub
			try {
				sock=clientSocket;
				InputStreamReader isReader=new InputStreamReader(sock.getInputStream());
				reader=new BufferedReader(isReader);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			String message;
			try {
				while((message=reader.readLine())!=null) {
					System.out.println("read "+message);
					tellEveryone(message);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		public void tellEveryone(String message) {
			// TODO Auto-generated method stub
			Iterator it=clientOutputStreams.iterator();
			while(it.hasNext()) {
				try {
					PrintWriter writer=(PrintWriter) it.next();
					writer.println(message);
					writer.flush();
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VerySimpleChatServer().go();
	}
	public void go() {
		clientOutputStreams=new ArrayList();
		try {
			ServerSocket serverSocket=new ServerSocket(5000);
			while(true) {
				Socket clientSocket=serverSocket.accept();
				PrintWriter writer=new PrintWriter(clientSocket.getOutputStream());
				clientOutputStreams.add(writer);
				
				Thread t=new Thread(new ClientHandler(clientSocket));
				t.start();
				System.out.println("got a connection");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
