package defpackage;

/* loaded from: classes.dex */
public final class asz implements asx {
    public final float a;
    private final float b;
    private final boolean c;
    private final ata d;

    public asz(float f, boolean z, ata ataVar) {
        this.b = f;
        this.c = z;
        this.d = ataVar;
        this.a = f;
    }

    @Override // defpackage.asw
    public final float a() {
        return this.a;
    }

    @Override // defpackage.asw
    public final void b(dlg dlgVar, int i, int[] iArr, dlr dlrVar, int[] iArr2) {
        int i2;
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        int iEF = dlgVar.eF(this.b);
        boolean z = this.c && dlrVar == dlr.b;
        if (z) {
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iEF, iMax);
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
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iEF, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        ata ataVar = this.d;
        if (ataVar == null || i2 <= 0) {
            return;
        }
        int iA = ataVar.a(i2, dlrVar);
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

    @Override // defpackage.atc
    public final void c(dlg dlgVar, int i, int[] iArr, int[] iArr2) {
        b(dlgVar, i, iArr, dlr.a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asz)) {
            return false;
        }
        asz aszVar = (asz) obj;
        return Float.compare(this.b, aszVar.b) == 0 && this.c == aszVar.c && affa.f(this.d, aszVar.d);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.b) * 31;
        ata ataVar = this.d;
        return ((iFloatToIntBits + (true != this.c ? 1237 : 1231)) * 31) + (ataVar == null ? 0 : ataVar.hashCode());
    }

    public final String toString() {
        return (true != this.c ? "Absolute" : "") + "Arrangement#spacedAligned(" + dlj.b(this.b) + ", " + this.d + ")";
    }
}
