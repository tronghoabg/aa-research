package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class lki extends om {
    final /* synthetic */ qn a;
    final /* synthetic */ ComponentName e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lki(qn qnVar, ComponentName componentName) {
        super(true);
        this.a = qnVar;
        this.e = componentName;
    }

    @Override // defpackage.om
    public final void b() {
        Object objA = this.a.a(qx.class);
        objA.getClass();
        qx qxVar = (qx) objA;
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.jh);
        rrbVarH.p(this.e);
        rrbVarH.t(lnm.v(qxVar));
        ohsVarJ.F(rrbVarH.l());
        qxVar.c();
    }
}
