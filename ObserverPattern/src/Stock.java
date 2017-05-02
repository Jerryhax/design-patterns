import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Jerryhax
 * 2017年5月2日下午3:23:51
 */
public class Stock implements Observerable {
	
	//这个List集合的泛型参数为Observer接口，设计原则是面向接口编程而不是面向实现编程
	private List<Observer> olist;
//	将要更新的股票的各种信息，比如价格、涨跌、开收盘
	private String str = "*";
	public String stockName;
	
	public Stock(String stockName) {
		olist = new ArrayList<Observer>();
		this.stockName = stockName;
	}
	
	
	
	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}



	/* (non-Javadoc)
	 * @see Observerable#registerObserver(Observer)
	 */
	@Override
	public void registerObserver(Observer o) {
//		加入观察者列表
		olist.add(o);
		
	}

	/* (non-Javadoc)
	 * @see Observerable#removeObserver(Observer)
	 */
	@Override
	public void removeObserver(Observer o) {
//		删除某观察者
		if (!olist.isEmpty()) {
			olist.remove(o);
		}
	}

	/* 通知观察者信息
	 * @see Observerable#notifyObserver()
	 */
	@Override	
	public void notifyObserver() {
//		遍历
		for (Observer obs:olist){
			Shareholder shareholder = (Shareholder)obs;
			shareholder.update(str);
			System.out.println("通知了"+shareholder.getName());
			System.out.println();
		}
	}
//设置通知消息，并通知所有观察者。	
	public void setInfo(String str){
		this.str = str;
		notifyObserver();
	}
	
}
