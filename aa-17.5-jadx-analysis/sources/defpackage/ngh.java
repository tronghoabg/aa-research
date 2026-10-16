package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ngh extends kmh {
    private ngg a;

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2123096226);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            ngg nggVar = this.a;
            if (nggVar == null) {
                affa.d("railType");
                nggVar = null;
            }
            ngk.f(nggVar, ((nhn) tec.b(this, nhn.class)).a(), null, null, buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, 13);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Serializable serializable = requireArguments().getSerializable("rail_type");
        serializable.getClass();
        this.a = (ngg) serializable;
    }
}
