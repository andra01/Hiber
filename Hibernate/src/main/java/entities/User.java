package entities;
// Generated Jul 13, 2016 9:48:43 AM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "taskmanager_db")
public class User implements java.io.Serializable {

	private UserId id;
	private Role role;
	private String firstName;
	private String lastName;
	private String password;
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<UserHasTask> userHasTasks = new HashSet<UserHasTask>(0);
	private Set<Project> projects = new HashSet<Project>(0);

	public User() {
	}

	public User(UserId id, Role role) {
		this.id = id;
		this.role = role;
	}

	public User(UserId id, Role role, String firstName, String lastName, String password, Set<Comment> comments,
			Set<UserHasTask> userHasTasks, Set<Project> projects) {
		this.id = id;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.comments = comments;
		this.userHasTasks = userHasTasks;
		this.projects = projects;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idUser", column = @Column(name = "idUser", nullable = false)),
			@AttributeOverride(name = "roleIdRole", column = @Column(name = "Role_idRole", nullable = false)) })
	public UserId getId() {
		return this.id;
	}

	public void setId(UserId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Role_idRole", nullable = false, insertable = false, updatable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "FirstName", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "Password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserHasTask> getUserHasTasks() {
		return this.userHasTasks;
	}

	public void setUserHasTasks(Set<UserHasTask> userHasTasks) {
		this.userHasTasks = userHasTasks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

}
