import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile 
{
	
	private String file_name;
	Scanner tokens=null;
	
	ReadFile(String fileName)
	{
		file_name=fileName;
	}
	
	public static void main(String[] args) throws IOException
	{
		String file="data.txt";
		ReadFile f = new ReadFile(file);
		f.readWriteData();
	}
	
	public void readWriteData() throws IOException
	{
		
		Scanner console = new Scanner(new File(file_name));
		int [] data = new int [100];
		int inputs=0;
		int sum=0;
		double avg=0;
		int i = 0;
		while(console.hasNextInt())
		{
		    data[i++] = console.nextInt();
		    inputs++;
		}
		
		for(int j:data)
			sum+=j;
		avg=(double)sum/inputs;
		
		int max=data[0];
		for(int j=0;j<inputs;j++)
		{
			if(data[j]>max)
				max=data[j];
		}
		
		PrintWriter out=new PrintWriter("results.txt");
		out.println("#inputs: " + inputs);
		out.println("sum: " + sum);
		out.println("avg: " + avg);
		out.println("max: " + max);
		out.close();
	}
}
