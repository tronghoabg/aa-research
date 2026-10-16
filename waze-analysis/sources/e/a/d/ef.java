package e.a.d;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ef implements gd {

    /* renamed from: a, reason: collision with root package name */
    final as f46862a;

    /* renamed from: b, reason: collision with root package name */
    boolean f46863b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eh f46864c;

    ef(eh ehVar, as asVar) {
        Objects.requireNonNull(ehVar);
        this.f46864c = ehVar;
        this.f46863b = false;
        this.f46862a = asVar;
    }

    static /* bridge */ /* synthetic */ String e(e.a.ds dsVar) {
        int iOrdinal;
        if (dsVar == null || (iOrdinal = dsVar.ordinal()) == 0) {
            return "none";
        }
        if (iOrdinal == 1) {
            return "integrity_only";
        }
        if (iOrdinal == 2) {
            return "privacy_and_integrity";
        }
        throw new IllegalArgumentException("Unknown SecurityLevel: ".concat(dsVar.toString()));
    }

    static /* bridge */ /* synthetic */ String f(e.a.c cVar, e.a.b bVar) {
        String str = (String) cVar.c(bVar);
        return str == null ? "" : str;
    }

    static /* bridge */ /* synthetic */ String g(e.a.c cVar) {
        String str = (String) cVar.c(e.a.ax.f46297b);
        if (str == null) {
            str = (String) cVar.c(e.a.dd.f47324a);
        }
        return str == null ? "" : str;
    }

    @Override // e.a.d.gd
    public final void a(boolean z) {
        eh ehVar = this.f46864c;
        ehVar.f46877l.execute(new dw(ehVar, this.f46862a, z));
    }

    @Override // e.a.d.gd
    public final void b() {
        eh ehVar = this.f46864c;
        ehVar.f46874i.a(2, "READY");
        ehVar.f46877l.execute(new ec(this));
    }

    @Override // e.a.d.gd
    public final void c(e.a.ee eeVar, cf cfVar) {
        eh ehVar = this.f46864c;
        ehVar.f46874i.b(2, "{0} SHUTDOWN with {1}", this.f46862a.c(), eh.N(eeVar));
        this.f46863b = true;
        ehVar.f46877l.execute(new ed(this, cfVar, eeVar));
    }

    @Override // e.a.d.gd
    public final void d() {
        com.google.d.b.an.v(this.f46863b, "transportShutdown() must be called before transportTerminated().");
        eh ehVar = this.f46864c;
        e.a.j jVar = ehVar.f46874i;
        as asVar = this.f46862a;
        jVar.b(2, "{0} Terminated", asVar.c());
        ehVar.f46871f.f(asVar);
        ehVar.f46877l.execute(new dw(ehVar, asVar, false));
        Iterator it = ehVar.f46876k.iterator();
        if (!it.hasNext()) {
            ehVar.f46877l.execute(new ee(this));
        } else {
            asVar.v();
            throw null;
        }
    }

    @Override // e.a.d.gd
    public final void h() {
        Iterator it = this.f46864c.f46876k.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
