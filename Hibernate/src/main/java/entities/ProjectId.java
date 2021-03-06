package entities;
// Generated Jul 13, 2016 9:48:43 AM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectId generated by hbm2java
 */
@Embeddable
public class ProjectId implements java.io.Serializable {

	private int idProject;
	private int userIdUser;
	private int userRoleIdRole;
	private int releaseIdRelease;

	public ProjectId() {
	}

	public ProjectId(int idProject, int userIdUser, int userRoleIdRole, int releaseIdRelease) {
		this.idProject = idProject;
		this.userIdUser = userIdUser;
		this.userRoleIdRole = userRoleIdRole;
		this.releaseIdRelease = releaseIdRelease;
	}

	@Column(name = "idProject", nullable = false)
	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	@Column(name = "User_idUser", nullable = false)
	public int getUserIdUser() {
		return this.userIdUser;
	}

	public void setUserIdUser(int userIdUser) {
		this.userIdUser = userIdUser;
	}

	@Column(name = "User_Role_idRole", nullable = false)
	public int getUserRoleIdRole() {
		return this.userRoleIdRole;
	}

	public void setUserRoleIdRole(int userRoleIdRole) {
		this.userRoleIdRole = userRoleIdRole;
	}

	@Column(name = "Release_idRelease", nullable = false)
	public int getReleaseIdRelease() {
		return this.releaseIdRelease;
	}

	public void setReleaseIdRelease(int releaseIdRelease) {
		this.releaseIdRelease = releaseIdRelease;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectId))
			return false;
		ProjectId castOther = (ProjectId) other;

		return (this.getIdProject() == castOther.getIdProject()) && (this.getUserIdUser() == castOther.getUserIdUser())
				&& (this.getUserRoleIdRole() == castOther.getUserRoleIdRole())
				&& (this.getReleaseIdRelease() == castOther.getReleaseIdRelease());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProject();
		result = 37 * result + this.getUserIdUser();
		result = 37 * result + this.getUserRoleIdRole();
		result = 37 * result + this.getReleaseIdRelease();
		return result;
	}

}
