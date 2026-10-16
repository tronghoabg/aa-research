package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class mti implements afeh {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ Bundle c;

    public mti(float f, float f2, Bundle bundle) {
        this.a = f;
        this.b = f2;
        this.c = bundle;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        cfy cfyVarH;
        bux buxVar = (bux) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = iIntValue & 17;
        if (buxVar.I(i != 16, iIntValue & 1)) {
            ldy ldyVar = ldz.a;
            if (ldyVar.a().b()) {
                buxVar.v(-289308942);
                cfyVarH = asl.H(cfy.e, gjk.b.k);
                if (((Boolean) buxVar.f(mvy.a)).booleanValue()) {
                    cfyVarH = kfn.k(cfyVarH, null, buxVar, 1);
                }
                buxVar.o();
            } else {
                buxVar.v(-289159832);
                buxVar.o();
                cfyVarH = cfy.e;
            }
            Object objG = buxVar.g();
            Object obj4 = buw.a;
            if (objG == obj4) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                buxVar.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objG;
            buxVar.v(-1533342121);
            Object objG2 = buxVar.g();
            if (objG2 == obj4) {
                objG2 = new hko(bwqVar, 13);
                buxVar.x(objG2);
            }
            cfy cfyVarL = bxc.l(cfyVarH, (afec) objG2);
            ldyVar.a().b();
            buxVar.o();
            fww.L(cfyVarL, null, null, null, bxc.i(1758345962, true, new mth(this.a, this.b, this.c), buxVar), buxVar, 196608, 30);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
