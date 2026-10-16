package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes2.dex */
public final class nra extends nqq {
    private final aezr c = woy.dG(new nqy(1));

    public nra() {
        yph.c("GH.ImmersiveToolbarFrag");
    }

    @Override // defpackage.nqq
    public final void d(afm afmVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        afmVar.getClass();
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(372059391);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(afmVar) : buxVarC.E(afmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(this) ? 128 : 256;
        }
        int i5 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            byte[] bArr = null;
            aft aftVar = new aft(1.0f, 200.0f, null);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new nqz(i5);
                bvvVar.ad(objS);
            }
            acp acpVarE = acl.e(aftVar, (afec) objS);
            aft aftVar2 = new aft(1.0f, 200.0f, null);
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new nqz(i4);
                bvvVar.ad(objS2);
            }
            ca.L(afmVar, null, acpVarE, acl.j(aftVar2, (afec) objS2), null, bxc.i(-614374441, true, new nnw(cfyVar, this, 3, bArr), buxVarC), buxVarC, (i2 & 14) | 200064, 18);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(this, afmVar, cfyVar, i, 10, (char[]) null);
        }
    }

    public final sab h() {
        return (sab) this.c.a();
    }

    public final void i(yzy yzyVar) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.IMMERSIVE_MODE, yzyVar);
        ComponentName componentNameB = b();
        if (componentNameB != null) {
            rrbVarH.p(componentNameB);
        }
        ebf.j().F(rrbVarH.l());
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        ols.b(view, new mix(this, 7));
    }
}
