##本demo的一些说明：  
本demo用来建立起电脑与pc/sc接口的连接，此时需要用到JNI技术，但过于繁琐，于采用java提供的JNative技术。  
####JNative文件：
<li>JNative.jar放到工程的lib文件夹里，右键项目，选择构建路径，把外置的这个jar包含进项目</li>
<li>JNativeCpp.dll放到C:\Windows\System32下</li>
<li>将WinScard.dll文件放置安装的JRE的bin目录下</li>
####程序代码功能说明：
	public static int SCardEstablishContext() throws NativeException, Exception {
        // 创建对象
		JNative jnative = new JNative("WinSCard", "SCardEstablishContext");
        //加载WinScard.dll文件及SCardEstablishContext()函数
		SCardEstablishContext scardestable = new SCardEstablishContext();
        // 设置参数
		int i=0;
		jnative.setRetVal(Type.INT); //设置返回值
		jnative.setParameter(i++,(int) dwscope);//第一个参数，后面依此类推
		jnative.setParameter(i++,pvReserved1);
		jnative.setParameter(i++,pvReserved2);
		jnative.setParameter(i++,phContext);
		jnative.invoke(); // 解析结构指针内容
		System.out.println(Integer.parseInt(jnative.getRetVal()));//输出返回值
		return i;
    }