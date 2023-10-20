import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RecipeServer {
    // defining a port numer for the server
    private static final int PORT = 8080;

    // to set up listen for client connection
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println(" Recipe Server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                RecipeClient recipeClient = new RecipeClient(clientSocket);
            }
        } catch (IOException e) {
            System.err.println("Exception caught when trying to listen on port " + PORT + e.getMessage());
            e.printStackTrace();
        }

    }
}