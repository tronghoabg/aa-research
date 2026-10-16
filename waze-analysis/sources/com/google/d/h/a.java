package com.google.d.h;

import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f7897a;

    /* renamed from: b, reason: collision with root package name */
    final int f7898b;

    /* renamed from: c, reason: collision with root package name */
    final int f7899c;

    /* renamed from: d, reason: collision with root package name */
    final int f7900d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7901e;

    /* renamed from: f, reason: collision with root package name */
    private final char[] f7902f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f7903g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f7904h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7905i;

    private a(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f7901e = str;
        an.B(cArr);
        this.f7902f = cArr;
        try {
            int length = cArr.length;
            int i2 = com.google.d.j.e.i(length, RoundingMode.UNNECESSARY);
            this.f7898b = i2;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
            int i3 = 1 << (3 - iNumberOfTrailingZeros);
            this.f7899c = i3;
            this.f7900d = i2 >> iNumberOfTrailingZeros;
            this.f7897a = length - 1;
            this.f7903g = bArr;
            boolean[] zArr = new boolean[i3];
            for (int i4 = 0; i4 < this.f7900d; i4++) {
                zArr[com.google.d.j.e.h(i4 * 8, this.f7898b, RoundingMode.CEILING)] = true;
            }
            this.f7904h = zArr;
            this.f7905i = z;
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
        }
    }

    private final boolean i() {
        int i2 = 0;
        while (true) {
            char[] cArr = this.f7902f;
            if (i2 >= cArr.length) {
                return false;
            }
            if (an.N(cArr[i2])) {
                return true;
            }
            i2++;
        }
    }

    private final boolean j() {
        int i2 = 0;
        while (true) {
            char[] cArr = this.f7902f;
            if (i2 >= cArr.length) {
                return false;
            }
            if (an.O(cArr[i2])) {
                return true;
            }
            i2++;
        }
    }

    final char a(int i2) {
        return this.f7902f[i2];
    }

    final int b(char c2) throws d {
        if (c2 > 127) {
            throw new d("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        byte b2 = this.f7903g[c2];
        if (b2 != -1) {
            return b2;
        }
        if (c2 <= ' ' || c2 == 127) {
            throw new d("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        throw new d("Unrecognized character: " + c2);
    }

    final a c() {
        if (this.f7905i) {
            return this;
        }
        byte[] bArr = this.f7903g;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i2 = 65; i2 <= 90; i2++) {
            int i3 = i2 | 32;
            byte b2 = bArr[i2];
            byte b3 = bArr[i3];
            if (b2 == -1) {
                bArrCopyOf[i2] = b3;
            } else {
                char c2 = (char) i2;
                char c3 = (char) i3;
                if (b3 != -1) {
                    throw new IllegalStateException(an.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c2), Character.valueOf(c3)));
                }
                bArrCopyOf[i3] = b2;
            }
        }
        return new a(this.f7901e.concat(".ignoreCase()"), this.f7902f, bArrCopyOf, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    final a d() {
        if (!j()) {
            return this;
        }
        an.v(!i(), "Cannot call lowerCase() on a mixed-case alphabet");
        char[] cArr = this.f7902f;
        char[] cArr2 = new char[cArr.length];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[i2];
            if (an.O(c2)) {
                c2 ^= 32;
            }
            cArr2[i2] = (char) c2;
        }
        a aVar = new a(this.f7901e.concat(".lowerCase()"), cArr2);
        return this.f7905i ? aVar.c() : aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    final a e() {
        if (!i()) {
            return this;
        }
        an.v(!j(), "Cannot call upperCase() on a mixed-case alphabet");
        char[] cArr = this.f7902f;
        char[] cArr2 = new char[cArr.length];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[i2];
            if (an.N(c2)) {
                c2 ^= 32;
            }
            cArr2[i2] = (char) c2;
        }
        a aVar = new a(this.f7901e.concat(".upperCase()"), cArr2);
        return this.f7905i ? aVar.c() : aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f7905i == aVar.f7905i && Arrays.equals(this.f7902f, aVar.f7902f)) {
                return true;
            }
        }
        return false;
    }

    final boolean f(int i2) {
        return this.f7904h[i2 % this.f7899c];
    }

    public final boolean h() {
        byte[] bArr = this.f7903g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7902f) + (true != this.f7905i ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS);
    }

    public final String toString() {
        return this.f7901e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[i2];
            boolean z = true;
            an.n(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z = false;
            }
            an.n(z, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i2;
        }
        this(str, cArr, bArr, false);
    }
}
