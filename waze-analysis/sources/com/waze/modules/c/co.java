package com.waze.modules.c;

import i.b.l.pn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class co extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f29984a;

    /* renamed from: b, reason: collision with root package name */
    int f29985b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f29986c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cr f29987d;

    /* renamed from: e, reason: collision with root package name */
    int f29988e;

    /* renamed from: f, reason: collision with root package name */
    pn f29989f;

    /* renamed from: g, reason: collision with root package name */
    dd f29990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    co(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f29987d = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29986c = obj;
        this.f29988e |= Integer.MIN_VALUE;
        return this.f29987d.g(null, null, false, this);
    }
}
