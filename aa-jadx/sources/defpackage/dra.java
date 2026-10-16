package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class dra extends defpackage.dqv {
    public defpackage.dqv[] aL = new defpackage.dqv[4];
    public int aM = 0;

    public final void af(defpackage.dqv dqvVar) {
        if (dqvVar == this || dqvVar == null) {
            return;
        }
        int i = this.aM + 1;
        defpackage.dqv[] dqvVarArr = this.aL;
        int length = dqvVarArr.length;
        if (i > length) {
            dqvVarArr = (defpackage.dqv[]) java.util.Arrays.copyOf(dqvVarArr, length + length);
            this.aL = dqvVarArr;
        }
        int i2 = this.aM;
        dqvVarArr[i2] = dqvVar;
        this.aM = i2 + 1;
    }

    public final void ag(java.util.ArrayList arrayList, int i, defpackage.drq drqVar) {
        for (int i2 = 0; i2 < this.aM; i2++) {
            drqVar.d(this.aL[i2]);
        }
        for (int i3 = 0; i3 < this.aM; i3++) {
            defpackage.xi.e(this.aL[i3], i, arrayList, drqVar);
        }
    }

    public void ah() {
    }
}
