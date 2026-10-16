package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class llo extends llc {
    public final afdr a;
    public final afec o;
    public final eqm p;
    private final afdr q;
    private final afeg r;
    private final int s;
    private final String t;
    private final eqj u;
    private final eqj v;
    private final eqj w;

    public llo(Context context, ept eptVar, mon monVar, int i, int i2, afdr afdrVar, afdr afdrVar2, afeg afegVar, afec afecVar, int i3, afdr afdrVar3, String str, Bundle bundle) {
        super(context, eptVar, monVar, i, i, i2, afdrVar2, afdrVar3, "Search", i3, null, null, null, null, 261120);
        this.a = afdrVar;
        this.q = afdrVar2;
        this.r = afegVar;
        this.o = afecVar;
        this.s = i3;
        afco afcoVar = tby.a;
        this.p = new eqm(str);
        String string = context.getString(R.string.search_results_query_title, str);
        string.getClass();
        this.t = string;
        eqj eqjVarW = tby.w(this.h, new lle(13));
        this.u = eqjVarW;
        eqj eqjVarC = tby.C(eqjVarW, new jzi(this, bundle, 15, null));
        this.v = eqjVarC;
        this.w = tby.t(tby.w(eqjVarC, new llf(this, 7)));
    }

    @Override // defpackage.llc
    public final eqj a() {
        return this.w;
    }

    @Override // defpackage.llc
    public final void d(llu lluVar) {
        Bundle bundle;
        lluVar.getClass();
        if (lluVar.k()) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.iV);
            rrbVarH.p(this.d.a);
            rrbVarH.t(this.s);
            ohsVarJ.F(rrbVarH.l());
            m(lluVar);
            this.q.invoke();
            return;
        }
        afeg afegVar = this.r;
        lnu lnuVar = (lnu) this.u.e();
        if (lnuVar == null || (bundle = lnuVar.a()) == null) {
            bundle = new Bundle();
        }
        afegVar.invoke(lluVar, new htm(bundle));
        ohs ohsVarJ2 = ebf.j();
        rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.iS);
        rrbVarH2.p(this.d.a);
        rrbVarH2.t(this.s);
        ohsVarJ2.F(rrbVarH2.l());
    }

    @Override // defpackage.llc
    public final String f() {
        return this.t;
    }
}
