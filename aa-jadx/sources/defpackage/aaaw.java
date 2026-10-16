package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaaw {
    private final int[] a;
    private volatile defpackage.aaax b;
    private volatile float c = -1.0f;

    public aaaw(int[] iArr) {
        this.a = iArr;
    }

    public final float a() {
        int iD = d();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= iD) {
                throw new java.lang.IllegalStateException("all segments are degenerate");
            }
            if (!h(i, i2)) {
                return c(i);
            }
            i = i2;
        }
    }

    public final float b() {
        for (int iD = d() - 2; iD >= 0; iD--) {
            if (!h(iD, iD + 1)) {
                return c(iD);
            }
        }
        throw new java.lang.IllegalStateException("all segments are degenerate");
    }

    public final float c(int i) {
        int[] iArr = this.a;
        int i2 = i + i;
        return (float) java.lang.Math.atan2(iArr[i2 + 3] - iArr[i2 + 1], iArr[i2 + 2] - iArr[i2]);
    }

    public final int d() {
        return this.a.length >> 1;
    }

    public final defpackage.aaav e() {
        int[] iArr = this.a;
        int length = iArr.length;
        return new defpackage.aaav(iArr[length - 2], iArr[length - 1]);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aaaw) {
            return java.util.Arrays.equals(this.a, ((defpackage.aaaw) obj).a);
        }
        return false;
    }

    public final defpackage.aaav f(int i) {
        int[] iArr = this.a;
        int i2 = i + i;
        return new defpackage.aaav(iArr[i2], iArr[i2 + 1]);
    }

    public final void g(int i, defpackage.aaav aaavVar) {
        int[] iArr = this.a;
        int i2 = i + i;
        aaavVar.a = iArr[i2];
        aaavVar.b = iArr[i2 + 1];
    }

    public final boolean h(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + i2;
        int i4 = i3 + 1;
        int i5 = i + i;
        int i6 = i5 + 1;
        return iArr[i5] == iArr[i3] && iArr[i6] == iArr[i4];
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final boolean i() {
        int[] iArr = this.a;
        int length = iArr.length;
        return length > 0 && iArr[0] == iArr[length + (-2)] && iArr[1] == iArr[length + (-1)];
    }

    public final boolean j(defpackage.aaav aaavVar) {
        int i;
        int iD;
        defpackage.aaav aaavVarE;
        if (d() > 1) {
            if (this.b == null) {
                if (d() > 0) {
                    defpackage.aaav aaavVarF = f(0);
                    int i2 = aaavVarF.a;
                    int i3 = aaavVarF.b;
                    int i4 = i3;
                    int i5 = i2;
                    for (int i6 = 1; i6 < d(); i6++) {
                        g(i6, aaavVarF);
                        int i7 = aaavVarF.a;
                        if (i7 < i2) {
                            i2 = i7;
                        }
                        if (i7 > i5) {
                            i5 = i7;
                        }
                        int i8 = aaavVarF.b;
                        if (i8 < i3) {
                            i3 = i8;
                        }
                        if (i8 > i4) {
                            i4 = i8;
                        }
                    }
                    aaavVarF.d(i2, i3);
                    this.b = new defpackage.aaax(aaavVarF, new defpackage.aaav(i5, i4));
                } else {
                    this.b = new defpackage.aaax(new defpackage.aaav(0, 0), new defpackage.aaav(0, 0));
                }
            }
            defpackage.aaax aaaxVar = this.b;
            int i9 = aaavVar.a;
            defpackage.aaav aaavVar2 = aaaxVar.a;
            if (i9 >= aaavVar2.a) {
                defpackage.aaav aaavVar3 = aaaxVar.b;
                if (i9 <= aaavVar3.a && (i = aaavVar.b) >= aaavVar2.b && i <= aaavVar3.b) {
                    if (i()) {
                        int iD2 = d();
                        iD = iD2 - 1;
                        aaavVarE = f(iD2 - 2);
                    } else {
                        iD = d();
                        aaavVarE = e();
                    }
                    defpackage.aaav aaavVar4 = new defpackage.aaav(0, 0);
                    int i10 = 0;
                    for (int i11 = 0; i11 < iD; i11++) {
                        g(i11, aaavVar4);
                        if (defpackage.aaav.e(aaavVarE, aaavVar4, aaavVar)) {
                            i10++;
                        }
                        aaavVarE.c(aaavVar4);
                    }
                    if ((i10 & 1) == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
