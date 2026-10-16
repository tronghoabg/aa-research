package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afo {
    public final defpackage.bzc a = new defpackage.bzc(new defpackage.afk[16]);
    public long b;
    public final defpackage.bwx c;
    private final defpackage.bwx d;

    public afo() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.b = Long.MIN_VALUE;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, bxvVar);
    }

    public final void a(defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-318043801);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != bveVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            if (((java.lang.Boolean) this.c.a()).booleanValue() || ((java.lang.Boolean) this.d.a()).booleanValue()) {
                bveVarC.v(-144841960);
                boolean zE = bveVarC.E(this);
                java.lang.Object objS2 = bwcVar.S();
                if (zE || objS2 == obj) {
                    objS2 = new defpackage.afn(bwxVar, this, null);
                    bwcVar.ad(objS2);
                }
                defpackage.bvx.g(this, (defpackage.affg) objS2, bveVarC);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-143455237);
                bwcVar.Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.atn(this, i, i4);
        }
    }

    public final void b(boolean z) {
        this.d.b(java.lang.Boolean.valueOf(z));
    }
}
