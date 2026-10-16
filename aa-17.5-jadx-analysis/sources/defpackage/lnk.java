package defpackage;

import android.content.ComponentName;
import j$.time.Duration;

/* loaded from: classes2.dex */
final class lnk extends llu {
    final /* synthetic */ lnl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnk(lnl lnlVar) {
        super((int[]) null);
        this.a = lnlVar;
    }

    @Override // defpackage.llu
    public final void w() {
        yop yopVarH = lnl.a.h();
        zjc zjcVar = zjc.a;
        lnl lnlVar = this.a;
        ComponentName componentName = lnlVar.l;
        ((ype) ((ype) yopVarH).ai((char) 4068)).y("onSessionDestroyed component=%s", new zjd(zjcVar, componentName));
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fw);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        if (lnlVar.t()) {
            return;
        }
        lnlVar.r();
        lnlVar.m(lni.a(lok.d));
        lnlVar.s(Duration.ZERO);
    }
}
