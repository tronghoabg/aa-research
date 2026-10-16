package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class eoo {
    eom[] a;
    int b;
    eom[][] c;
    int[] d;
    final /* synthetic */ eom[] e;
    final /* synthetic */ eop f;

    public eoo(eop eopVar, eom[] eomVarArr) {
        this.f = eopVar;
        this.e = eomVarArr;
        this.a = new eom[eomVarArr.length];
        this.b = r1.length - 1;
        int iA = eopVar.a() + 1;
        eom[][] eomVarArr2 = new eom[iA][];
        int[] iArr = new int[iA];
        for (eom eomVar : eomVarArr) {
            int i = eomVar.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < iA; i2++) {
            eomVarArr2[i2] = new eom[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (eom eomVar2 : eomVarArr) {
            int i3 = eomVar2.a.a;
            eom[] eomVarArr3 = eomVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            eomVarArr3[i4] = eomVar2;
        }
        this.c = eomVarArr2;
        this.d = new int[this.f.a() + 1];
    }

    final void a(int i) {
        int[] iArr = this.d;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (eom eomVar : this.c[i]) {
            a(eomVar.a.b);
            eom[] eomVarArr = this.a;
            int i2 = this.b;
            this.b = i2 - 1;
            eomVarArr[i2] = eomVar;
        }
        this.d[i] = 2;
    }
}
