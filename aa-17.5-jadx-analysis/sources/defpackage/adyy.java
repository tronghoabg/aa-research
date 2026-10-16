package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class adyy implements adzk {
    public final adjj a;
    private final Executor b;
    private final Executor c;
    private final adzj d;
    private adzk e;

    public adyy(Executor executor, Executor executor2, adzj adzjVar, adjj adjjVar) {
        this.b = executor;
        this.c = executor2;
        this.d = adzjVar;
        this.a = adjjVar;
    }

    @Override // defpackage.adzk
    public final void a(adnq adnqVar) {
        int i = aeeb.a;
        if (!adnqVar.g()) {
            Throwable adksVar = adnqVar.r;
            if (adksVar == null) {
                adnq adnqVarE = adnq.c.e("RPC cancelled");
                adlx adlxVar = adkr.a;
                adksVar = new adks(adnqVarE);
            }
            this.c.execute(new aiwa(this.a, adksVar, 1));
        }
        this.b.execute(new adyu(this, adnqVar));
    }

    @Override // defpackage.adzk
    public final void b() {
        int i = aeeb.a;
        this.b.execute(new adyv(this));
    }

    public final adzk c() {
        adzk adzkVar = this.e;
        if (adzkVar != null) {
            return adzkVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.adzy
    public final void d(adzx adzxVar) {
        int i = aeeb.a;
        this.b.execute(new adyw(this, adzxVar));
    }

    @Override // defpackage.adzy
    public final void e() {
        int i = aeeb.a;
        this.b.execute(new adyx(this));
    }

    public final void f(Throwable th) {
        this.d.e(adnq.d.e("Application error processing RPC").d(th), new admc());
    }

    final void g(adzk adzkVar) {
        adzkVar.getClass();
        woy.aa(this.e == null, "Listener already set");
        this.e = adzkVar;
    }
}
