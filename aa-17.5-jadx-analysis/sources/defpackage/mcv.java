package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class mcv extends mou {
    public boolean a;

    public mcv() {
        super("ParkedApp");
        lix.b().a().fE(lbh.d(), new med(new mcm(this, 6), 1));
    }

    @Override // defpackage.mou
    protected final void a(Intent intent) {
        mda.a.a().b(nsn.a);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PARKED_APP, yzy.LR);
        rrbVarH.p(intent.getComponent());
        ohsVarJ.F(rrbVarH.l());
    }

    @Override // defpackage.mou
    protected final boolean b(Intent intent) {
        mqc mqcVarA;
        mqb mqbVarD = mpl.d(intent);
        if (mqbVarD == null || this.a || (mqcVarA = lem.a().a(kio.b().e(), mqbVarD)) == null) {
            return false;
        }
        return mqcVarA.c;
    }
}
