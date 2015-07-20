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
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.*;
import play.data.validation.Constraints.Email;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;


/**
 * カレンダー情報テーブル
 */
@Entity
@Table(name = "calendar")
public class Calendar extends Model {

	/** ID **/
	@Id
	public Long id;

	/** 日付 **/
	public Date date;

	/** ユーザID **/
	@Required
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	public User user;

	/** スタンプID **/
	@Required
	@NotNull
	public Stamp stamp;

	/** 作成日時 **/
	@CreatedTimestamp
	public Date createAt;

	/** 更新日時 **/
	@UpdatedTimestamp
	public Date updateAt;

}
