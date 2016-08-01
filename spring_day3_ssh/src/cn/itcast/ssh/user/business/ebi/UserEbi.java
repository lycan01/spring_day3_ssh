package cn.itcast.ssh.user.business.ebi;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.ssh.user.vo.UserModel;
@Transactional
public interface UserEbi {
	public void add(UserModel um);
	public UserModel get(Long uuid);
}
