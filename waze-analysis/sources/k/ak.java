package k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ak extends k {

    /* renamed from: b, reason: collision with root package name */
    private final transient byte[][] f50816b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int[] f50817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(byte[][] bArr, int[] iArr) {
        super(k.f50843a.q());
        h.g.b.x.f(bArr, "segments");
        h.g.b.x.f(iArr, "directory");
        this.f50816b = bArr;
        this.f50817c = iArr;
    }

    private final k C() {
        return new k(s());
    }

    private final Object writeReplace() {
        return C();
    }

    public final int[] A() {
        return this.f50817c;
    }

    public final byte[][] B() {
        return this.f50816b;
    }

    @Override // k.k
    public final byte a(int i2) {
        byte[][] bArr = this.f50816b;
        int length = bArr.length;
        int[] iArr = this.f50817c;
        okhttp3.internal.publicsuffix.a.g(iArr[length - 1], i2, 1L);
        int i3 = y.i(this, i2);
        return bArr[i3][(i2 - (i3 == 0 ? 0 : iArr[i3 - 1])) + iArr[length + i3]];
    }

    @Override // k.k
    public final int d() {
        return this.f50817c[this.f50816b.length - 1];
    }

    @Override // k.k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return kVar.d() == d() && v(0, kVar, d());
        }
        return false;
    }

    @Override // k.k
    public final int f(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "other");
        return C().f(bArr, i2);
    }

    @Override // k.k
    public final String h() {
        return C().h();
    }

    @Override // k.k
    public final int hashCode() {
        int iC = c();
        if (iC != 0) {
            return iC;
        }
        byte[][] bArr = this.f50816b;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f50817c;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        m(i3);
        return i3;
    }

    @Override // k.k
    public final k k(int i2, int i3) {
        ak akVar = this;
        int iE = okhttp3.internal.publicsuffix.a.e(akVar, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex=" + i2 + " < 0");
        }
        if (iE > d()) {
            throw new IllegalArgumentException("endIndex=" + iE + " > length(" + d() + ")");
        }
        int i4 = iE - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException("endIndex=" + iE + " < beginIndex=" + i2);
        }
        if (i2 == 0 && iE == d()) {
            return akVar;
        }
        if (i2 == iE) {
            return k.f50843a;
        }
        int i5 = y.i(this, i2);
        int i6 = y.i(this, iE - 1);
        byte[][] bArr = this.f50816b;
        byte[][] bArr2 = (byte[][]) h.a.c.u(bArr, i5, i6 + 1);
        byte[][] bArr3 = bArr2;
        int length = bArr3.length;
        int[] iArr = new int[length + length];
        if (i5 <= i6) {
            int i7 = i5;
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.f50817c;
                iArr[i8] = Math.min(iArr2[i7] - i2, i4);
                int i9 = i8 + 1;
                iArr[i8 + bArr3.length] = iArr2[bArr.length + i7];
                if (i7 == i6) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = i5 != 0 ? this.f50817c[i5 - 1] : 0;
        int length2 = bArr3.length;
        iArr[length2] = iArr[length2] + (i2 - i10);
        return new ak(bArr2, iArr);
    }

    @Override // k.k
    public final k l() {
        return C().l();
    }

    @Override // k.k
    public final boolean o(int i2, byte[] bArr, int i3, int i4) {
        int i5;
        h.g.b.x.f(bArr, "other");
        if (i2 < 0 || i2 > d() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i6 = i4 + i2;
        int i7 = y.i(this, i2);
        while (i2 < i6) {
            if (i7 == 0) {
                i7 = 0;
                i5 = 0;
            } else {
                i5 = this.f50817c[i7 - 1];
            }
            int[] iArr = this.f50817c;
            int i8 = iArr[i7] - i5;
            byte[][] bArr2 = this.f50816b;
            int i9 = iArr[bArr2.length + i7];
            int iMin = Math.min(i6, i8 + i5) - i2;
            if (!okhttp3.internal.publicsuffix.a.h(bArr2[i7], i9 + (i2 - i5), bArr, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            i7++;
        }
        return true;
    }

    @Override // k.k
    public final byte[] r() {
        return s();
    }

    @Override // k.k
    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f50816b;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f50817c;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            h.a.c.an(bArr2[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // k.k
    public final String toString() {
        return C().toString();
    }

    @Override // k.k
    public final boolean v(int i2, k kVar, int i3) {
        int i4;
        h.g.b.x.f(kVar, "other");
        if (i2 < 0 || i2 > d() - i3) {
            return false;
        }
        int i5 = i3 + i2;
        int i6 = y.i(this, i2);
        int i7 = 0;
        while (i2 < i5) {
            if (i6 == 0) {
                i6 = 0;
                i4 = 0;
            } else {
                i4 = this.f50817c[i6 - 1];
            }
            int[] iArr = this.f50817c;
            int i8 = iArr[i6] - i4;
            byte[][] bArr = this.f50816b;
            int i9 = iArr[bArr.length + i6];
            int iMin = Math.min(i5, i8 + i4) - i2;
            if (!kVar.o(i7, bArr[i6], i9 + (i2 - i4), iMin)) {
                return false;
            }
            i7 += iMin;
            i2 += iMin;
            i6++;
        }
        return true;
    }

    @Override // k.k
    public final void x(h hVar, int i2) {
        int i3;
        h.g.b.x.f(hVar, "buffer");
        int i4 = y.i(this, 0);
        int i5 = 0;
        while (i5 < i2) {
            if (i4 == 0) {
                i4 = 0;
                i3 = 0;
            } else {
                i3 = this.f50817c[i4 - 1];
            }
            int[] iArr = this.f50817c;
            int i6 = iArr[i4] - i3;
            byte[][] bArr = this.f50816b;
            int i7 = iArr[bArr.length + i4];
            int iMin = Math.min(i2, i6 + i3) - i5;
            int i8 = i7 + (i5 - i3);
            ai aiVar = new ai(bArr[i4], i8, i8 + iMin, true);
            ai aiVar2 = hVar.f50841a;
            if (aiVar2 == null) {
                aiVar.f50812g = aiVar;
                aiVar.f50811f = aiVar.f50812g;
                hVar.f50841a = aiVar.f50811f;
            } else {
                ai aiVar3 = aiVar2.f50812g;
                h.g.b.x.c(aiVar3);
                aiVar3.d(aiVar);
            }
            i5 += iMin;
            i4++;
        }
        hVar.P(hVar.q() + i2);
    }

    @Override // k.k
    public final int z(byte[] bArr) {
        h.g.b.x.f(bArr, "other");
        return C().z(bArr);
    }
}
