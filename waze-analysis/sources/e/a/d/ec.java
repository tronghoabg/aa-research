package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ec implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ef f46857a;

    ec(ef efVar) {
        Objects.requireNonNull(efVar);
        this.f46857a = efVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef efVar = this.f46857a;
        eh ehVar = efVar.f46864c;
        ehVar.B = null;
        if (ehVar.x != null) {
            com.google.d.b.an.v(ehVar.v == null, "Unexpected non-null activeTransport");
            efVar.f46862a.t(ehVar.x);
            return;
        }
        as asVar = efVar.f46862a;
        if (ehVar.u == asVar) {
            ehVar.v = asVar;
            ehVar.u = null;
            ehVar.y = ehVar.m.a();
            eh.A(ehVar, e.a.w.f47852b);
            ehVar.z.b(ehVar.A, ef.g(ehVar.m.a()), ef.f(ehVar.m.a(), e.a.ai.f46254b), ef.e((e.a.ds) ehVar.m.a().c(db.f46777a)));
        }
    }
}
