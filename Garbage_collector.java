package CodeStudio;

public class Garbage_collector {
	public static void main(String args[]) {
		Garbage_collector t1 = new Garbage_collector();
		Garbage_collector t2 = new Garbage_collector();
		
		// Nullifying the reference variable
		t1 = null;
		
		// Requesting JVM for running garbage collector
		System.gc();
		
		// Nullifying the reference variable
		t2 = null;
		
		// Requesting JVM for running garbage collector
		Runtime.getRuntime().gc();
		
	}
	
	@Override
	//finalize method is called on object once
	// before garbage collecting it
	
	protected void finalize() throws Throwable{
		System.out.println("Garbage collector called");
		System.out.println("object garbage collected : " + this);
	}
}
