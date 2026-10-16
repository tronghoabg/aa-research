package defpackage;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import j$.time.Instant;
import j$.util.Map;
import java.util.List;

/* loaded from: classes2.dex */
public final class lkg extends llc {
    public final eqj a;
    private final afdr o;
    private final afeg p;
    private final int q;
    private final eqj r;
    private final List s;
    private final List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkg(Context context, ept eptVar, String str, mon monVar, int i, int i2, int i3, IconCompat iconCompat, String str2, htm htmVar, htm htmVar2, afdr afdrVar, afdr afdrVar2, afeg afegVar, int i4, afdr afdrVar3) {
        super(context, eptVar, monVar, i, i2, i3, afdrVar, afdrVar2, str == null ? "Root" : str, i4, iconCompat, str2, htmVar, htmVar2, 245760);
        eptVar.getClass();
        this.o = afdrVar;
        this.p = afegVar;
        this.q = i4;
        this.a = tby.C(tby.w(this.h, new lfn(3)), new jzi(this, str, 10));
        this.r = eqy.a(new eql(this, str, monVar));
        afbt afbtVar = new afbt(10);
        afbtVar.addAll(this.f);
        if (afdrVar3 != null) {
            afbtVar.add(lky.c);
        }
        this.s = afbtVar.f();
        this.t = woy.bg(new ogz(lky.c, (afdr) new ah(afdrVar3, context, monVar, 18, (char[]) null)));
    }

    @Override // defpackage.llc
    public final eqj a() {
        return this.r;
    }

    @Override // defpackage.llc
    public final List b() {
        return this.t;
    }

    @Override // defpackage.llc
    public final List c() {
        return this.s;
    }

    @Override // defpackage.llc
    public final void d(llu lluVar) {
        lluVar.getClass();
        if (!lluVar.k()) {
            this.p.invoke(lluVar, this.n);
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.iS);
            rrbVarH.p(this.d.a);
            rrbVarH.t(this.q);
            ohsVarJ.F(rrbVarH.l());
            return;
        }
        mon monVar = this.d;
        eqm eqmVar = (eqm) Map.EL.computeIfAbsent(lsc.f().f, monVar.a, new lka(16));
        oit.a();
        eqmVar.m(Instant.now());
        m(lluVar);
        this.o.invoke();
    }
}
