package entities;
// Generated Jul 13, 2016 9:48:43 AM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Status generated by hbm2java
 */
@Entity
@Table(name = "status", catalog = "taskmanager_db")
public class Status implements java.io.Serializable {

	private int idStatus;
	private String type;
	private Set<UserHasTask> userHasTasks = new HashSet<UserHasTask>(0);
	private Set<Task> tasks = new HashSet<Task>(0);

	public Status() {
	}

	public Status(int idStatus) {
		this.idStatus = idStatus;
	}

	public Status(int idStatus, String type, Set<UserHasTask> userHasTasks, Set<Task> tasks) {
		this.idStatus = idStatus;
		this.type = type;
		this.userHasTasks = userHasTasks;
		this.tasks = tasks;
	}

	@Id

	@Column(name = "idStatus", unique = true, nullable = false)
	public int getIdStatus() {
		return this.idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	@Column(name = "type", length = 100)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
	public Set<UserHasTask> getUserHasTasks() {
		return this.userHasTasks;
	}

	public void setUserHasTasks(Set<UserHasTask> userHasTasks) {
		this.userHasTasks = userHasTasks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
	public Set<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

}
