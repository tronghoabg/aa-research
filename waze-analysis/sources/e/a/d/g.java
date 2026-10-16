package e.a.d;

import j$.util.Objects;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends e.a.bq {

    /* renamed from: a, reason: collision with root package name */
    final e.a.bi f46985a;

    /* renamed from: b, reason: collision with root package name */
    final e.a.az f46986b;

    /* renamed from: c, reason: collision with root package name */
    final v f46987c;

    /* renamed from: d, reason: collision with root package name */
    final w f46988d;

    /* renamed from: e, reason: collision with root package name */
    List f46989e;

    /* renamed from: f, reason: collision with root package name */
    eh f46990f;

    /* renamed from: g, reason: collision with root package name */
    boolean f46991g;

    /* renamed from: h, reason: collision with root package name */
    boolean f46992h;

    /* renamed from: i, reason: collision with root package name */
    e.a.ek f46993i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ fp f46994j;

    g(fp fpVar, e.a.bi biVar) {
        Objects.requireNonNull(fpVar);
        this.f46994j = fpVar;
        this.f46989e = biVar.d();
        this.f46985a = biVar;
        e.a.az azVarC = e.a.az.c("Subchannel", fpVar.b());
        this.f46986b = azVarC;
        w wVar = new w(azVarC, fpVar.v.a(), "Subchannel for ".concat(biVar.d().toString()));
        this.f46988d = wVar;
        this.f46987c = new v(wVar, fpVar.v);
    }

    @Override // e.a.bq
    public final Object a() {
        com.google.d.b.an.v(this.f46991g, "Subchannel is not started");
        return this.f46990f;
    }

    @Override // e.a.bq
    public final void b() {
        this.f46994j.f46951d.d();
        com.google.d.b.an.v(this.f46991g, "not started");
        if (this.f46992h) {
            return;
        }
        this.f46990f.h();
    }

    @Override // e.a.bq
    public final void c() {
        e.a.ek ekVar;
        fp fpVar = this.f46994j;
        e.a.el elVar = fpVar.f46951d;
        elVar.d();
        if (this.f46990f == null) {
            this.f46992h = true;
            return;
        }
        if (!this.f46992h) {
            this.f46992h = true;
        } else {
            if (!fpVar.N || (ekVar = this.f46993i) == null) {
                return;
            }
            ekVar.a();
            this.f46993i = null;
        }
        if (fpVar.N) {
            this.f46990f.F(fp.f46945b);
        } else {
            this.f46993i = elVar.a(new em(new fn(this)), 5L, TimeUnit.SECONDS, fpVar.p.c());
        }
    }

    @Override // e.a.bq
    public final void d(e.a.bs bsVar) {
        fp fpVar = this.f46994j;
        e.a.el elVar = fpVar.f46951d;
        elVar.d();
        com.google.d.b.an.v(!this.f46991g, "already started");
        com.google.d.b.an.v(!this.f46992h, "already shutdown");
        com.google.d.b.an.v(!fpVar.N, "Channel is being terminated");
        this.f46991g = true;
        eh ehVar = new eh(this.f46985a, fpVar.b(), fpVar.p, fpVar.p.c(), fpVar.y, elVar, new ea(this, bsVar), fpVar.U, fpVar.Q.a(), this.f46988d, this.f46986b, this.f46987c, fpVar.C, fpVar.f46954k, fpVar.F.f46916b.ag);
        w wVar = fpVar.S;
        e.a.ar arVar = new e.a.ar();
        arVar.b("Child Subchannel started");
        arVar.c(e.a.as.f46280b);
        arVar.e(fpVar.v.a());
        arVar.d(ehVar);
        wVar.c(arVar.a());
        this.f46990f = ehVar;
        fpVar.U.e(ehVar);
        fpVar.H.add(ehVar);
    }

    @Override // e.a.bq
    public final void e(List list) {
        this.f46994j.f46951d.d();
        this.f46989e = list;
        this.f46990f.G(list);
    }

    public final String toString() {
        return this.f46986b.toString();
    }
}
