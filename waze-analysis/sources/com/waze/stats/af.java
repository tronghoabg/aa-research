package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40501a;

    /* renamed from: b, reason: collision with root package name */
    Object f40502b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f40503c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ an f40504d;

    /* renamed from: e, reason: collision with root package name */
    int f40505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(an anVar, h.c.e eVar) {
        super(eVar);
        this.f40504d = anVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40503c = obj;
        this.f40505e |= Integer.MIN_VALUE;
        Object objN = this.f40504d.n(null, this);
        return objN == h.c.a.a.f48038a ? objN : h.m.d(objN);
    }
}
