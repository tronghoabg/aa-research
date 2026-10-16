package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ate implements defpackage.atc {
    public final float a;
    private final float b;
    private final boolean c;
    private final defpackage.atf d;

    public ate(float f, boolean z, defpackage.atf atfVar) {
        this.b = f;
        this.c = z;
        this.d = atfVar;
        this.a = f;
    }

    @Override // defpackage.atb
    public final float a() {
        return this.a;
    }

    @Override // defpackage.atb
    public final void b(defpackage.dlo dloVar, int i, int[] iArr, defpackage.dlz dlzVar, int[] iArr2) {
        int i2;
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        int iDN = dloVar.dN(this.b);
        boolean z = this.c && dlzVar == defpackage.dlz.b;
        if (z) {
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = java.lang.Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = java.lang.Math.min(iDN, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length) {
                int i9 = iArr[i5];
                int iMin2 = java.lang.Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = java.lang.Math.min(iDN, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        defpackage.atf atfVar = this.d;
        if (atfVar == null || i2 <= 0) {
            return;
        }
        int iA = atfVar.a(i2, dlzVar);
        if (z) {
            iA -= i2;
        }
        if (iA != 0) {
            int length2 = iArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                iArr2[i11] = iArr2[i11] + iA;
            }
        }
    }

    @Override // defpackage.ath
    public final void c(defpackage.dlo dloVar, int i, int[] iArr, int[] iArr2) {
        b(dloVar, i, iArr, defpackage.dlz.a, iArr2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ate)) {
            return false;
        }
        defpackage.ate ateVar = (defpackage.ate) obj;
        return java.lang.Float.compare(this.b, ateVar.b) == 0 && this.c == ateVar.c && defpackage.afga.f(this.d, ateVar.d);
    }

    public final int hashCode() {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.b) * 31;
        defpackage.atf atfVar = this.d;
        return ((iFloatToIntBits + (true != this.c ? 1237 : 1231)) * 31) + (atfVar == null ? 0 : atfVar.hashCode());
    }

    public final java.lang.String toString() {
        return (true != this.c ? "Absolute" : "") + "Arrangement#spacedAligned(" + defpackage.dlr.b(this.b) + ", " + this.d + ")";
    }
}
