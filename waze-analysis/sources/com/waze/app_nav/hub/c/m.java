package com.waze.app_nav.hub.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15315a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15316b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f15317c;

    /* renamed from: d, reason: collision with root package name */
    int f15318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p pVar, h.c.e eVar) {
        super(eVar);
        this.f15317c = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15316b = obj;
        this.f15318d |= Integer.MIN_VALUE;
        return this.f15317c.f(null, this);
    }
}
