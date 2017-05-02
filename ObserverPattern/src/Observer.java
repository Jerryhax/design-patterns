/**
 * 
 */

/**观察者接口
 * 定义了update()方法，当被观察者调用notifyObservers()方法时，
 * 观察者的upda()方法会被回掉。
 * @author Jerryhax
 * 2017年5月2日下午3:07:49
 */
public interface Observer {
	public void update(String str);
}
