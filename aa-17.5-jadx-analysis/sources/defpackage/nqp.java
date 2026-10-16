package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class nqp extends kmh {
    public final bwq a = new ParcelableSnapshotMutableState(null, bxp.c);

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1815242924);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            afeg afegVar = (afeg) this.a.a();
            if (afegVar == null) {
                buxVarC.v(31315973);
            } else {
                buxVarC.v(-691726468);
                afegVar.invoke(buxVarC, 0);
            }
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(this, i, 0);
        }
    }
}
