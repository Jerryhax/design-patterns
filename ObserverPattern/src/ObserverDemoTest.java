/**
 * 
 */

/**
 * @author Jerryhax
 * 2017年5月2日下午4:16:33
 */
public class ObserverDemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		初始化观察者和被观察者
		Stock stock = new Stock("**股票");
		Observer zs = new Shareholder("zhangsan");
		Observer ls = new Shareholder("lisi");
		Observer ww = new Shareholder("wangwu");
		
//		注册观察者
		stock.registerObserver(zs);
		stock.registerObserver(ls);
		stock.registerObserver(ww);
		
		stock.setInfo(stock.getStockName()+"股票涨停了！");

	}

}
