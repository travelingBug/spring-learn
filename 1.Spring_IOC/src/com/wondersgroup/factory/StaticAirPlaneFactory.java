package com.wondersgroup.factory;

import com.wondersgroup.bean.AirPlane;

public class StaticAirPlaneFactory {
	/**
	 * ��̬��������
	 * 
	 * @return
	 */
	public static AirPlane getAirPlaneByStatic(String jzName) {
		AirPlane plane = new AirPlane();
		plane.setJzName(jzName);
		plane.setFdj("̫��");
		plane.setYc("180m");
		plane.setZkl(260);
		return plane;
	}

}
