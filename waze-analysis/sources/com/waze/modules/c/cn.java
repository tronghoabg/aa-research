package com.waze.modules.c;

import i.b.l.pn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cn extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29980a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cr f29981b;

    /* renamed from: c, reason: collision with root package name */
    int f29982c;

    /* renamed from: d, reason: collision with root package name */
    pn f29983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cn(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f29981b = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29980a = obj;
        this.f29982c |= Integer.MIN_VALUE;
        return this.f29981b.i(null, null, this);
    }
}
