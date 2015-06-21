package models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

/**
 * カレンダー情報テーブル
 */
@Entity
@Table(name = "calendar")
public class Calendar extends Model {

	/** ID **/
	@Id
	public int id;

	/** 日付 **/
	public Date date;

	/** ユーザID **/
	@Required
	@NotNull
	public User userId;

	/** スタンプID **/
	@Required
	@NotNull
	public Stamp stampId;

	/** 作成日時 **/
	@CreatedTimestamp
	public Date createAt;

	/** 更新日時 **/
	@UpdatedTimestamp
	public Date updateAt;

}
