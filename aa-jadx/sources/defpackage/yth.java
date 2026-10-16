package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yth extends java.lang.RuntimeException {
    public yth(java.lang.String str) {
        super(str);
    }

    public static defpackage.yth a(java.lang.String str, java.lang.String str2, int i) {
        return new defpackage.yth(d(str, str2, i, i + 1));
    }

    public static defpackage.yth b(java.lang.String str, java.lang.String str2, int i, int i2) {
        return new defpackage.yth(d(str, str2, i, i2));
    }

    public static defpackage.yth c(java.lang.String str, java.lang.String str2, int i) {
        return new defpackage.yth(d(str, str2, i, -1));
    }

    private static java.lang.String d(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((java.lang.CharSequence) str2, i - 5, i);
        } else {
            sb.append((java.lang.CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((java.lang.CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((java.lang.CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
