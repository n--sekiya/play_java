package models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

@Entity
@Table(name = "Users")
public class User extends Model {
	
	/** ID **/
	@Id
	public int id;
	
	/** 姓 **/
	@Required(message = "必須項目です。")
	@Size(max = 10)
	public String lastNameJa;
	
	/** 名 **/
	@Required(message = "必須項目です。")
	public String firstNameJa;
	
	/** 所属期間 **/
	public String affiliationJa;
	
	/** メールアドレス **/
	@Required(message = "必須項目です。")
	@Email
	public String email;
	
	/** 作成日時 **/
	@CreatedTimestamp
	public Date createAt;
	
	/** 更新日時 **/
	@UpdatedTimestamp
	public Date updateAt;
	
}
