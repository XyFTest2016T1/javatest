import java.io.*;

public class MyJava1 
{
	public static void main(String[] args) 
	{
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		
		try
		{
			File file = new File(args[1] + "solution1.txt");
			reader=null;
	        reader = new BufferedReader(new FileReader(file));
	        writer = new BufferedWriter(new FileWriter("solution1.txt"));
	        String text = null;
	    	System.out.println("Writing solution 1...");
	    	
	        while((text = reader.readLine())!= null )
	        {
	        	writer.write(text+"\n");
	        }
	        reader.close();
	        writer.close();
        }
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        } 
		finally 
		{
            try 
            {
                if (reader != null) 
                {
                    reader.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
	}
}
