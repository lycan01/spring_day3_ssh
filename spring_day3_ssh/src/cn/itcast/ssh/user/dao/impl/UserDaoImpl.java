package cn.itcast.ssh.user.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.user.dao.dao.UserDao;
import cn.itcast.ssh.user.vo.UserModel;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void add(UserModel um) {
		// TODO Auto-generated method stub

	}

	public void delete(UserModel um) {
		// TODO Auto-generated method stub

	}

	public void update(UserModel um) {
		// TODO Auto-generated method stub

	}

	public UserModel get(Long uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserModel> getAll(Integer pageNum, Integer prepageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
