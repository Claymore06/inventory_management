package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.data.validation.Constraints.Required;

@Entity
public class TestEntity extends Model {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	
	@Column(name="user_name")
	@Required
	public String userName;

	public static Finder<Long, TestEntity> find = new Finder<>(TestEntity.class);
}
