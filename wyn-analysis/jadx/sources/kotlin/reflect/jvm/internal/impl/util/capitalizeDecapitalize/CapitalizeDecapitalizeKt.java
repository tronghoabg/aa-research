package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import zf.g;

/* loaded from: classes5.dex */
public final class CapitalizeDecapitalizeKt {
    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        AbstractC3340k.e(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return upperCase + strSubstring;
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        AbstractC3340k.e(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    @NotNull
    public static final String decapitalizeSmartForCompiler(@NotNull String str, boolean z2) {
        Object next;
        AbstractC3340k.e(str, "<this>");
        if (str.length() == 0 || !isUpperCaseCharAt(str, 0, z2)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z2)) {
            if (z2) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            AbstractC3340k.d(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator it = new g(0, str.length() - 1, 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!isUpperCaseCharAt(str, ((Number) next).intValue(), z2)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return toLowerCase(str, z2);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        AbstractC3340k.d(strSubstring2, "substring(...)");
        sb2.append(toLowerCase(strSubstring2, z2));
        String strSubstring3 = str.substring(iIntValue);
        AbstractC3340k.d(strSubstring3, "substring(...)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    private static final boolean isUpperCaseCharAt(String str, int i5, boolean z2) {
        char cCharAt = str.charAt(i5);
        return z2 ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    private static final String toLowerCase(String str, boolean z2) {
        if (z2) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String str) {
        AbstractC3340k.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }
}
