package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.dg;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final dg f27094a;

    /* renamed from: b, reason: collision with root package name */
    private final b f27095b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.navigate.b.g f27096c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27097d;

    public d(dg dgVar, b bVar, com.waze.navigate.b.g gVar, com.waze.shared_infra.i.e eVar) {
        x.f(dgVar, "navInfoProvider");
        x.f(bVar, "config");
        x.f(gVar, "statSender");
        x.f(eVar, "logger");
        this.f27094a = dgVar;
        this.f27095b = bVar;
        this.f27096c = gVar;
        this.f27097d = eVar;
    }

    @Override // com.waze.main_screen.p.b.a.b.c
    public final t a(a aVar) {
        x.f(aVar, "barClickedListener");
        return new t(this.f27094a, this.f27095b, this.f27096c, aVar, this.f27097d);
    }
}
