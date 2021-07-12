/**
 * 
 */
package com.platzi.ereservation.model;

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
@Entity
@Table(name = "client")
@NamedQuery(name="Client.findByIdentification", query="Select c from Client c where c.identificationCli = ?1")
public class Client {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCli;
	private String nameCli;
	private String lastnameCli;
	private String identificationCli;
	private String directionCli;
	private String phoneCli;
	private String emailCli;
	@OneToMany(mappedBy="client")
	private Set<Reserva> reservas;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
}
