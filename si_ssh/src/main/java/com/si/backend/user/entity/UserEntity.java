package com.si.backend.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.si.backend.base.entity.BaseEntity;

@Entity
@Table(name = "si_user")
public class UserEntity extends BaseEntity {
	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
