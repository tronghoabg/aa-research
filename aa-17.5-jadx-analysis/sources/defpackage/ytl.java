package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
final class ytl {
    public final char[] a;
    final int b;
    final int c;
    final int d;
    final int e;
    public final byte[] f;
    private final String g;
    private final boolean[] h;
    private final boolean i;

    private ytl(String str, char[] cArr, byte[] bArr) {
        this.g = str;
        cArr.getClass();
        this.a = cArr;
        try {
            int length = cArr.length;
            int iAG = wub.aG(length, RoundingMode.UNNECESSARY);
            this.c = iAG;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iAG);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.d = i;
            this.e = iAG >> iNumberOfTrailingZeros;
            this.b = length - 1;
            this.f = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.e; i2++) {
                zArr[wub.aF(i2 * 8, this.c, RoundingMode.CEILING)] = true;
            }
            this.h = zArr;
            this.i = false;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    final char a(int i) {
        return this.a[i];
    }

    final int b(char c) throws yto {
        if (c > 127) {
            throw new yto("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.f[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new yto("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new yto("Unrecognized character: " + c);
    }

    final boolean c(int i) {
        return this.h[i % this.d];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ytl) {
            ytl ytlVar = (ytl) obj;
            boolean z = ytlVar.i;
            if (Arrays.equals(this.a, ytlVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 1237;
    }

    public final String toString() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ytl(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            woy.P(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            woy.P(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr);
    }
}
