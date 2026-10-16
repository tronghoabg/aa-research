package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class llh extends om {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ qn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llh(ComponentName componentName, qn qnVar) {
        super(true);
        this.a = componentName;
        this.e = qnVar;
    }

    @Override // defpackage.om
    public final void b() {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gL);
        rrbVarH.p(this.a);
        ohsVarJ.F(rrbVarH.l());
        ((qx) this.e.a(qx.class)).c();
    }
}
