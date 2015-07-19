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

/**
 * 祝日マスタテーブル
 */
@Entity
@Table(name = "holiday")
public class Holiday extends Model {

	/** ID **/
	@Id
	public int id;

	/** 日付 **/
	public Date date;

	/** 名前 **/
	@Required
	@NotNull
	@Size(max = 32)
	public String name;

	/** 論理削除フラグ **/
	@NotNull
	public boolean deleteFlg;

	/** 作成日時 **/
	@CreatedTimestamp
	public Date createAt;

	/** 更新日時 **/
	@UpdatedTimestamp
	public Date updateAt;


	public static Finder<Long, Holiday> find = new Finder<Long, Holiday>(Long.class, Holiday.class);

}
