package cn.com.lgh.datasource.util;

public class DBContextHolder {
	// 对当前线程的操作-线程安全的
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	
	// 调用此方法，切换数据源
	public static void setDataSource(String dataSource) {  
		contextHolder.set(dataSource);  
	}
	// 获取数据源
	public static String getDataSource() {
		return contextHolder.get();
	}
	// 删除数据源
	public static void clearDataSource() {
		contextHolder.remove();
	}
}
