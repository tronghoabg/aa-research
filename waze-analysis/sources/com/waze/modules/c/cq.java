package com.waze.modules.c;

import i.b.l.pn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29995a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cr f29996b;

    /* renamed from: c, reason: collision with root package name */
    int f29997c;

    /* renamed from: d, reason: collision with root package name */
    pn f29998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cq(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f29996b = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29995a = obj;
        this.f29997c |= Integer.MIN_VALUE;
        return this.f29996b.a(null, this);
    }
}
