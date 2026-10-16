package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class lln extends llc {
    private final afdr a;
    private final eqj o;
    private final String p;
    private final eqj q;
    private final List r;

    public lln(Context context, ept eptVar, mon monVar, int i, int i2, afdr afdrVar, int i3, afdr afdrVar2) {
        String string;
        super(context, eptVar, monVar, i, i, i2, afdrVar2, afdrVar, "Queue", i3, null, null, null, null, 261120);
        this.a = afdrVar2;
        k();
        eqj eqjVarB = eqy.b(this.g, new lle(12));
        this.o = eqjVarB;
        lod lodVar = (lod) eqjVarB.e();
        if (lodVar != null) {
            lmb lmbVar = lodVar.d;
            string = ((CharSequence) new ntn((CharSequence) lmbVar.T(new llv(lmbVar, 6), "get queue title")).i("")).toString();
        } else {
            string = null;
        }
        this.p = string;
        this.q = tby.t(tby.C(eqjVarB, new llf(this, 6)));
        this.r = woy.bg(lky.b);
    }

    @Override // defpackage.llc
    public final eqj a() {
        return this.q;
    }

    @Override // defpackage.llc
    public final List c() {
        return this.r;
    }

    @Override // defpackage.llc
    public final void d(llu lluVar) {
        lluVar.getClass();
        long j = lluVar.h().n().getLong("QUEUE_ID");
        lkc lkcVarE = super.e();
        if (lkcVarE != null) {
            lpa lpaVar = (lpa) lkcVarE;
            ((ype) lpa.a.l().ai(4140)).R("skipToQueueItem: component=%s context=%s id=%d", lpaVar.j(), lpaVar.k(), Long.valueOf(j));
            lmb.S(new lma(lpaVar.c, j, 0), "skipToQueueItem");
            lpaVar.l(yzy.fc, null);
            lll.a.a().a(this.d.a);
            super.h();
        } else {
            ((ynz) llc.b.g().ai(3992)).x("Failed to skip to queue item with id %d", j);
        }
        this.a.invoke();
    }

    @Override // defpackage.llc
    public final String f() {
        return this.p;
    }

    @Override // defpackage.llc
    public final boolean l() {
        return false;
    }
}
