package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.cf;
import com.waze.navigate.cg;
import com.waze.navigate.eo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final cg f26907a;

    /* renamed from: b, reason: collision with root package name */
    private final cf f26908b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ev.n f26909c;

    /* renamed from: d, reason: collision with root package name */
    private final eo f26910d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.p.a.a.a f26911e;

    public ak(cg cgVar, cf cfVar, com.waze.ev.n nVar, eo eoVar, com.waze.main_screen.p.a.a.a aVar) {
        h.g.b.x.f(cgVar, "etaNavResultDataProvider");
        h.g.b.x.f(cfVar, "etaCardDataProvider");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(eoVar, "navigationStatusProvider");
        h.g.b.x.f(aVar, "etaDrawerConfig");
        this.f26907a = cgVar;
        this.f26908b = cfVar;
        this.f26909c = nVar;
        this.f26910d = eoVar;
        this.f26911e = aVar;
    }

    public final am a() {
        return new az(this.f26907a, this.f26908b, this.f26909c, this.f26910d, this.f26911e);
    }
}
