package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yti extends defpackage.ytg {
    private static final java.lang.String a;

    static {
        java.lang.String property;
        try {
            property = java.lang.System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (java.lang.SecurityException unused) {
        }
        a = property;
    }

    static int b(java.lang.String str, int i) throws defpackage.yth {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw defpackage.yth.c("trailing unquoted '%' character", str, i);
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    @Override // defpackage.ytg
    public final void a(java.lang.StringBuilder sb, java.lang.String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%') {
                    sb.append((java.lang.CharSequence) str, i3, i4);
                } else if (cCharAt == 'n') {
                    sb.append((java.lang.CharSequence) str, i3, i);
                    sb.append(a);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((java.lang.CharSequence) str, i3, i2);
        }
    }
}
