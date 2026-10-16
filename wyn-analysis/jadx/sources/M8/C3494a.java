package m8;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: m8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3494a {

    /* renamed from: a, reason: collision with root package name */
    public final String f40392a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f40393b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40394c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40395d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40396e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40397f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f40398g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f40399h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f40400i;

    public C3494a(String str, char[] cArr, byte[] bArr, boolean z2) {
        str.getClass();
        this.f40392a = str;
        cArr.getClass();
        this.f40393b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iF = A6.c.F(length);
            this.f40395d = iF;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iF);
            int i5 = 1 << (3 - iNumberOfTrailingZeros);
            this.f40396e = i5;
            this.f40397f = iF >> iNumberOfTrailingZeros;
            this.f40394c = cArr.length - 1;
            this.f40398g = bArr;
            boolean[] zArr = new boolean[i5];
            for (int i10 = 0; i10 < this.f40397f; i10++) {
                int i11 = this.f40395d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[A6.c.q(i10 * 8, i11)] = true;
            }
            this.f40399h = zArr;
            this.f40400i = z2;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
        }
    }

    public final int a(char c10) throws C3497d {
        if (c10 > 127) {
            throw new C3497d("Unrecognized character: 0x" + Integer.toHexString(c10));
        }
        byte b5 = this.f40398g[c10];
        if (b5 != -1) {
            return b5;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new C3497d("Unrecognized character: 0x" + Integer.toHexString(c10));
        }
        throw new C3497d("Unrecognized character: " + c10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3494a)) {
            return false;
        }
        C3494a c3494a = (C3494a) obj;
        return this.f40400i == c3494a.f40400i && Arrays.equals(this.f40393b, c3494a.f40393b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40393b) + (this.f40400i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f40392a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3494a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            char c10 = cArr[i5];
            if (c10 < 128) {
                if (bArr[c10] == -1) {
                    bArr[c10] = (byte) i5;
                } else {
                    throw new IllegalArgumentException(Fe.g.E("Duplicate character: %s", Character.valueOf(c10)));
                }
            } else {
                throw new IllegalArgumentException(Fe.g.E("Non-ASCII character: %s", Character.valueOf(c10)));
            }
        }
        this(str, cArr, bArr, false);
    }
}
