package com.connecter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecter.bean.Scored_CallBean;
import com.connecter.dao.BaseDao;
import com.connecter.dao.Scored_CallDao;
import com.connecter.mappingbean.Scored_CallMappingBean;
@Service
public class Scored_CallService extends BaseService {
	@Autowired
	MappingServices mappingService;

	@Autowired
	private Scored_CallDao scored_CallDao;

	@Override
	protected BaseDao getDao() {
		// TODO Auto-generated method stub
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scored_CallBean scored_CallBean2;
		for (Scored_CallMappingBean mappingBean : scored_CallMappingBeanList) {
			try {
				scored_CallBean2 = mappingService.getScored_CallObject(mappingBean);
				finalScored_CallBeanList.add(scored_CallBean2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
		
	}
}
