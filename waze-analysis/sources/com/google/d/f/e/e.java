package com.google.d.f.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends RuntimeException {
    private e(String str) {
        super(str);
    }

    public static e a(String str, String str2, int i2) {
        return new e(e(str, str2, i2, i2 + 1));
    }

    public static e b(String str, String str2, int i2, int i3) {
        return new e(e(str, str2, i2, i3));
    }

    public static e c(String str, String str2, int i2) {
        return new e(e(str, str2, i2, -1));
    }

    public static e d(String str) {
        return new e(str);
    }

    private static String e(String str, String str2, int i2, int i3) {
        if (i3 < 0) {
            i3 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i2 > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i2 - 5, i2);
        } else {
            sb.append((CharSequence) str2, 0, i2);
        }
        sb.append('[');
        sb.append(str2.substring(i2, i3));
        sb.append(']');
        if (str2.length() - i3 > 8) {
            sb.append((CharSequence) str2, i3, i3 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i3, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
