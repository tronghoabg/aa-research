package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.c.a.b f18668a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.stats.ax f18669b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.e.g f18670c;

    public i(com.waze.c.a.b bVar, com.waze.stats.ax axVar, com.waze.sharedui.e.g gVar) {
        h.g.b.x.f(bVar, "alternateRoutesConfig");
        h.g.b.x.f(axVar, "wazeStatsReporter");
        h.g.b.x.f(gVar, "wazeLocationService");
        this.f18668a = bVar;
        this.f18669b = axVar;
        this.f18670c = gVar;
    }

    public final k a(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onDone");
        com.waze.c.a.b bVar = this.f18668a;
        long jC = bVar.c();
        long jD = bVar.d();
        boolean zM = bVar.m();
        if (!bVar.j() && jD < jC && !zM) {
            com.waze.sharedui.e.c cVarA = this.f18670c.a();
            if ((cVarA != null ? Integer.valueOf(cVarA.e()) : null) == null || r1.intValue() <= bVar.b()) {
                return new k(bVar, this.f18669b, aVar);
            }
        }
        return null;
    }

    public final void b() {
        this.f18668a.f();
    }
}
