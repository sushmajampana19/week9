import java.io.*;
class file{
    public static void main(String[]args){
        FileInputStream input=null;
        FileOutputStream output=null;
    try{
        input=new FileInputStream("a.txt");
        output=new FileOutputStream("b.txt");
        int content;
            while ((content = input.read()) != -1) {
                output.write(content);
 }
        input.close();
        output.close();
    }
    catch(FileNotFoundException obj){
        System.out.println("file not found");

    } 
    catch(IOException obj){
        System.out.println("ioexception");
    }
    }
}
