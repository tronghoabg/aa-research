package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yuq {
    public final char[] a;
    final int b;
    final int c;
    final int d;
    final int e;
    public final byte[] f;
    private final java.lang.String g;
    private final boolean[] h;
    private final boolean i;

    private yuq(java.lang.String str, char[] cArr, byte[] bArr) {
        this.g = str;
        cArr.getClass();
        this.a = cArr;
        try {
            int length = cArr.length;
            int iCY = defpackage.ysr.cY(length, java.math.RoundingMode.UNNECESSARY);
            this.c = iCY;
            int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(iCY);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.d = i;
            this.e = iCY >> iNumberOfTrailingZeros;
            this.b = length - 1;
            this.f = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.e; i2++) {
                zArr[defpackage.ysr.cX(i2 * 8, this.c, java.math.RoundingMode.CEILING)] = true;
            }
            this.h = zArr;
            this.i = false;
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    final char a(int i) {
        return this.a[i];
    }

    final int b(char c) throws defpackage.yut {
        if (c > 127) {
            throw new defpackage.yut("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c))));
        }
        byte b = this.f[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new defpackage.yut("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c))));
        }
        throw new defpackage.yut("Unrecognized character: " + c);
    }

    final boolean c(int i) {
        return this.h[i % this.d];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yuq) {
            defpackage.yuq yuqVar = (defpackage.yuq) obj;
            boolean z = yuqVar.i;
            if (java.util.Arrays.equals(this.a, yuqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a) + 1237;
    }

    public final java.lang.String toString() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yuq(java.lang.String str, char[] cArr) {
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            defpackage.ysr.aZ(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            defpackage.ysr.aZ(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr);
    }
}
