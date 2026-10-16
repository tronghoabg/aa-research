package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class DesugarTimeZone {
    public static TimeZone getTimeZone(String str) {
        return TimeZone.getTimeZone(str);
    }

    public static TimeZone getTimeZone(ZoneId zoneId) {
        String strN = zoneId.n();
        char cCharAt = strN.charAt(0);
        if (cCharAt == '+' || cCharAt == '-') {
            strN = "GMT".concat(strN);
        } else if (cCharAt == 'Z' && strN.length() == 1) {
            strN = "UTC";
        }
        return TimeZone.getTimeZone(strN);
    }
}
