package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class tow extends tof {
    private final tpe b;

    public tow(tpe tpeVar) {
        this.b = tpeVar;
    }

    private static void a(abms abmsVar, tpe tpeVar, int[] iArr, int i, boolean z) throws IOException {
        int iMax;
        int i2;
        int iN = tmo.n(abmsVar, tpeVar.d, 2, iArr, i);
        int iA = tpeVar.a();
        int iMax2 = z ? Math.max(iA, 0) : tpeVar.c + iA;
        if (z) {
            iMax = Math.max(4 - iA, 4);
            i2 = 256;
        } else {
            iMax = 12 - iA;
            i2 = 1;
        }
        int i3 = i2 << iMax;
        int iMin = Math.min(iN + i, iArr.length);
        if (!z) {
            while (i < iMin) {
                int i4 = i + 1;
                int i5 = i3 - iArr[i4];
                if (iMax2 < 0) {
                    int i6 = -iMax2;
                    iArr[i] = (iArr[i] >> i6) + tpeVar.a;
                    iArr[i4] = (i5 >> i6) + tpeVar.b;
                } else {
                    iArr[i] = (iArr[i] << iMax2) + tpeVar.a;
                    iArr[i4] = (i5 << iMax2) + tpeVar.b;
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

    @Override // defpackage.tof
    public final int b(abms abmsVar) throws IOException {
        int iM;
        int i = this.b.d - 1;
        if (i == 1) {
            iM = tmo.m(abmsVar);
        } else if (i != 2) {
            if (i != 3) {
                throw new IOException("Unknown vertex encoding :".concat(Integer.toString(i)));
            }
            iM = tmo.m(abmsVar);
        } else {
            iM = abmsVar.d() / 2;
        }
        return iM / 2;
    }

    @Override // defpackage.tof
    protected final int c(abms abmsVar, int i) throws IOException {
        return i == 0 ? b(abmsVar) : i;
    }

    @Override // defpackage.tof
    public final int d() {
        try {
            tpe tpeVar = this.b;
            return tpeVar.c + Math.min(0, tpeVar.a());
        } catch (IOException unused) {
            return this.b.c;
        }
    }

    @Override // defpackage.tof
    public final int e() {
        return this.b.a;
    }

    @Override // defpackage.tof
    public final int f() {
        return this.b.b;
    }

    @Override // defpackage.tof
    public final void h(abms abmsVar, int i, float[] fArr) {
        throw new UnsupportedOperationException("Tile-based geometry doesn't have float geometry.");
    }

    @Override // defpackage.tof
    public final void i(abms abmsVar, too tooVar) throws IOException {
        int iP;
        int unsignedShort;
        int i;
        tpe tpeVar = this.b;
        int i2 = tpeVar.d - 1;
        if (i2 == 1) {
            abmw abmwVarG = abmsVar.g();
            int iP2 = abmwVarG.p();
            iP = abmwVarG.p();
            unsignedShort = iP2;
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new IOException("Unknown vertex encoding :".concat(Integer.toString(i2)));
            }
            abmw abmwVarG2 = abmsVar.g();
            int iP22 = abmwVarG2.p();
            iP = abmwVarG2.p();
            unsignedShort = iP22;
        } else {
            ytw ytwVar = new ytw(abmsVar.h());
            unsignedShort = (short) ytwVar.readUnsignedShort();
            iP = (short) ytwVar.readUnsignedShort();
        }
        tooVar.r(unsignedShort, iP);
        int iA = tpeVar.a();
        int i3 = tpeVar.c + iA;
        int i4 = (1 << (12 - iA)) - tooVar.b;
        if (i3 < 0) {
            int i5 = -i3;
            tooVar.a = (tooVar.a >> i5) + tpeVar.a;
            i = i4 >> i5;
        } else {
            tooVar.a = (tooVar.a << i3) + tpeVar.a;
            i = i4 << i3;
        }
        tooVar.b = i + tpeVar.b;
    }

    @Override // defpackage.tof
    public final void j(abms abmsVar, int i, int[] iArr) throws IOException {
        a(abmsVar, this.b, iArr, i + i, false);
    }

    @Override // defpackage.tof
    public final void k(abms abmsVar, int i, int[] iArr) throws IOException {
        a(abmsVar, this.b, iArr, i + i, true);
    }
}
