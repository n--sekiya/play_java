package jp.atlas.kizuna.utils;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.text.html.parser.ParserDelegator;

import jp.atlas.kizuna.Strings;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.LogFactory;

/**
 * HTMLタグのチェック
 * 参考URL:http://allabout.co.jp/gm/gc/80633/3/
 * @author n_sekiya
 */
@SuppressWarnings("serial")
public final class HTMLUtil extends ParserDelegator {

	/** ファイルの拡張子 */
	private static final String GIF = "gif";

	/**
	 * コンストラクタ インスタンス生成禁止
	 */
	private HTMLUtil() {

	}

//	/**
//	 * 配列を指定したセパレータで区切った文字列に変換する
//	 * @param separator セパレータ
//	 * @param array 対象配列
//	 * @return String
//	 */
//	public static String delimitArrayToString(String separator, String[] array) {
//		if (separator == null || array == null) {
//			return null;
//		} else if (array.length == 0) {
//			return Strings.EMPTY;
//		}
//		StringBuilder builder = new StringBuilder();
//		for (int i = 0; i < array.length; i++) {
//			builder.append(array[i]);
//			if (i != array.length - 1) {
//				builder.append(separator);
//			}
//		}
//		return builder.toString();
//	}

}
