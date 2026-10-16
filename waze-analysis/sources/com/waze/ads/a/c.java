package com.waze.ads.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13907a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f13908b;

    /* renamed from: c, reason: collision with root package name */
    int f13909c;

    /* renamed from: d, reason: collision with root package name */
    f f13910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f13908b = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13907a = obj;
        this.f13909c |= Integer.MIN_VALUE;
        return this.f13908b.c(null, this);
    }
}
