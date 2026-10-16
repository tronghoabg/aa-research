package androidx.car.app.utils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class StringUtils {
    private static final int MAX_SHORT_STRING_LENGTH = 16;

    private StringUtils() {
    }

    public static String shortenString(String str) {
        if (str.length() <= 16) {
            return str;
        }
        return str.substring(0, 8) + "~" + str.substring(str.length() - 8);
    }
}
