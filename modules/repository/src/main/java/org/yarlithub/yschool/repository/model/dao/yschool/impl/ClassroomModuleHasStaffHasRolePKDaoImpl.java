package org.yarlithub.yschool.repository.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomModuleHasStaffHasRolePK;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.repository.model.dao.yschool.ClassroomModuleHasStaffHasRolePKDao;
import java.io.Serializable;
 
/**
 * DAO for table: ClassroomModuleHasStaffHasRolePK.
 * @author autogenerated
 */
@Repository
public class ClassroomModuleHasStaffHasRolePKDaoImpl extends GenericHibernateDaoImpl<ClassroomModuleHasStaffHasRolePK, Serializable> implements ClassroomModuleHasStaffHasRolePKDao {
	
	/** Constructor method. */
		public ClassroomModuleHasStaffHasRolePKDaoImpl() {
			super(ClassroomModuleHasStaffHasRolePK.class);
		}
	}
