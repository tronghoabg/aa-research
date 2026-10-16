package androidx.car.app.utils;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
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
