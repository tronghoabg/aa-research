package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzr {
    private final int[] a;
    private volatile zzs b;
    private volatile float c = -1.0f;

    public zzr(int[] iArr) {
        this.a = iArr;
    }

    public final float a() {
        int iD = d();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= iD) {
                throw new IllegalStateException("all segments are degenerate");
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
        throw new IllegalStateException("all segments are degenerate");
    }

    public final float c(int i) {
        int[] iArr = this.a;
        int i2 = i + i;
        return (float) Math.atan2(iArr[i2 + 3] - iArr[i2 + 1], iArr[i2 + 2] - iArr[i2]);
    }

    public final int d() {
        return this.a.length >> 1;
    }

    public final zzq e() {
        int[] iArr = this.a;
        int length = iArr.length;
        return new zzq(iArr[length - 2], iArr[length - 1]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzr) {
            return Arrays.equals(this.a, ((zzr) obj).a);
        }
        return false;
    }

    public final zzq f(int i) {
        int[] iArr = this.a;
        int i2 = i + i;
        return new zzq(iArr[i2], iArr[i2 + 1]);
    }

    public final void g(int i, zzq zzqVar) {
        int[] iArr = this.a;
        int i2 = i + i;
        zzqVar.a = iArr[i2];
        zzqVar.b = iArr[i2 + 1];
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
        return Arrays.hashCode(this.a);
    }

    public final boolean i() {
        int[] iArr = this.a;
        int length = iArr.length;
        return length > 0 && iArr[0] == iArr[length + (-2)] && iArr[1] == iArr[length + (-1)];
    }

    public final boolean j(zzq zzqVar) {
        int i;
        int iD;
        zzq zzqVarE;
        if (d() > 1) {
            if (this.b == null) {
                if (d() > 0) {
                    zzq zzqVarF = f(0);
                    int i2 = zzqVarF.a;
                    int i3 = zzqVarF.b;
                    int i4 = i3;
                    int i5 = i2;
                    for (int i6 = 1; i6 < d(); i6++) {
                        g(i6, zzqVarF);
                        int i7 = zzqVarF.a;
                        if (i7 < i2) {
                            i2 = i7;
                        }
                        if (i7 > i5) {
                            i5 = i7;
                        }
                        int i8 = zzqVarF.b;
                        if (i8 < i3) {
                            i3 = i8;
                        }
                        if (i8 > i4) {
                            i4 = i8;
                        }
                    }
                    zzqVarF.d(i2, i3);
                    this.b = new zzs(zzqVarF, new zzq(i5, i4));
                } else {
                    this.b = new zzs(new zzq(0, 0), new zzq(0, 0));
                }
            }
            zzs zzsVar = this.b;
            int i9 = zzqVar.a;
            zzq zzqVar2 = zzsVar.a;
            if (i9 >= zzqVar2.a) {
                zzq zzqVar3 = zzsVar.b;
                if (i9 <= zzqVar3.a && (i = zzqVar.b) >= zzqVar2.b && i <= zzqVar3.b) {
                    if (i()) {
                        int iD2 = d();
                        iD = iD2 - 1;
                        zzqVarE = f(iD2 - 2);
                    } else {
                        iD = d();
                        zzqVarE = e();
                    }
                    zzq zzqVar4 = new zzq(0, 0);
                    int i10 = 0;
                    for (int i11 = 0; i11 < iD; i11++) {
                        g(i11, zzqVar4);
                        if (zzq.e(zzqVarE, zzqVar4, zzqVar)) {
                            i10++;
                        }
                        zzqVarE.c(zzqVar4);
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
