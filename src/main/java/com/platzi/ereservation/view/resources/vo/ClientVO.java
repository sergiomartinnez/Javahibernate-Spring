/**
 * 
 */
package com.platzi.ereservation.view.resources.vo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author Sergio Lozano
 *
 */
@Data
public class ClientVO {
	private String idCli;
	private String nameCli;
	private String lastnameCli;
	private String identificationCli;
	private String directionCli;
	private String phoneCli;
	private String emailCli;
}