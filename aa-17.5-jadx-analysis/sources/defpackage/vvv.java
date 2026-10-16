package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vvv {
    private final aezk i;
    private final aezk j;
    private static final ygr d = ygr.r("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final Pattern e = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final Pattern a = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern f = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    public static final Pattern b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
    public static final Pattern c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
    private static final Pattern g = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern h = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    public vvv(aezk aezkVar, aezk aezkVar2) {
        this.i = aezkVar;
        this.j = aezkVar2;
    }

    static String a(String str) {
        Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = h.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    static String d(String str, boolean z) {
        boolean z2;
        if (woy.am(str)) {
            return null;
        }
        if (z) {
            z2 = true;
        } else {
            String strA = a(str);
            if (strA != null) {
                str = strA;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            str = matcher.group(1);
            z2 = true;
        }
        String strB = b(str);
        if (strB != null && !strB.equals(str)) {
            z2 = true;
        }
        if (strB != null) {
            Matcher matcher2 = h.matcher(strB);
            if (matcher2.find()) {
                strB = matcher2.replaceFirst("<ip>");
                z2 = true;
            }
        }
        if (strB == null || z2) {
            return strB;
        }
        Matcher matcher3 = g.matcher(strB);
        if (matcher3.find()) {
            return matcher3.group(1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajgu c(java.lang.Iterable r19) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvv.c(java.lang.Iterable):ajgu");
    }
}
