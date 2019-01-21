package ar.com.academy.mfs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="group",schema="msf")
public class Group implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 314596368818188482L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "group_id")
	private long group_id;
	
 	@Column(name = "supervisor_id") //LIDER
	private int supervisor_id;
	
	@Column(name="supervised_id") // SENSIBILIZADOR
	private int supervised_id;
	
	@Column(name="zone_id")
	private int zone_id;
	
	@Column(name="from_date")
	private Date from_date;
	
	@Column(name="to_date")
	private Date to_date;
	
	@Column(name = "group_number")
	private int group_number;
	
	@Column(name = "turn")
	private String turn;

	public Group() {
		
	}
	
//	public Group(int zone_id, int supervisor_id, int supervised_id, int turn) {
//		super();
//		this.zone_id = zone_id;
//		this.supervisor_id = supervisor_id;
//		this.supervised_id = supervised_id;
//		this.turn = turn;
//		this.group_number = 0;
//	}
	
	public Group(int zone_id, int supervisor_id, int supervised_id, int group_number, String turn) {
		super();
		this.zone_id = zone_id;
		this.supervisor_id = supervisor_id;
		this.supervised_id = supervised_id;
		this.group_number = group_number;
		this.turn = turn;
	}

	public int getSupervisor() {
		return supervisor_id;
	}

	public void setSupervisor(int supervisor_id) {
		this.supervisor_id = supervisor_id;
	}

	public int getSupervised() {
		return supervised_id;
	}

	public void setSupervised(int supervised_id) {
		this.supervised_id = supervised_id;
	}

	public int getZone_id() {
		return zone_id;
	}

	public void setZone_id(int zone_id) {
		this.zone_id = zone_id;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public long getGroup_id() {
		return group_id;
	}

	public int getGroup_number() {
		return group_number;
	}

	public void setGroup_number(int group_number) {
		this.group_number = group_number;
	}

	public String getTurn() {
		return turn;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}

}