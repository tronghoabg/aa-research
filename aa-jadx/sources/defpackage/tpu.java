package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpu extends defpackage.tpd {
    private final defpackage.tqc b;

    public tpu(defpackage.tqc tqcVar) {
        this.b = tqcVar;
    }

    private static void a(defpackage.abnv abnvVar, defpackage.tqc tqcVar, int[] iArr, int i, boolean z) throws java.io.IOException {
        int iMax;
        int i2;
        int iQ = defpackage.tnm.q(abnvVar, tqcVar.d, 2, iArr, i);
        int iA = tqcVar.a();
        int iMax2 = z ? java.lang.Math.max(iA, 0) : tqcVar.c + iA;
        if (z) {
            iMax = java.lang.Math.max(4 - iA, 4);
            i2 = 256;
        } else {
            iMax = 12 - iA;
            i2 = 1;
        }
        int i3 = i2 << iMax;
        int iMin = java.lang.Math.min(iQ + i, iArr.length);
        if (!z) {
            while (i < iMin) {
                int i4 = i + 1;
                int i5 = i3 - iArr[i4];
                if (iMax2 < 0) {
                    int i6 = -iMax2;
                    iArr[i] = (iArr[i] >> i6) + tqcVar.a;
                    iArr[i4] = (i5 >> i6) + tqcVar.b;
                } else {
                    iArr[i] = (iArr[i] << iMax2) + tqcVar.a;
                    iArr[i4] = (i5 << iMax2) + tqcVar.b;
                }
                i += 2;
            }
            return;
        }
        if (iMax2 == 0) {
            while (i < iMin) {
                int i7 = i + 1;
                iArr[i7] = i3 - iArr[i7];
                i += 2;
            }
            return;
        }
        while (i < iMin) {
            iArr[i] = iArr[i] << iMax2;
            int i8 = i + 1;
            iArr[i8] = i3 - (iArr[i8] << iMax2);
            i += 2;
        }
    }

    @Override // defpackage.tpd
    public final int b(defpackage.abnv abnvVar) throws java.io.IOException {
        int iP;
        int i = this.b.d - 1;
        if (i == 1) {
            iP = defpackage.tnm.p(abnvVar);
        } else if (i != 2) {
            if (i != 3) {
                throw new java.io.IOException("Unknown vertex encoding :".concat(java.lang.Integer.toString(i)));
            }
            iP = defpackage.tnm.p(abnvVar);
        } else {
            iP = abnvVar.d() / 2;
        }
        return iP / 2;
    }

    @Override // defpackage.tpd
    protected final int c(defpackage.abnv abnvVar, int i) throws java.io.IOException {
        return i == 0 ? b(abnvVar) : i;
    }

    @Override // defpackage.tpd
    public final int d() {
        try {
            defpackage.tqc tqcVar = this.b;
            return tqcVar.c + java.lang.Math.min(0, tqcVar.a());
        } catch (java.io.IOException unused) {
            return this.b.c;
        }
    }

    @Override // defpackage.tpd
    public final int e() {
        return this.b.a;
    }

    @Override // defpackage.tpd
    public final int f() {
        return this.b.b;
    }

    @Override // defpackage.tpd
    public final void h(defpackage.abnv abnvVar, int i, float[] fArr) {
        throw new java.lang.UnsupportedOperationException("Tile-based geometry doesn't have float geometry.");
    }

    @Override // defpackage.tpd
    public final void i(defpackage.abnv abnvVar, defpackage.tpm tpmVar) throws java.io.IOException {
        int iM;
        int unsignedShort;
        int i;
        defpackage.tqc tqcVar = this.b;
        int i2 = tqcVar.d - 1;
        if (i2 == 1) {
            defpackage.abny abnyVarG = abnvVar.g();
            int iM2 = abnyVarG.m();
            iM = abnyVarG.m();
            unsignedShort = iM2;
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new java.io.IOException("Unknown vertex encoding :".concat(java.lang.Integer.toString(i2)));
            }
            defpackage.abny abnyVarG2 = abnvVar.g();
            int iM3 = abnyVarG2.m();
            iM = abnyVarG2.m();
            unsignedShort = iM3;
        } else {
            defpackage.yvb yvbVar = new defpackage.yvb(abnvVar.h());
            unsignedShort = (short) yvbVar.readUnsignedShort();
            iM = (short) yvbVar.readUnsignedShort();
        }
        tpmVar.r(unsignedShort, iM);
        int iA = tqcVar.a();
        int i3 = tqcVar.c + iA;
        int i4 = (1 << (12 - iA)) - tpmVar.b;
        if (i3 < 0) {
            int i5 = -i3;
            tpmVar.a = (tpmVar.a >> i5) + tqcVar.a;
            i = i4 >> i5;
        } else {
            tpmVar.a = (tpmVar.a << i3) + tqcVar.a;
            i = i4 << i3;
        }
        tpmVar.b = i + tqcVar.b;
    }

    @Override // defpackage.tpd
    public final void j(defpackage.abnv abnvVar, int i, int[] iArr) throws java.io.IOException {
        a(abnvVar, this.b, iArr, i + i, false);
    }

    @Override // defpackage.tpd
    public final void k(defpackage.abnv abnvVar, int i, int[] iArr) throws java.io.IOException {
        a(abnvVar, this.b, iArr, i + i, true);
    }
}
