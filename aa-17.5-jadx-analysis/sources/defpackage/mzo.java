package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mzo extends mzn {
    public final eqj d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj i;
    private final eqj j;
    private final eqj k;

    public mzo(eqj eqjVar, eqj eqjVar2) {
        super(eqjVar, eqjVar2);
        eqj eqjVarA = lgx.b().a(mpz.d);
        eqjVarA.getClass();
        this.d = eqjVarA;
        eqj eqjVarO = tby.o(eqjVarA);
        this.j = eqjVarO;
        eqj eqjVarW = tby.w(eqjVarA, new mzd(4));
        this.k = eqjVarW;
        this.e = eqy.b(eqjVarW, new mzd(5));
        this.f = eqy.b(eqjVarW, new mzd(6));
        Integer numValueOf = Integer.valueOf(R.string.media_player_invalid_session_subtitle);
        Integer numValueOf2 = Integer.valueOf(R.string.media_player_no_app);
        eqjVarO.getClass();
        this.g = eqy.b(eqjVarO, new erl(numValueOf, numValueOf2, 17));
        this.i = mjv.n(mjv.p(eqjVarA));
    }

    public static final void c(ComponentName componentName) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DASHBOARD, yzy.w);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
        Intent component = new Intent().setComponent(componentName);
        component.getClass();
        mlq.g(component);
    }

    @Override // defpackage.mzn
    public final eqj a() {
        return this.e;
    }
}
