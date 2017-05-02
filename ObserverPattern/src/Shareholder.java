/**
 * 
 */

/**
 * @author Jerryhax
 * 2017年5月2日下午4:03:41
 */
public class Shareholder implements Observer {
	private String name;
	private String str;
	
	/**
	 * 
	 */
	public Shareholder(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	/* 更新收到的通知
	 * @see Observer#update(java.lang.String)
	 */
	@Override
	public void update(String str) {
		this.str = str;
		System.out.println(name+"收到消息："+str);

	}

}
