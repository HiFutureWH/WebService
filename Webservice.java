public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		// 1.获取服务service
		MobileCodeWS ws=new MobileCodeWS();
		
		
		// 2.通过服务获取端口
		MobileCodeWSSoap soap=ws.getPort(MobileCodeWSSoap.class);
		
		
		//3.调用方法
	    String message=soap.getMobileCodeInfo("15932760546", "");
	    
		System.out.print(message);
		
	}

}
