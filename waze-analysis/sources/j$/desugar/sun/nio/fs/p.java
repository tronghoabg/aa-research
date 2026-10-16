package j$.desugar.sun.nio.fs;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final long f49685a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f49686b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f49687c;

    static {
        long j2 = 0;
        for (int iMax = Math.max(Math.min(48, 63), 0); iMax <= Math.max(Math.min(57, 63), 0); iMax++) {
            j2 |= 1 << iMax;
        }
        long jB = b('A', 'Z') | b('a', 'z');
        long jD = d("-_.!~*'()");
        long jC = jB | c("-_.!~*'()");
        long jD2 = j2 | jD | d(":@&=+$,");
        long jC2 = jC | c(":@&=+$,");
        f49685a = jD2 | d(";/");
        f49686b = jC2 | c(";/");
        f49687c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            throw new AssertionError();
        }
        return c2 - '7';
    }

    public static long b(char c2, char c3) {
        long j2 = 0;
        for (int iMax = Math.max(Math.min((int) c2, 127), 64) - 64; iMax <= Math.max(Math.min((int) c3, 127), 64) - 64; iMax++) {
            j2 |= 1 << iMax;
        }
        return j2;
    }

    public static long c(String str) {
        int length = str.length();
        long j2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '@' && cCharAt < 128) {
                j2 |= 1 << (cCharAt - '@');
            }
        }
        return j2;
    }

    public static long d(String str) {
        int length = str.length();
        long j2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '@') {
                j2 |= 1 << cCharAt;
            }
        }
        return j2;
    }
}
