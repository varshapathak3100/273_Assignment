
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.InputStream;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.Scanner;

public class multithreading_v1 {

		public static void main (String args[]) 
		{
			String url1,url2,url3;
			System.out.println("\nEnter links of three jpg files you'd like to download");
			Scanner s = new Scanner(System.in);
			url1=s.next();
			threadclass t1= new threadclass(url1, "thread1");

			url2=s.next();
			threadclass t2= new threadclass(url2, "thread2");


			url3=s.next();
			threadclass t3= new threadclass(url3, "thread3");
			t1.start();
			t2.start();
			t3.start();



		}

	}

	class threadclass extends Thread
	{
		private Thread t;
		URL url;
		String threadname;
		public threadclass(String Url, String ThreadName) 
		{
			
			try
			{
			url = new URL(Url);
			}
			catch(MalformedURLException e)
			{
				System.out.println("\nMalformedURLException");
			}
			threadname = ThreadName;
		}
		 public void run() {
		      System.out.println("Running " +  threadname );
		      try {
		    	  InputStream in = url.openStream();
		    	  FileOutputStream fos = new FileOutputStream(new File("downloadedimages/"+threadname+".jpg"));

		    	  int length = -1;
		    	  byte[] buf = new byte[1024];
		    	  while ((length = in.read(buf)) > -1) {
		    	      fos.write(buf, 0, length);
		    	  }
		    	  fos.close();
		    	  in.close();
		            System.out.println("Thread: " + threadname + "Download complete " );
		            // Let the thread sleep for a while.
		         
		      }catch (Exception e) {
		         System.out.println("Thread " +  threadname + " Exception occured.");
		      }
		      System.out.println("Thread " +  threadname + " exiting.");
		   }
		   
		   public void start () {
		      System.out.println("Starting " +  threadname );
		      if (t == null) {
		         t = new Thread (this, threadname);
		         t.start ();
		      }
		   }
}
