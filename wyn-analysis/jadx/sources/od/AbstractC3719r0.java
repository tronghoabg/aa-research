package od;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: od.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3719r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f42080a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!(list.get(i5) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i5), Integer.valueOf(i5), list));
            }
        }
    }

    public static Boolean b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List d(String str, Map map) {
        List listC = c(str, map);
        if (listC == null) {
            return null;
        }
        for (int i5 = 0; i5 < listC.size(); i5++) {
            if (!(listC.get(i5) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listC.get(i5), Integer.valueOf(i5), listC));
            }
        }
        return listC;
    }

    public static Double e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d3 = (Double) obj;
        int iIntValue = d3.intValue();
        if (iIntValue == d3.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d3);
    }

    public static Map g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long i(String str, Map map) {
        String strH = h(str, map);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(k(strH));
        } catch (ParseException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static long j(int i5, long j8) {
        long j10 = i5;
        long j11 = f42080a;
        if (j10 <= (-j11) || j10 >= j11) {
            j8 = A6.h.k(j8, j10 / j11);
            i5 = (int) (j10 % j11);
        }
        if (j8 > 0 && i5 < 0) {
            i5 = (int) (i5 + j11);
            j8--;
        }
        if (j8 < 0 && i5 > 0) {
            i5 = (int) (i5 - j11);
            j8++;
        }
        if (j8 >= -315576000000L && j8 <= 315576000000L) {
            long j12 = i5;
            if (j12 >= -999999999 && j12 < j11 && ((j8 >= 0 && i5 >= 0) || (j8 <= 0 && i5 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j8);
                long j13 = i5;
                long j14 = nanos + j13;
                return (((j13 ^ nanos) > 0L ? 1 : ((j13 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j14) >= 0) ? j14 : ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j8 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i5 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long k(String str) throws NumberFormatException, ParseException {
        boolean z2;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z2 = true;
        } else {
            z2 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j8 = Long.parseLong(strSubstring2);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i5 = 0; i5 < 9; i5++) {
                iCharAt *= 10;
                if (i5 < strSubstring.length()) {
                    if (strSubstring.charAt(i5) < '0' || strSubstring.charAt(i5) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i5) - '0') + iCharAt;
                }
            }
        }
        if (j8 < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z2) {
            j8 = -j8;
            iCharAt = -iCharAt;
        }
        try {
            return j(iCharAt, j8);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
