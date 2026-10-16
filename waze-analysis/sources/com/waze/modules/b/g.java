package com.waze.modules.b;

import e.a.cq;
import e.a.k;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends e.a.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f29823a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a.e f29824b;

    g(h hVar, e.a.e eVar) {
        this.f29823a = hVar;
        this.f29824b = eVar;
    }

    @Override // e.a.i
    public final k a(cq cqVar, e.a.h hVar) {
        x.f(hVar, "callOptions");
        k kVarA = this.f29823a.f29825a.a(cqVar, hVar.b(this.f29824b));
        x.e(kVarA, "newCall(...)");
        return kVarA;
    }

    @Override // e.a.i
    public final String b() {
        String strB = this.f29823a.f29825a.b();
        x.e(strB, "authority(...)");
        return strB;
    }
}
