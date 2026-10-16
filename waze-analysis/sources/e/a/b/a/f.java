package e.a.b.a;

import android.content.Context;
import e.a.d.dh;
import e.a.d.fr;
import e.a.d.gr;
import e.a.d.jr;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements fr {

    /* renamed from: a, reason: collision with root package name */
    Context f46375a;

    /* renamed from: b, reason: collision with root package name */
    gr f46376b;

    /* renamed from: h, reason: collision with root package name */
    com.waze.uid.f f46382h = com.waze.uid.f.j();

    /* renamed from: c, reason: collision with root package name */
    final gr f46377c = jr.c(dh.n);

    /* renamed from: d, reason: collision with root package name */
    e.a.b.k f46378d = e.a.b.j.b();

    /* renamed from: e, reason: collision with root package name */
    final e.a.b.f f46379e = e.a.b.f.f46471a;

    /* renamed from: f, reason: collision with root package name */
    final e.a.b.h f46380f = e.a.b.h.f46475a;

    /* renamed from: g, reason: collision with root package name */
    final com.waze.uid.activities.a f46381g = ah.f46314b;

    public final Context a() {
        return this.f46375a;
    }

    @Override // e.a.d.fr
    public final /* synthetic */ e.a.d.am b() {
        return new g(this);
    }

    public final void c(gr grVar) {
        com.google.d.b.an.C(grVar, "offloadExecutorPool");
        this.f46376b = grVar;
    }

    public final void d(e.a.b.k kVar) {
        this.f46378d = kVar;
    }

    public final void e(Context context) {
        com.google.d.b.an.B(context);
        this.f46375a = context;
    }

    public final void f(com.waze.uid.f fVar) {
        this.f46382h = fVar;
    }
}
