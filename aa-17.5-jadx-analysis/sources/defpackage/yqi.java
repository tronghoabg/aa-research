package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
final class yqi extends yqk {
    public final int[] a;
    public final int b;
    private final ypt c;
    private final ypt d;

    public yqi(ypt yptVar, ypt yptVar2) {
        int iH;
        this.c = yptVar;
        this.d = yptVar2;
        int iB = yptVar2.b();
        if (iB > 28) {
            throw new IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[iB];
        this.a = iArr;
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            yos yosVarE = e(i);
            long j2 = yosVarE.d | j;
            if (j2 != j || (iH = h(yosVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = yosVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(yos yosVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (yosVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.yqk
    public final int a() {
        return this.b;
    }

    @Override // defpackage.yqk
    public final Object b(yos yosVar) {
        yrm.h(!yosVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(yosVar, iArr, this.b);
        if (iH >= 0) {
            return yosVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.yqk
    public final Set c() {
        return new yqg(this);
    }

    @Override // defpackage.yqk
    public final void d(yqa yqaVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            yos yosVarE = e(i2 & 31);
            if (yosVarE.b) {
                yqaVar.b(yosVarE, new yqh(this, yosVarE, i2), obj);
            } else {
                yqaVar.a(yosVarE, yosVarE.c(f(i2)), obj);
            }
        }
    }

    public final yos e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
