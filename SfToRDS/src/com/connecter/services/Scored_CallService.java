package com.connecter.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.connecter.bean.Scored_CallBean;
import com.connecter.dao.BaseDao;
import com.connecter.dao.Scored_CallDao;
import com.connecter.mappingbean.Scored_CallMappingBean;
import com.connecter.observers.CallObserver;
@Service
public class Scored_CallService extends BaseService {
	@Autowired
	MappingServices mappingService;

	@Autowired @Qualifier("Scored_CallDao")
	private Scored_CallDao scored_CallDao;

	@Override
	protected BaseDao getDao() {
		return scored_CallDao;
	}
	
	public void updateScored_Call(Scored_CallMappingBean scored_Scored_CallMappingBean) throws Exception{
		scored_CallDao.updateScored_Calls(scored_Scored_CallMappingBean);
	}

	public List<Scored_CallBean> getSelected(final Scored_CallBean scored_CallBean) {
		List<Scored_CallBean> finalScored_CallBeanList = new ArrayList<Scored_CallBean>();
		List<Scored_CallMappingBean> scored_CallMappingBeanList = null;
		Scored_CallMappingBean scored_CallMappingBean = null;

		try {
			scored_CallMappingBean = mappingService.getScored_CallMappingObject(scored_CallBean);
			System.out.println("in service  : "+scored_CallMappingBean.getId());
			scored_CallMappingBeanList = scored_CallDao.getSelected(scored_CallMappingBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scored_CallBean scored_CallBean2;
		for (Scored_CallMappingBean mappingBean : scored_CallMappingBeanList) {
			try {
				scored_CallBean2 = mappingService.getScored_CallObject(mappingBean);
				finalScored_CallBeanList.add(scored_CallBean2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return finalScored_CallBeanList;
	}
	
	public List<Map<String,Object>> getFormulaSelected(final Scored_CallBean scored_CallBean) {
		List<Map<String,Object>> finalScored_CallBeanList = new ArrayList<Map<String,Object>>();
		Scored_CallMappingBean scored_CallMappingBean = null;

		try {
			scored_CallMappingBean = mappingService.getScored_CallMappingObject(scored_CallBean);
			System.out.println("in service  : "+scored_CallMappingBean.getId());
			finalScored_CallBeanList = scored_CallDao.getFormulaSelected(scored_CallMappingBean,"scoredcall");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalScored_CallBeanList;
	}
	
	public String addScored_Calls(final Scored_CallBean scored_CallBean){
		Scored_CallMappingBean scored_CallMappingBean = null;
		String id = null;
		try {
			scored_CallMappingBean = mappingService.getScored_CallMappingObject(scored_CallBean);
			System.out.println("in service  : "+scored_CallMappingBean.getId());
			id = scored_CallDao.addCalls(scored_CallMappingBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;
		
	}
}
