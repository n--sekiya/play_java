package models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

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
	public int id;

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

}
