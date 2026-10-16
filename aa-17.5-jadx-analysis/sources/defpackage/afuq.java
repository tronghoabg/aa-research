package defpackage;

/* loaded from: classes.dex */
public final class afuq {
    public static final boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static boolean b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final boolean c(String str, boolean z) {
        String property;
        int i = ajda.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property != null ? Boolean.parseBoolean(property) : z;
    }

    public static final int d(String str, int i, int i2) {
        return (int) e(str, i, i2);
    }

    public static final long e(String str, long j, long j2) {
        String property;
        int i = ajda.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lP = afyh.P(property);
        if (lP == null) {
            throw new IllegalStateException(a.bC(property, str, "System property '", "' has unrecognized value '", "'"));
        }
        long jLongValue = lP.longValue();
        if (jLongValue >= 1 && jLongValue <= j2) {
            return jLongValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range 1.." + j2 + ", but is '" + jLongValue + "'");
    }

    public static final long f(long j, int i) {
        return (j & (-1073741824)) | i;
    }
}
