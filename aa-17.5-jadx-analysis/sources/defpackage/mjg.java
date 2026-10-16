package defpackage;

import android.content.Context;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class mjg {
    static final Duration a = Duration.ofSeconds(3);
    public static final /* synthetic */ int f = 0;
    public final eqm b;
    public final eqj c;
    public final eqj d;
    public final Context e;
    private final eqm g;

    public mjg() {
        eqm eqmVar = new eqm();
        this.b = eqmVar;
        eqm eqmVar2 = new eqm(new mis(0, null, null));
        this.g = eqmVar2;
        this.e = mki.a.c;
        eqj eqjVarD = tby.d(eqmVar2, tby.u(tby.w(eqmVar, new mii(3)), false), new msw(this, 1));
        kuu kuuVar = new kuu(19);
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(eqjVarD, new nns(new tbu(eqlVar, affqVar, kuuVar), 7));
        this.d = eqlVar;
        this.c = tby.A(tby.n(eqmVar), a, new kuu(20));
    }

    public static void a(eqm eqmVar, Object obj) {
        if (a.Z()) {
            eqmVar.m(obj);
        } else {
            eqmVar.j(obj);
        }
    }

    public final void b(mis misVar) {
        a(this.g, misVar);
    }
}
