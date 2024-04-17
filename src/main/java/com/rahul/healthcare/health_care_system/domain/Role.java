package com.rahul.healthcare.health_care_system.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
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
public class Role extends RepresentationModel<Role>{

	Integer roleId;  
	String roleName;
	
	@ManyToMany(mappedBy = "roles")
    private Set<UserRoles> userRoles = new HashSet<UserRoles>();
}
