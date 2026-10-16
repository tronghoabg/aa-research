package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ed implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f46858a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46859b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ef f46860c;

    ed(ef efVar, cf cfVar, e.a.ee eeVar) {
        this.f46858a = cfVar;
        this.f46859b = eeVar;
        Objects.requireNonNull(efVar);
        this.f46860c = efVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef efVar = this.f46860c;
        eh ehVar = efVar.f46864c;
        if (ehVar.w.a() == e.a.w.f47855e) {
            return;
        }
        as asVar = efVar.f46862a;
        if (ehVar.v == asVar) {
            ehVar.v = null;
            ehVar.m.d();
            eh.A(ehVar, e.a.w.f47854d);
            ehVar.z.c(ehVar.A, ef.g(ehVar.m.a()), ef.f(ehVar.m.a(), e.a.ai.f46254b), this.f46858a.a(), ef.e((e.a.ds) ehVar.m.a().c(db.f46777a)));
            return;
        }
        if (ehVar.u == asVar) {
            ehVar.z.a(ehVar.A, ef.g(ehVar.m.a()), ef.f(ehVar.m.a(), e.a.ai.f46254b));
            com.google.d.b.an.y(ehVar.w.a() == e.a.w.f47851a, "Expected state is CONNECTING, actual state is %s", ehVar.w.a());
            ehVar.m.c();
            if (ehVar.m.g()) {
                eh.E(ehVar);
                return;
            }
            ehVar.u = null;
            ehVar.m.d();
            eh.D(ehVar, this.f46859b);
        }
    }
}
