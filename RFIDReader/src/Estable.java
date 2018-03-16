
import org.xvolks.jnative.JNative;
import org.xvolks.jnative.exceptions.NativeException;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public class Estable {
	 public static int context=0;
     public static long SCARD_SCOPE_SYSTEM;

	
	public static void main(String[] args) {
		try{
			SCardEstablishContext scardestable = new SCardEstablishContext();
		}catch(Exception e){
			e.printStackTrace();
		}
		 //int ret=SCardEstablishContext(SCARD_SCOPE_SYSTEM,0,0,context);
	}
	//PCSC JNI FUNCTIONS *************************************************************************
	
			/*private native static int SCardEstablishContext(long dwscope,
								 					int pvReserved1,
								 					int pvReserved2,
								 					int phContext);*/

}
