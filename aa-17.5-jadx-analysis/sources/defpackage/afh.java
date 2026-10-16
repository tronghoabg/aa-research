package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class afh {
    public final byw a = new byw(new afd[16]);
    public long b;
    public final bwq c;
    private final bwq d;

    public afh() {
        bxp bxpVar = bxp.c;
        this.d = new ParcelableSnapshotMutableState(false, bxpVar);
        this.b = Long.MIN_VALUE;
        this.c = new ParcelableSnapshotMutableState(true, bxpVar);
    }

    public final void a(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-318043801);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            if (((Boolean) this.c.a()).booleanValue() || ((Boolean) this.d.a()).booleanValue()) {
                buxVarC.v(-144841960);
                boolean zE = buxVarC.E(this);
                Object objS2 = bvvVar.S();
                if (zE || objS2 == obj) {
                    objS2 = new afg(bwqVar, this, null);
                    bvvVar.ad(objS2);
                }
                bvq.g(this, (afeg) objS2, buxVarC);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-143455237);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ati(this, i, i4);
        }
    }

    public final void b(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }
}
