package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Point;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class mzy extends erm implements lth {
    private final mzw a;
    private final eqm b;
    private final aitx c;
    private final eqj d;
    public final /* synthetic */ lth e;
    public final eqj f;
    public final eqj g;
    public final eqj i;
    public final eqj j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final eqj n;
    public final eqj o;
    public final eqj p;
    public final eqj q;
    private final eqj r;

    public mzy(mzw mzwVar, lth lthVar) {
        lthVar.getClass();
        this.e = lthVar;
        this.a = mzwVar;
        this.f = mzf.a(j(), ((ltn) lthVar).b);
        eqj eqjVarV = tby.v(tby.t(l()), new mzd(8));
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(eqjVarV, new med(new mzx(eqlVar, affqVar, 0), 11));
        this.g = eqlVar;
        this.b = new eqm();
        aitx aitxVarB = ahni.b(affa.v(new aiwh(null), mkm.a.e().i()));
        this.c = aitxVarB;
        eqj eqjVarA = a(aitxVarB, false);
        this.d = eqjVarA;
        this.i = tby.v(e(aitxVarB), new mzd(10));
        eqj eqjVarV2 = mzwVar != null ? tby.v(mzwVar.a(j(), k()), new mzd(11)) : null;
        this.r = eqjVarV2;
        this.j = eqjVarV2 != null ? eqy.c(eqjVarV2, new mzd(12)) : new eqm(null);
        this.k = eqjVarV2 != null ? eqy.c(eqjVarV2, new mzd(13)) : new eqm(null);
        eqj eqjVarO = mjv.o(f());
        this.l = eqjVarO;
        this.m = tby.D(mjv.n(f()), tby.o(j()));
        this.n = tby.G(eqy.c(eqjVarA, new mzd(14)), eqjVarO, new mqe(15));
        this.o = eqy.c(eqjVarA, new mzg(this, 16));
        this.p = tby.w(j(), new mzd(15));
        this.q = eqy.c(((ltn) lthVar).e, new mzd(16));
    }

    @Override // defpackage.lth
    public final eqj a(aitx aitxVar, boolean z) {
        return this.e.a(aitxVar, false);
    }

    @Override // defpackage.lth
    public final lkc b() {
        throw null;
    }

    @Override // defpackage.lth
    public final void c() {
        throw null;
    }

    @Override // defpackage.erm
    public final void d() {
        ahni.e(this.c, null);
    }

    @Override // defpackage.lth
    public final eqj e(aitx aitxVar) {
        return this.e.e(aitxVar);
    }

    public final eqj f() {
        return ((ltn) this.e).f;
    }

    public final eqj h() {
        return ((ltn) this.e).v;
    }

    public final eqj i() {
        return ((ltn) this.e).x;
    }

    public final eqj j() {
        return ((ltn) this.e).a;
    }

    public final eqj k() {
        return ((ltn) this.e).c;
    }

    public final eqj l() {
        return ((ltn) this.e).d;
    }

    public final eqj m() {
        return ((ltn) this.e).w;
    }

    public final eqj n() {
        return ((ltn) this.e).m;
    }

    public final eqj o() {
        return ((ltn) this.e).p;
    }

    public final eqj p() {
        return ((ltn) this.e).h;
    }

    public final eqj q() {
        return ((ltn) this.e).n;
    }

    public final eqj r() {
        return ((ltn) this.e).g;
    }

    public final eqj s() {
        return ((ltn) this.e).q;
    }

    public final void t(PrintWriter printWriter) {
        printWriter.println(afyh.a("\n         mediaApp: " + j().e() + " accentColor: " + f().e() + " image: " + ((ltn) this.e).i.e() + "\n         title: " + r().e() + " subtitle: " + p().e() + "\n         secondaryAction: " + n().e() + " tertiaryAction: " + q().e() + "\n         isBuffering: " + s().e() + " duration: " + h().e() + "\n         position: " + m().e() + " showPause: " + o().e() + "\n         playbackState: " + l().e() + "\n        "));
    }

    public final void u() {
        ComponentName componentName = (ComponentName) j().e();
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DASHBOARD, yzy.t);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        Intent intentC = lnm.c(componentName);
        intentC.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 32);
        mlq.g(intentC);
    }

    public final void v(int i, int i2) {
        this.b.m(new Point(i, i2));
    }

    public mzy() {
        this((lth) null, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mzy(lth lthVar, int i) {
        mzw mzwVarQ = (i & 1) != 0 ? mjv.q() : null;
        this(mzwVarQ, (i & 2) != 0 ? lto.e(yzz.DASHBOARD, null, null, mzwVarQ, 6) : lthVar);
    }
}
