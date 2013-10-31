package xap.oracle.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoaderUtility {

	public static Long toLong(final String str) {
		if (str == null || str.length() == 0) {
			return null;
		} else {
			return Long.valueOf(str);
		}

	}

	public static Integer toInteger(final String str) {
		if (str == null || str.length() == 0) {
			return null;
		} else {
			return Integer.valueOf(str);
		}

	}
	
	public static Boolean toBoolean(final String str) throws Exception {
		if (str == null || str.length() != 1) {
			throw new Exception("Boolean exception");
		} else {
			if (str.equals("0")) {
				return Boolean.FALSE;
			} else if (str.equals("1")) {
				return   Boolean.TRUE;
			}
			throw new Exception("Boolean exception");
		}
	}

	public static Float toFloat(final String str) throws Exception {
		if (str == null || str.length() == 0) {
			return null;

		} else {
			return new Float(str);
		}
	}

	public static Date toDate(String str) throws ParseException {
		if (str == null || str.length() == 0) {
			return null;

		} else {

			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			return df.parse(str);
		}
	}
}
