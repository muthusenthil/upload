package com.dao;

import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.BornUser;
import com.model.Role;
import com.model.UserBean;

@Repository
@Transactional
public class RegisterDaoImpl implements RegisterDao {

	@Autowired(required = true)
	private SessionFactory sf;

	/*
	 * @Override
	 * 
	 * @Transactional public boolean save(BornUser ob){
	 * 
	 * Serializable o=sf.getCurrentSession().save(ob); if(o.equals(null) ||
	 * o==null) return true; else return false; }
	 * 
	 * public void edit(BornUser ob){ ((RegisterDaoImpl)
	 * sf.getCurrentSession()).edit(ob);
	 * 
	 * }
	 */
	/*@Override
	public void saveOrUpdate(UserBean u) {
		// TODO Auto-generated method stub
		u.setEnabled(true);
		Role m=new Role();
		m.setU(u);
		m.setRoleid("ROLE_USER");
		sf.getCurrentSession().saveOrUpdate(u);
		sf.getCurrentSession().saveOrUpdate(m);
	}*/
	
	
	/*userBean.setEnabled(true);
	Roles r=new Roles();
	r.setUserBean(userBean);
	r.setRoles("Role_-")*/
	
	@Override
	public void save(UserBean userBean) {
		// TODO Auto-generated method stub
		
		sf.getCurrentSession().save(userBean);
	}

}
