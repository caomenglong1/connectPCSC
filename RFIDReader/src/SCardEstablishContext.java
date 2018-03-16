
import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.exceptions.NativeException;  
import org.xvolks.jnative.misc.basicStructures.AbstractBasicData;  
import org.xvolks.jnative.pointers.Pointer;  
import org.xvolks.jnative.pointers.memory.MemoryBlockFactory;  

public class SCardEstablishContext {
	static long dwscope=0;
	static int pvReserved1=0;
	static int pvReserved2=0;
	static int phContext=1;
	public static int SCardEstablishContext() throws NativeException, Exception {
        // ��������
		JNative jnative = new JNative("WinSCard", "SCardEstablishContext");
		SCardEstablishContext scardestable = new SCardEstablishContext();
        // ���ò���
		int i=0;
		jnative.setRetVal(Type.INT);
		jnative.setParameter(i++,(int) dwscope);
		jnative.setParameter(i++,pvReserved1);
		jnative.setParameter(i++,pvReserved2);
		jnative.setParameter(i++,phContext);
		jnative.invoke();
        // �����ṹָ������
		System.out.println(Integer.parseInt(jnative.getRetVal()));
		return i;
    }
	public static void main(String[] args) throws NativeException, Exception{
		SCardEstablishContext();
		System.out.println("�����ɹ�");
	}
	static{
		System.loadLibrary("WinSCard");
	}
}
