package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class du implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46828a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eh f46829b;

    du(eh ehVar, e.a.ee eeVar) {
        this.f46828a = eeVar;
        Objects.requireNonNull(ehVar);
        this.f46829b = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh ehVar = this.f46829b;
        e.a.w wVarA = ehVar.w.a();
        e.a.w wVar = e.a.w.f47855e;
        if (wVarA == wVar) {
            return;
        }
        e.a.ee eeVar = this.f46828a;
        ehVar.x = eeVar;
        ge geVar = ehVar.v;
        as asVar = ehVar.u;
        ehVar.v = null;
        ehVar.u = null;
        eh.A(ehVar, wVar);
        ehVar.m.d();
        if (ehVar.s.isEmpty()) {
            ehVar.f46877l.execute(new dv(ehVar));
        }
        eh.z(ehVar);
        if (ehVar.q != null) {
            ehVar.q.a();
            ehVar.r.t(eeVar);
            ehVar.q = null;
            ehVar.r = null;
        }
        if (geVar != null) {
            geVar.t(eeVar);
        }
        if (asVar != null) {
            asVar.t(eeVar);
        }
    }
}
