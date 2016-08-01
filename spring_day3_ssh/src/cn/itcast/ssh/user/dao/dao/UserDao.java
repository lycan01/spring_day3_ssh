package cn.itcast.ssh.user.dao.dao;

import java.util.List;

import cn.itcast.ssh.user.vo.UserModel;

public interface UserDao {
	public void add(UserModel um);
	public void delete(UserModel um);
	public void update(UserModel um);
	public UserModel get(Long uuid);
	public List<UserModel> getAll();
	public List<UserModel> getAll(Integer pageNum,Integer prepageNum);
	public Integer getCount();}
