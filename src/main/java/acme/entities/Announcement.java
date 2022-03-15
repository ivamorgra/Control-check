package acme.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Announcement extends AbstractEntity{
	protected static final long    serialVersionUID    = 1L;
			
	@Past
	@NotNull
	protected Date creationMoment;
	
	@NotBlank
	@Length(min=1,max = 100)
	protected String title;
	
	@NotBlank
	@Length(min=1,max=255)
	protected String body;
	
	@Email
	protected String email;
	
	@NotNull
	protected boolean critical;
	
	@URL
	protected String moreInfo;
}
