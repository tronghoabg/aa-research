package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.SystemClock;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes2.dex */
final class lnj extends llu {
    final /* synthetic */ lnl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnj(lnl lnlVar) {
        super((byte[]) null);
        this.a = lnlVar;
    }

    @Override // defpackage.llu
    public final void a() {
        yph yphVar = lnl.a;
        zjc zjcVar = zjc.a;
        lnl lnlVar = this.a;
        ComponentName componentName = lnlVar.l;
        ((ype) yphVar.l().ai((char) 4064)).y("onConnected component=%s", new zjd(zjcVar, componentName));
        Handler handler = lnlVar.m;
        handler.removeCallbacksAndMessages(null);
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.ft);
        rrbVarH.p(componentName);
        if (lnlVar.o != -1) {
            oit.a();
            rrbVarH.u(SystemClock.elapsedRealtime() - lnlVar.o);
        }
        ebf.j().F(rrbVarH.l());
        lnlVar.o = -1L;
        if (lnlVar.p > 0) {
            handler.postDelayed(new kyl(lnlVar, 18), lnl.h.toMillis());
        }
        llu lluVar = lnlVar.q;
        lluVar.getClass();
        lnm.a();
        lmb lmbVar = new lmb(lnlVar.k, lluVar.L());
        lnlVar.n = lmbVar;
        lnlVar.n.W(lnlVar.r);
        lnlVar.m(new lni(lok.b, Optional.of(lluVar), Optional.of(lmbVar)));
    }

    @Override // defpackage.llu
    public final void b() {
        yop yopVarG = lnl.a.g();
        zjc zjcVar = zjc.a;
        lnl lnlVar = this.a;
        ComponentName componentName = lnlVar.l;
        ((ype) ((ype) yopVarG).ai((char) 4065)).y("onConnectionFailed component=%s", new zjd(zjcVar, componentName));
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fu);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        lnlVar.m(lni.a(lok.c));
        lnlVar.s(Duration.ZERO);
    }

    @Override // defpackage.llu
    public final void c() {
        yop yopVarH = lnl.a.h();
        zjc zjcVar = zjc.a;
        lnl lnlVar = this.a;
        ComponentName componentName = lnlVar.l;
        ((ype) ((ype) yopVarH).ai((char) 4066)).y("onConnectionSuspended component=%s", new zjd(zjcVar, componentName));
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fv);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        if (lnlVar.t()) {
            return;
        }
        lnlVar.m(lni.a(lok.d));
        lnlVar.s(lnl.i);
    }
}
