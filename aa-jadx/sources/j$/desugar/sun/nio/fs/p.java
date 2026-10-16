package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    public static final long a;
    public static final long b;
    public static final char[] c;

    static {
        long j = 0;
        for (int i = 48; i <= 57; i++) {
            j |= 1 << i;
        }
        long jB = b('A', 'Z') | b('a', 'z');
        long jD = d("-_.!~*'()");
        long jC = jB | c("-_.!~*'()");
        long jD2 = j | jD | d(":@&=+$,");
        long jC2 = jC | c(":@&=+$,");
        a = jD2 | d(";/");
        b = c(";/") | jC2;
        c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            throw new java.lang.AssertionError();
        }
        return c2 - '7';
    }

    public static long b(char c2, char c3) {
        long j = 0;
        for (int iMax = java.lang.Math.max(java.lang.Math.min((int) c2, 127), 64) - 64; iMax <= java.lang.Math.max(java.lang.Math.min((int) c3, 127), 64) - 64; iMax++) {
            j |= 1 << iMax;
        }
        return j;
    }

    public static long c(java.lang.String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '@' && cCharAt < 128) {
                j |= 1 << (cCharAt - '@');
            }
        }
        return j;
    }

    public static long d(java.lang.String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '@') {
                j |= 1 << cCharAt;
            }
        }
        return j;
    }
}
