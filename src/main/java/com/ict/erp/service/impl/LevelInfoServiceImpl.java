package com.ict.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.erp.dao.LevelInfoDAO;
import com.ict.erp.service.LevelInfoService;
import com.ict.erp.vo.LevelInfo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LevelInfoServiceImpl implements LevelInfoService {

	@Autowired
	private LevelInfoDAO lidao;
	@Override
	public List<LevelInfo> getLevelInfoList(LevelInfo li) {
		// TODO Auto-generated method stub
		return lidao.getLevelInfoList(li);
	}
	@Override
	public int insertLevelInfo(LevelInfo li) {
		// TODO Auto-generated method stub
		return lidao.insertLevelInfo(li);
	}
	@Override
	public int deleteLevelInfo(int linum) {
		// TODO Auto-generated method stub
		return lidao.deleteLevelInfo(linum);
	}
	@Override
	public LevelInfo getLevelInfo(Integer linum) {
		// TODO Auto-generated method stub
		return lidao.getLevelInfoList(linum);
	}
	@Override
	public int updateLevelInfo(LevelInfo li) {
		return lidao.updateLevelInfo(li);
	}
	@Override
	public int testTransaction(LevelInfo li) {
		int cnt  = lidao.updateLevelInfo(li);
		cnt = lidao.insertLevelInfo(li);
		return cnt;
	}

	@Override
	public int testTransaction2(LevelInfo li) {
		int cnt  = lidao.updateLevelInfo(li);
		System.out.println(getLevelInfo(li.getLinum()));
		cnt = lidao.updateLevelInfoWithError(li);
		return cnt;
	}
}
