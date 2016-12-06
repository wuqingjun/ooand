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
 * Authenticate generated by hbm2java
 */
@Entity
@Table(name = "Authenticate", catalog = "ChatSys")
public class Authenticate implements java.io.Serializable {

	private AuthenticateId id;
	private UserD userD;

	public Authenticate() {
	}

	public Authenticate(AuthenticateId id) {
		this.id = id;
	}

	public Authenticate(AuthenticateId id, UserD userD) {
		this.id = id;
		this.userD = userD;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "userId")),
			@AttributeOverride(name = "password", column = @Column(name = "password")) })
	public AuthenticateId getId() {
		return this.id;
	}

	public void setId(AuthenticateId id) {
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

}
