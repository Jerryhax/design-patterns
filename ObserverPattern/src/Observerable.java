/**
 * 
 */

/**
 * 被观察者接口
 * 定义注册删除通知观察者的方法
 * @author Jerryhax
 * 2017年5月2日下午3:08:07
 */
public interface Observerable {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
