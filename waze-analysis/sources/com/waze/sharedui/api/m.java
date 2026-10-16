package com.waze.sharedui.api;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.sharedui.f.d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.h.i f38808a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f38809b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.waze.sharedui.profile.b bVar, com.waze.sharedui.h.a aVar, com.waze.sharedui.h.i iVar, h.g.a.l lVar, boolean z, com.waze.sharedui.f.g gVar) {
        super(bVar, com.waze.sharedui.f.q.f38923b, null, aVar, gVar, null, 76);
        x.f(bVar, "elementAdapter");
        x.f(aVar, "statApiEnum");
        x.f(iVar, "useCase");
        x.f(gVar, "messagePriority");
        this.f38808a = iVar;
        this.f38809b = lVar;
        this.f38810c = z;
    }

    public final com.waze.sharedui.h.i a() {
        return this.f38808a;
    }

    public final h.g.a.l b() {
        return this.f38809b;
    }

    public final boolean c() {
        return this.f38810c;
    }
}
