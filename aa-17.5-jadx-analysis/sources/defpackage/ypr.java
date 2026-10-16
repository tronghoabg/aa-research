package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ypr {
    public static final Locale a = Locale.ROOT;

    public static String a(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return e(obj, simpleName);
    }

    public static String b(Object obj) {
        try {
            return c(obj);
        } catch (RuntimeException e) {
            return a(obj, e);
        }
    }

    public static String c(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj.getClass().isArray()) {
            return obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
        }
        String string = obj.toString();
        return string != null ? string : e(obj, "toString() returned null");
    }

    public static void d(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append(CloudRecognizerProtocolStrings.DBG_VALUE);
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    private static String e(Object obj, String str) {
        return "{" + obj.getClass().getName() + "@" + System.identityHashCode(obj) + ": " + str + "}";
    }
}
