package e.a.d;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class c extends f implements af, gl {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46711a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final kc f46712b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f46713c;

    /* renamed from: d, reason: collision with root package name */
    private e.a.cm f46714d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f46715e;

    /* renamed from: f, reason: collision with root package name */
    private final gm f46716f;

    protected c(kh khVar, jt jtVar, kc kcVar, e.a.cm cmVar, e.a.h hVar) {
        com.google.d.b.an.C(cmVar, "headers");
        com.google.d.b.an.C(kcVar, "transportTracer");
        this.f46712b = kcVar;
        this.f46713c = dh.h(hVar);
        this.f46716f = new gm(this, khVar, jtVar);
        this.f46714d = cmVar;
    }

    @Override // e.a.d.af
    public final void b(dn dnVar) {
        dnVar.b("remote_addr", a().c(e.a.ao.f46262a));
    }

    @Override // e.a.d.af
    public final void c(e.a.ee eeVar) {
        com.google.d.b.an.m(!eeVar.l(), "Should not cancel with OK status");
        this.f46715e = true;
        p().a(eeVar);
    }

    @Override // e.a.d.af
    public final void e() {
        if (v().q()) {
            return;
        }
        v().n = true;
        w().c();
    }

    @Override // e.a.d.af
    public final void i(e.a.ad adVar) {
        e.a.cm cmVar = this.f46714d;
        e.a.ch chVar = dh.f46791a;
        cmVar.g(chVar);
        this.f46714d.i(chVar, Long.valueOf(adVar.b(TimeUnit.NANOSECONDS)));
    }

    @Override // e.a.d.af
    public final void j(e.a.ag agVar) {
        e.s(v(), agVar);
    }

    @Override // e.a.d.af
    public final void k(int i2) {
        v().h(i2);
    }

    @Override // e.a.d.af
    public final void l(int i2) {
        this.f46716f.e(i2);
    }

    @Override // e.a.d.af
    public final void m(ah ahVar) {
        v().n(ahVar);
        p().c(this.f46714d);
        this.f46714d = null;
    }

    @Override // e.a.d.f, e.a.d.ju
    public final boolean o() {
        return q().x() && !this.f46715e;
    }

    protected abstract a p();

    @Override // e.a.d.f
    protected /* bridge */ /* synthetic */ e q() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kc r() {
        return this.f46712b;
    }

    @Override // e.a.d.gl
    public final void t(kg kgVar, boolean z, boolean z2, int i2) {
        boolean z3 = true;
        if (kgVar == null && !z) {
            z3 = false;
        }
        com.google.d.b.an.m(z3, "null frame before EOS");
        p().b(kgVar, z, z2, i2);
    }

    public final boolean u() {
        return this.f46713c;
    }

    protected abstract e v();

    @Override // e.a.d.f
    protected final gm w() {
        return this.f46716f;
    }
}
