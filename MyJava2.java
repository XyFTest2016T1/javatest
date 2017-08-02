import java.io.*;

public class MyJava2 
{
	public static void main(String[] args) 
	{
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		
		try
		{
			File file = new File(args[1] + "solution2.txt");
			reader=null;
	        reader = new BufferedReader(new FileReader(file));
	        writer = new BufferedWriter(new FileWriter("solution2.txt"));
	        String text = null;
	    	System.out.println("Writing solution 2...");
	    	
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
