package com.wondersgroup.factory;

import com.wondersgroup.bean.AirPlane;

public class StaticAirPlaneFactory {
	/**
	 * 静态工厂方法
	 * 
	 * @return
	 */
	public static AirPlane getAirPlaneByStatic(String jzName) {
		AirPlane plane = new AirPlane();
		plane.setJzName(jzName);
		plane.setFdj("太行");
		plane.setYc("180m");
		plane.setZkl(260);
		return plane;
	}

}
