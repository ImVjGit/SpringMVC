package com.DaoLayer;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Model.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateteamplate;

	@Transactional
	public int saveuser(User us) {
		Integer id = (Integer) hibernateteamplate.save(us);

		return id;
	}

}
