package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class DesugarTimeZone {
    public static java.util.TimeZone getTimeZone(j$.time.ZoneId zoneId) {
        java.lang.String id = zoneId.getId();
        char cCharAt = id.charAt(0);
        if (cCharAt == '+' || cCharAt == '-') {
            id = "GMT".concat(id);
        } else if (cCharAt == 'Z' && id.length() == 1) {
            id = "UTC";
        }
        return java.util.TimeZone.getTimeZone(id);
    }

    public static java.util.TimeZone getTimeZone(java.lang.String str) {
        return java.util.TimeZone.getTimeZone(str);
    }
}
