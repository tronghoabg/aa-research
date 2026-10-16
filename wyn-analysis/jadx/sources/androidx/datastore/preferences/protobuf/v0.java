package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f18273a;

    static {
        f18273a = (s0.f18266f && s0.f18265e && !AbstractC1386c.a()) ? new t0(1) : new t0(0);
    }

    public static int a(int i5, int i10, byte[] bArr) {
        byte b5 = bArr[i5 - 1];
        int i11 = i10 - i5;
        if (i11 == 0) {
            if (b5 > -12) {
                return -1;
            }
            return b5;
        }
        if (i11 == 1) {
            return c(b5, bArr[i5]);
        }
        if (i11 == 2) {
            return d(b5, bArr[i5], bArr[i5 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i5 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i5 += (127 - cCharAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new u0(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i5;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int c(int i5, int i10) {
        if (i5 > -12 || i10 > -65) {
            return -1;
        }
        return i5 ^ (i10 << 8);
    }

    public static int d(int i5, int i10, int i11) {
        if (i5 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i5 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
