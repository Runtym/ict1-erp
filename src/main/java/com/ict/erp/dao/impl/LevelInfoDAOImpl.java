package com.ict.erp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.erp.dao.LevelInfoDAO;
import com.ict.erp.vo.LevelInfo;

@Repository
public class LevelInfoDAOImpl implements LevelInfoDAO{

	@Autowired
	private SqlSession ss;
	@Override
	public List<LevelInfo> getLevelInfoList(LevelInfo li) {
		return ss.selectList("SQL.LEVELINFO.selectLevelInfoList2",li);
	}
	@Override
	public int insertLevelInfo(LevelInfo li) {
		
		return ss.insert("SQL.LEVELINFO.insertLevelInfo",li);
	}
	@Override
	public int deleteLevelInfo(int linum) {
		
		return ss.delete("SQL.LEVELINFO.deleteLevelInfo", linum);
	}
	@Override
	public int updateLevelInfo(LevelInfo li) {
		
		return ss.delete("SQL.LEVELINFO.updateLevelInfo", li);
	}
	@Override
	public LevelInfo getLevelInfoList(Integer linum) {
		
		return ss.selectOne("SQL.LEVELINFO.selectLevelInfo",linum);
	}
	@Override
	public int updateLevelInfoWithError(LevelInfo li) {
		return ss.delete("SQL.LEVELINFO.updateLevelInfoWithError", li);
	}
	@Override
	public int getLinum() {
		return ss.selectOne("SQL.LEVELINFO.selectLinum");
	}

}
