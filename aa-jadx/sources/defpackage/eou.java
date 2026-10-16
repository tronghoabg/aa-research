package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eou {
    defpackage.eos[] a;
    int b;
    defpackage.eos[][] c;
    int[] d;
    final /* synthetic */ defpackage.eos[] e;
    final /* synthetic */ defpackage.eov f;

    public eou(defpackage.eov eovVar, defpackage.eos[] eosVarArr) {
        this.f = eovVar;
        this.e = eosVarArr;
        defpackage.eos[] eosVarArr2 = new defpackage.eos[eosVarArr.length];
        this.a = eosVarArr2;
        this.b = eosVarArr2.length - 1;
        int iA = eovVar.a() + 1;
        defpackage.eos[][] eosVarArr3 = new defpackage.eos[iA][];
        int[] iArr = new int[iA];
        for (defpackage.eos eosVar : eosVarArr) {
            int i = eosVar.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < iA; i2++) {
            eosVarArr3[i2] = new defpackage.eos[iArr[i2]];
        }
        java.util.Arrays.fill(iArr, 0);
        for (defpackage.eos eosVar2 : eosVarArr) {
            int i3 = eosVar2.a.a;
            defpackage.eos[] eosVarArr4 = eosVarArr3[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            eosVarArr4[i4] = eosVar2;
        }
        this.c = eosVarArr3;
        this.d = new int[this.f.a() + 1];
    }

    final void a(int i) {
        int[] iArr = this.d;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (defpackage.eos eosVar : this.c[i]) {
            a(eosVar.a.b);
            defpackage.eos[] eosVarArr = this.a;
            int i2 = this.b;
            this.b = i2 - 1;
            eosVarArr[i2] = eosVar;
        }
        this.d[i] = 2;
    }
}
