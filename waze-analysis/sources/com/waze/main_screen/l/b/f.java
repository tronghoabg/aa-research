package com.waze.main_screen.l.b;

import com.waze.navigate.cr;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.l.a.e f26613a;

    /* renamed from: b, reason: collision with root package name */
    private final cr f26614b;

    /* renamed from: c, reason: collision with root package name */
    private final d f26615c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.navigate.b.g f26616d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26617e;

    public f(com.waze.main_screen.l.a.e eVar, cr crVar, d dVar, com.waze.navigate.b.g gVar, com.waze.shared_infra.i.e eVar2) {
        x.f(eVar, "navigationInstructionsListDataAPI");
        x.f(crVar, "instructionState");
        x.f(dVar, "config");
        x.f(gVar, "statsSender");
        x.f(eVar2, "logger");
        this.f26613a = eVar;
        this.f26614b = crVar;
        this.f26615c = dVar;
        this.f26616d = gVar;
        this.f26617e = eVar2;
    }

    @Override // com.waze.main_screen.l.b.e
    public final j a(g gVar, h hVar) {
        x.f(gVar, "navigationInstructionItemClicked");
        x.f(hVar, "rtRouteEventClicked");
        return new r(this.f26617e, this.f26613a, this.f26614b, this.f26615c, this.f26616d, gVar, hVar);
    }
}
