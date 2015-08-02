package models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import play.i18n.Messages;

/**
 * 祝日マスタテーブル
 */
@Entity
@Table(name = "holiday")
public class Holiday extends Model {

	/** ID **/
	@Id
	public Long id;

	/** 日付 **/
	@NotNull
	@Required(message = "common.calendar.validation.required")
	public Date date;

	/** 名前 **/
	@NotNull
	@Size(max = 32, message = "common.calendar.validation.length")
	@Required(message = "common.calendar.validation.required")
	public String name;

	/** 作成日時 **/
	@CreatedTimestamp
	public Date createAt;

	/** 更新日時 **/
	@UpdatedTimestamp
	public Date updateAt;

	/** IDから祝日情報を取得する */
	public static Finder<Long, Holiday> find = new Finder<Long, Holiday>(Long.class, Holiday.class);

}
