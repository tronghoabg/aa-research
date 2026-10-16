package com.waze.modules.c;

import i.b.l.pn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cm extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29975a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cr f29976b;

    /* renamed from: c, reason: collision with root package name */
    int f29977c;

    /* renamed from: d, reason: collision with root package name */
    pn f29978d;

    /* renamed from: e, reason: collision with root package name */
    ce f29979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cm(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f29976b = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29975a = obj;
        this.f29977c |= Integer.MIN_VALUE;
        return this.f29976b.f(null, null, this);
    }
}
