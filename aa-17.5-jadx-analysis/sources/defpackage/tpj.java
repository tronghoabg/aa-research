package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class tpj extends tpl {
    public final too[] a;
    public final toe b;
    public final tpk c;
    public final tot d;
    private final too[] f;
    private too[][] g;

    public tpj(too[] tooVarArr) {
        this.a = new too[tooVarArr.length];
        for (int i = 0; i < 4; i++) {
            too[] tooVarArr2 = this.a;
            too tooVar = new too();
            tooVarArr2[i] = tooVar;
            tooVarArr[i].w(tooVar);
        }
        this.f = tooVarArr;
        toe toeVar = new toe(tooVarArr);
        this.b = toeVar;
        tot totVar = toeVar.b;
        this.d = totVar;
        tpk tpkVar = new tpk(totVar);
        this.c = tpkVar;
        boolean z = tpkVar.e;
        this.e = z;
        if (z) {
            i();
        }
    }

    private static void h(too tooVar, too tooVar2, int i, too[][] tooVarArr) {
        int i2 = i - 1;
        int i3 = (Math.abs(tooVar2.a) > Math.abs(tooVar.a) ? tooVar2.a : tooVar.a) > 0 ? 536870913 : -536870913;
        int i4 = tooVar.a;
        int i5 = tooVar2.a;
        int i6 = tooVar2.b;
        int i7 = (int) ((((i3 - i4) / (i5 - i4)) * (i6 - r14)) + tooVar.b);
        if (i4 > i5) {
            tooVarArr[i2][1] = new too(-536870913, i7);
            tooVarArr[i][0] = new too(536870913, i7);
        } else {
            tooVarArr[i2][1] = new too(536870913, i7);
            tooVarArr[i][0] = new too(-536870913, i7);
        }
    }

    private final void i() {
        too[][] tooVarArr = this.g;
        if (tooVarArr == null) {
            tooVarArr = (too[][]) Array.newInstance((Class<?>) too.class, 6, 2);
            this.g = tooVarArr;
        }
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            too[] tooVarArr2 = this.a;
            too[] tooVarArr3 = this.f;
            boolean z2 = !tooVarArr2[i2].equals(tooVarArr3[i2]);
            if (z2 != z) {
                if (i2 > 0 && i < 5) {
                    h(tooVarArr3[i2 - 1], tooVarArr3[i2], i, tooVarArr);
                    i++;
                }
                z = z2;
            }
            if (i2 > 0) {
                tooVarArr[i - 1][1] = tooVarArr2[i2];
            }
            tooVarArr[i][0] = tooVarArr2[i2];
            i++;
        }
        if (i < 6) {
            too[] tooVarArr4 = this.f;
            h(tooVarArr4[3], tooVarArr4[0], i, tooVarArr);
        }
        tooVarArr[5][1] = this.a[0];
    }

    @Override // defpackage.tpl
    public final int a() {
        return this.e ? 6 : 4;
    }

    public final too b(int i) {
        return this.f[i];
    }

    @Override // defpackage.tpl
    public final too c(int i) {
        return this.a[i];
    }

    @Override // defpackage.tpl
    public final tpk d() {
        return this.c;
    }

    @Override // defpackage.tpl
    public final void e(int i, too[] tooVarArr) {
        too[][] tooVarArr2 = this.g;
        if (!this.e || tooVarArr2 == null) {
            tooVarArr[0] = c(i);
            tooVarArr[1] = c((i + 1) % 4);
        } else {
            tooVarArr[0] = tooVarArr2[i][0];
            tooVarArr[1] = tooVarArr2[i][1];
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tpj) {
            return Arrays.equals(this.f, ((tpj) obj).f);
        }
        return false;
    }

    public final void f() {
        for (int i = 0; i < 4; i++) {
            this.f[i].w(this.a[i]);
        }
        toe toeVar = this.b;
        too[] tooVarArr = this.f;
        toeVar.a = tooVarArr;
        toeVar.b.i(tooVarArr);
        tpk tpkVar = this.c;
        tpkVar.b(this.d);
        boolean z = tpkVar.e;
        this.e = z;
        if (z) {
            i();
        }
    }

    @Override // defpackage.tpl
    public final boolean g(too tooVar) {
        too tooVar2;
        too[][] tooVarArr = this.g;
        if (!this.e || tooVarArr == null) {
            return this.b.f(tooVar);
        }
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            too[] tooVarArr2 = tooVarArr[i2];
            too tooVar3 = tooVarArr2[0];
            if (tooVar3 == null || (tooVar2 = tooVarArr2[1]) == null) {
                return false;
            }
            if (tss.k(tooVar3, tooVar2, tooVar)) {
                i++;
            }
        }
        return i == 1;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    public final String toString() {
        too[] tooVarArr = this.f;
        return "[" + String.valueOf(tooVarArr[0]) + "," + String.valueOf(tooVarArr[1]) + "," + String.valueOf(tooVarArr[2]) + "," + String.valueOf(tooVarArr[3]) + "]";
    }
}
