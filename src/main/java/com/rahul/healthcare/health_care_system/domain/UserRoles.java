package com.rahul.healthcare.health_care_system.domain;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.hateoas.RepresentationModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserRoles extends RepresentationModel<UserRoles>{

	Integer userRoleIdl;
//	 Integer userId;//     | FK -> User.userId |
//	 Integer roleId;;//     | FK -> Role.roleId |

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "UserRoles", joinColumns = @JoinColumn(name = "userRoleId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	private Set<Role> roles = new HashSet<Role>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "UserRoles", joinColumns = @JoinColumn(name = "userRoleId"), inverseJoinColumns = @JoinColumn(name = "userId"))
	private Set<User> users = new HashSet<User>();

}
