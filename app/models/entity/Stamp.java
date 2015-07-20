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
 * スタンプマスタテーブル
 */
@Entity
@Table(name = "stamp")
public class Stamp extends Model {

	/** ID **/
	@Id
	public Long id;

  /** ソート順 **/
	@NotNull
	public int sort;

	/** 名前 **/
	@Required
	@NotNull
	@Size(max = 32)
	public String name;

	/** 画像パス **/
	@Required
	@NotNull
	public String imgPath;

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
