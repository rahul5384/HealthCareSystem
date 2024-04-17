package com.rahul.healthcare.health_care_system.domain;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class HealthcareProvider extends RepresentationModel<HealthcareProvider>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
	Integer providerId;
    
    @EqualsAndHashCode.Include
	String providerName;
    @EqualsAndHashCode.Include
	String specialization;
	String location;
	
    @OneToMany(mappedBy = "healthcareProvider", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
    @ToString.Exclude
    Set<Appointment> appointment = new HashSet<Appointment>();
	
}
