package com.wondersgroup.factory;

import com.wondersgroup.bean.AirPlane;

public class InstantiationAirPlaneFactory {

	public InstantiationAirPlaneFactory() {
		super();
		System.out.println("实例工厂对象");
	}


	/**
	 * 实例工厂方法
	 * 
	 * @return
	 */
	public AirPlane getAirPlaneByInstantiation(String jzName) {
		 AirPlane plane = new AirPlane();
		plane.setJzName(jzName);
		plane.setFdj("太行");
		plane.setYc("180m");
		plane.setZkl(260);
		return plane;
	}
}
