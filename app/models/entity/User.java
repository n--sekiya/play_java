package models.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.*;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

/**
 * ユーザ情報テーブル
 */
@Entity
@Table(name = "users")
public class User extends Model {

	/** ID **/
	@Id
	public Long id;

	/** 姓 **/
	@Required
	@NotNull
	@Size(max = 32)
	public String lastNameJa;

	/** 名 **/
	@Required
	@NotNull
	@Size(max = 32)
	public String firstNameJa;

	/** ログインID **/
	@Required
	@NotNull
	@Size(max = 32)
	public String loginId;

	/** メールアドレス **/
	@Required
	@NotNull
	@Email
	public String email;

	/** 論理削除フラグ **/
	@NotNull
	public boolean deleteFlg;

	/** 作成日時 **/
	@CreatedTimestamp
	public Date createAt;

	/** 更新日時 **/
	@UpdatedTimestamp
	public Date updateAt;

	@OneToMany(cascade = CascadeType.ALL)
	public List<Calendar> calendar = new ArrayList<Calendar>();


}
