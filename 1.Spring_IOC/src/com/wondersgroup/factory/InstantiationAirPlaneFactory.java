package com.wondersgroup.factory;

import com.wondersgroup.bean.AirPlane;

public class InstantiationAirPlaneFactory {

	public InstantiationAirPlaneFactory() {
		super();
		System.out.println("ʵ����������");
	}


	/**
	 * ʵ����������
	 * 
	 * @return
	 */
	public AirPlane getAirPlaneByInstantiation(String jzName) {
		 AirPlane plane = new AirPlane();
		plane.setJzName(jzName);
		plane.setFdj("̫��");
		plane.setYc("180m");
		plane.setZkl(260);
		return plane;
	}
}
