package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class afvq {
    public static final boolean a(char c) {
        return java.lang.Character.isWhitespace(c) || java.lang.Character.isSpaceChar(c);
    }

    public static boolean b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = java.lang.Character.toUpperCase(c);
        char upperCase2 = java.lang.Character.toUpperCase(c2);
        return upperCase == upperCase2 || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2);
    }

    public static final long c(long j, int i) {
        return (j & (-1073741824)) | ((long) i);
    }

    public static final void d(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Expected positive parallelism level, but got "));
        }
    }
}
