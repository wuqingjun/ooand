package entities;
// Generated 26 Nov, 2016 2:48:47 PM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Groupusers generated by hbm2java
 */
@Entity
@Table(name = "Groupusers", catalog = "ChatSys")
public class Groupusers implements java.io.Serializable {

	private GroupusersId id;
	private UserD userD;
	private UserGroups userGroups;

	public Groupusers() {
	}

	public Groupusers(GroupusersId id) {
		this.id = id;
	}

	public Groupusers(GroupusersId id, UserD userD, UserGroups userGroups) {
		this.id = id;
		this.userD = userD;
		this.userGroups = userGroups;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "groupId", column = @Column(name = "GroupId")),
			@AttributeOverride(name = "userId", column = @Column(name = "userId")) })
	public GroupusersId getId() {
		return this.id;
	}

	public void setId(GroupusersId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	public UserD getUserD() {
		return this.userD;
	}

	public void setUserD(UserD userD) {
		this.userD = userD;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GroupId", insertable = false, updatable = false)
	public UserGroups getUserGroups() {
		return this.userGroups;
	}

	public void setUserGroups(UserGroups userGroups) {
		this.userGroups = userGroups;
	}

}