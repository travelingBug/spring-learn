package com.wondersgroup.bean;

public class AirPlane {
	
	private String jzName;
	private String fdj;
	private Integer zkl;
	private String yc;
	

	public AirPlane() {
		super();
		System.out.println("airPlane±»´´½¨¡­¡­");
		
	}

	public String getJzName() {
		return jzName;
	}

	public void setJzName(String jzName) {
		this.jzName = jzName;
	}

	public String getFdj() {
		return fdj;
	}

	public void setFdj(String fdj) {
		this.fdj = fdj;
	}

	public Integer getZkl() {
		return zkl;
	}

	public void setZkl(Integer zkl) {
		this.zkl = zkl;
	}

	public String getYc() {
		return yc;
	}

	public void setYc(String yc) {
		this.yc = yc;
	}

	@Override
	public String toString() {
		return "AirPlane [jzName=" + jzName + ", fdj=" + fdj + ", zkl=" + zkl + ", yc=" + yc + "]";
	}
	
}
