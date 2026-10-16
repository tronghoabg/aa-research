package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class dqs extends dqn {
    public dqn[] aL = new dqn[4];
    public int aM = 0;

    public final void af(dqn dqnVar) {
        if (dqnVar == this || dqnVar == null) {
            return;
        }
        int i = this.aM + 1;
        dqn[] dqnVarArr = this.aL;
        int length = dqnVarArr.length;
        if (i > length) {
            dqnVarArr = (dqn[]) Arrays.copyOf(dqnVarArr, length + length);
            this.aL = dqnVarArr;
        }
        int i2 = this.aM;
        dqnVarArr[i2] = dqnVar;
        this.aM = i2 + 1;
    }

    public final void ag(ArrayList arrayList, int i, dri driVar) {
        for (int i2 = 0; i2 < this.aM; i2++) {
            driVar.d(this.aL[i2]);
        }
        for (int i3 = 0; i3 < this.aM; i3++) {
            cdj.e(this.aL[i3], i, arrayList, driVar);
        }
    }

    public void ah() {
    }
}
