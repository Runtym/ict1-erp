package com.ict.erp.vo;

import org.apache.ibatis.type.Alias;

@Alias("li")
public class LevelInfo {

	private Integer linum;
	private Integer lilevel;
	private String liname;
	private String lidesc;
	private MeberInfo mi;
	
	public MeberInfo getMi() {
		return mi;
	}
	public void setMi(MeberInfo mi) {
		this.mi = mi;
	}
	public Integer getLinum() {
		return linum; 
	}
	public void setLinum(Integer linum) {
		this.linum = linum;
	}
	public Integer getLilevel() {
		return lilevel;
	}
	public void setLilevel(Integer lilevel) {
		this.lilevel = lilevel;
	}
	public String getLiname() {
		return liname;
	}
	public void setLiname(String liname) {
		this.liname = liname;
	}
	public String getLidesc() {
		return lidesc;
	}
	public void setLidesc(String lidesc) {
		this.lidesc = lidesc;
	}
	@Override
	public String toString() {
		return "LevelInfo [linum=" + linum + ", lilevel=" + lilevel + ", liname=" + liname + ", lidesc=" + lidesc
				+ ", mi=" + mi + "]";
	}
	
	
	
}
