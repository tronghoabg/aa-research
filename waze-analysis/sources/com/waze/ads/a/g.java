package com.waze.ads.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13933a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13934b;

    /* renamed from: c, reason: collision with root package name */
    int f13935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f13934b = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13933a = obj;
        this.f13935c |= Integer.MIN_VALUE;
        return this.f13934b.a(this);
    }
}
