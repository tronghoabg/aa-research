package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* loaded from: classes2.dex */
public final class hdx {
    public static final void a(hdy hdyVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1765059803);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hdyVar) : buxVarC.E(hdyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gvq.g(hdyVar, cfyVar, buxVarC, i2 & 126, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hdyVar, cfyVar, i, 15);
        }
    }

    public static final cfy b(cfy cfyVar, hgc hgcVar, hga hgaVar, bux buxVar, int i) {
        if (hgcVar != hgc.a) {
            buxVar.v(1119577643);
            ((bvv) buxVar).Y(false);
            return cfyVar;
        }
        buxVar.v(1119496299);
        int i2 = i >> 3;
        float fEA = ((dlg) buxVar.f(dbc.d)).eA(75.0f);
        int i3 = (i & 14) | (i2 & 112);
        int i4 = 1;
        boolean z = ((((i3 & 112) ^ 48) > 32 && buxVar.E(hgaVar)) || (i3 & 48) == 32) | buxVar.z(fEA);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (z || objS == buw.a) {
            objS = new msy(hgaVar, fEA, i4);
            bvvVar.ad(objS);
        }
        cfy cfyVarJ = fxi.j(cfyVar, (afec) objS);
        Object objS2 = bvvVar.S();
        Object obj = buw.a;
        if (objS2 == obj) {
            objS2 = new ParcelableSnapshotMutableFloatState(Float.NaN);
            bvvVar.ad(objS2);
        }
        byb bybVar = (byb) objS2;
        Object objS3 = bvvVar.S();
        if (objS3 == obj) {
            objS3 = new ParcelableSnapshotMutableFloatState(Float.NaN);
            bvvVar.ad(objS3);
        }
        byb bybVar2 = (byb) objS3;
        if ((((i2 & 112) ^ 48) <= 32 || !buxVar.E(hgaVar)) && (i2 & 48) != 32) {
            i4 = 0;
        }
        Object objS4 = bvvVar.S();
        if (i4 != 0 || objS4 == obj) {
            hgf hgfVar = new hgf((Object) hgaVar, (Object) bybVar2, (Object) bybVar, 2, (byte[]) null);
            bvvVar.ad(hgfVar);
            objS4 = hgfVar;
        }
        cfy cfyVarG = fxi.g(cfyVarJ, (afec) objS4);
        bvvVar.Y(false);
        return cfyVarG;
    }
}
