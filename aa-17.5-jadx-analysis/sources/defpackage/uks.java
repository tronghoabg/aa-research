package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uks implements tnz {
    public final int[] c;
    public final float[] d;
    public final float[] e;
    public final int[] f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    private volatile tot l = null;
    private static final int[] k = {0, 2, 1, 0, 3, 2};
    public static final boolean[] a = new boolean[1];
    public static final float[] b = new float[0];

    public uks(int[] iArr, float[] fArr, float[] fArr2, int[] iArr2, int i, int i2, int i3, int i4) {
        this.c = iArr;
        this.d = fArr;
        this.e = fArr2;
        this.f = iArr2;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    static int[] g(int i, int i2) {
        if (i2 < 3) {
            return new int[0];
        }
        if (i2 == 4) {
            if (i == 0) {
                return k;
            }
            i2 = 4;
        }
        int i3 = i2 - 2;
        int[] iArr = new int[i3 * 3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i4] = i;
            int i6 = i + i5;
            iArr[i4 + 1] = (i6 + 2) % i2;
            iArr[i4 + 2] = (i6 + 1) % i2;
            i4 += 3;
        }
        return iArr;
    }

    private static int h(int i, int i2, int i3) {
        int i4 = i - i3;
        return i2 < 0 ? i4 << (-i2) : i4 >> i2;
    }

    @Override // defpackage.tnz
    public final tot a() {
        if (this.l != null) {
            return this.l;
        }
        int[] iArr = this.c;
        if (iArr.length < 2) {
            this.l = new tot(new too(0, 0), new too(0, 0));
            return this.l;
        }
        int i = iArr[0];
        int i2 = this.j;
        int i3 = this.h;
        int iAb = a.ab(i, i2, i3);
        int i4 = iArr[1];
        int i5 = this.i;
        int iAb2 = a.ab(i4, i2, i5);
        int iMax = iAb2;
        int iMax2 = iAb;
        for (int i6 = 2; i6 < iArr.length; i6 += 2) {
            int iAb3 = a.ab(iArr[i6], i2, i3);
            iAb = Math.min(iAb, iAb3);
            iMax2 = Math.max(iMax2, iAb3);
            int iAb4 = a.ab(iArr[i6 + 1], i2, i5);
            iAb2 = Math.min(iAb2, iAb4);
            iMax = Math.max(iMax, iAb4);
        }
        this.l = new tot(new too(iAb, iAb2), new too(iMax2, iMax));
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tnz
    public final boolean b(tou touVar) {
        int i = 0;
        if (!a().b(touVar)) {
            return false;
        }
        int[] iArr = this.c;
        int i2 = iArr[0];
        int i3 = this.j;
        int i4 = this.h;
        int iAb = a.ab(i2, i3, i4);
        int i5 = this.i;
        if (touVar.f(new too(iAb, a.ab(iArr[1], i3, i5), 0))) {
            return true;
        }
        too tooVarE = touVar.e(0);
        if (iArr.length != 0 && a().f(tooVarE)) {
            int iH = h(tooVarE.a, i3, i4);
            int iH2 = h(tooVarE.b, i3, i5);
            int i6 = 0;
            while (i6 < d()) {
                int iC = c(i6, i);
                int iC2 = c(i6, 1);
                int iC3 = c(i6, 2);
                int i7 = iArr[iC];
                int i8 = iArr[iC + 1];
                int i9 = iArr[iC2];
                int i10 = iArr[iC2 + 1];
                int i11 = iArr[iC3];
                int i12 = iArr[iC3 + 1];
                int i13 = i10 - i12;
                int i14 = i7 - i11;
                int i15 = i11 - i9;
                int i16 = i8 - i12;
                int i17 = iH - i11;
                int i18 = iH2 - i12;
                int i19 = i12 - i8;
                int i20 = (i13 * i14) + (i16 * i15);
                int i21 = i;
                int i22 = iH2;
                double d = i20;
                double d2 = (i13 * i17) + (i15 * i18);
                double d3 = (i19 * i17) + (i14 * i18);
                double d4 = (d - d2) - d3;
                if (d < 0.0d) {
                    d = -d;
                    d2 = -d2;
                    d3 = -d3;
                    d4 = -d4;
                }
                if (d2 >= 0.0d && d2 <= d && d3 >= 0.0d && d3 <= d && d4 >= 0.0d && d4 <= d) {
                    return true;
                }
                i6++;
                i = i21;
                iH2 = i22;
            }
        }
        boolean z = i;
        too tooVar = new too();
        too tooVar2 = new too();
        too tooVar3 = new too();
        too tooVar4 = ((tot) touVar).a;
        int i23 = z ? 1 : 0;
        while (i23 < 4) {
            too tooVarE2 = touVar.e(i23);
            for (int i24 = z ? 1 : 0; i24 < d(); i24++) {
                f(i24, tooVar, tooVar2, tooVar3);
                if (tss.l(tooVar, tooVar2, tooVar4, tooVarE2) || tss.l(tooVar2, tooVar3, tooVar4, tooVarE2) || tss.l(tooVar3, tooVar, tooVar4, tooVarE2)) {
                    return true;
                }
            }
            i23++;
            tooVar4 = tooVarE2;
        }
        return z;
    }

    public final int c(int i, int i2) {
        int[] iArr = this.f;
        int i3 = (i * 3) + i2;
        if (iArr == null || iArr.length <= 0) {
            return i3 + i3;
        }
        int i4 = iArr[i3];
        return i4 + i4;
    }

    public final int d() {
        int i;
        int length;
        int[] iArr = this.f;
        if (iArr == null || (length = iArr.length) <= 0) {
            int length2 = this.c.length;
            i = length2 > 0 ? length2 / 6 : 0;
        } else {
            i = length / 3;
        }
        return i == 0 ? this.d.length / 6 : i;
    }

    final too e(int i) {
        int[] iArr = this.c;
        int i2 = i + i;
        return new too(iArr[i2], iArr[i2 + 1], 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uks) {
            uks uksVar = (uks) obj;
            if (Arrays.equals(this.c, uksVar.c) && Arrays.equals(this.f, uksVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, too tooVar, too tooVar2, too tooVar3) {
        int[] iArr = this.c;
        int iC = c(i, 0);
        int iC2 = c(i, 1);
        int iC3 = c(i, 2);
        if (iArr.length > 0) {
            int i2 = iC + 1;
            int i3 = iArr[iC];
            int i4 = this.j;
            int i5 = this.h;
            tooVar.a = a.ab(i3, i4, i5);
            int i6 = iArr[i2];
            int i7 = this.i;
            tooVar.b = a.ab(i6, i4, i7);
            tooVar.c = 0;
            tooVar2.a = a.ab(iArr[iC2], i4, i5);
            tooVar2.b = a.ab(iArr[iC2 + 1], i4, i7);
            tooVar2.c = 0;
            tooVar3.a = a.ab(iArr[iC3], i4, i5);
            tooVar3.b = a.ab(iArr[iC3 + 1], i4, i7);
            tooVar3.c = 0;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + Arrays.hashCode(this.f);
    }
}
