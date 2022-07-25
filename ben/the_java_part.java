import java.io.IOException;
// don't worry about it

class Next {
    public static void main(String [] args){

        System.out.println("\nHello I am Java");

        // create a ProcessBuilder instance and execute it
        try{
            ProcessBuilder pb = new ProcessBuilder("./java_to_c.sh");

            // prevents packageless IO issues
            pb.inheritIO();

            // run shell script
            pb.start();
        }

        // IOException
        catch(IOException e){
            e.printStackTrace();
        }
     
    }
}
