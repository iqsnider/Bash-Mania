import java.io.IOException;

class Next {
    public static void main(String [] args){

        System.out.println("\nHello I am Java");

        // try{
        //     Process p = Runtime.getRuntime().exec("echo Hello");
        //     p.waitFor();
        // }

        // catch(IOException e){
        //     e.printStackTrace();
        // }

        // catch(InterruptedException e){
        //     e.printStackTrace();
        // }

        try{
            ProcessBuilder pb = new ProcessBuilder("./java_to_c.sh");
            pb.inheritIO();
            pb.start();
        }

        catch(IOException e){
            e.printStackTrace();
        }
        
        // try {
        //     Process p = pb.start();
        // }

        
        // catch(IOException e){
        //     e.printStackTrace();
        // }
     
    }
}
