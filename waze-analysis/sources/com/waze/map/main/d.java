package com.waze.map.main;

import com.waze.map.eq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final eq f29419a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29420b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f29421c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f29422d;

    public d(eq eqVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eqVar, "primary");
        h.g.b.x.f(eVar, "logger");
        this.f29419a = eqVar;
        this.f29420b = eVar;
        this.f29421c = h.g.a(new c(this, 1));
        this.f29422d = h.g.a(new c(this, 0));
    }

    static final boolean c(d dVar) {
        boolean zIsWazeMapAsPrimaryEnabled = dVar.f29419a.isWazeMapAsPrimaryEnabled();
        dVar.f29420b.a("waze map on main map enabled for incar: " + zIsWazeMapAsPrimaryEnabled);
        return zIsWazeMapAsPrimaryEnabled;
    }

    static final boolean d(d dVar) {
        boolean zIsWazeMapAsPrimaryEnabled = dVar.f29419a.isWazeMapAsPrimaryEnabled();
        dVar.f29420b.a("waze map on main map enabled for mobile: " + zIsWazeMapAsPrimaryEnabled);
        return zIsWazeMapAsPrimaryEnabled;
    }

    @Override // com.waze.map.main.b
    public final boolean a() {
        return ((Boolean) this.f29422d.getValue()).booleanValue();
    }

    @Override // com.waze.map.main.b
    public final boolean b() {
        return ((Boolean) this.f29421c.getValue()).booleanValue();
    }
}
