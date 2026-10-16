package com.waze.places;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33121a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f33122b;

    /* renamed from: c, reason: collision with root package name */
    int f33123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, h.c.e eVar) {
        super(eVar);
        this.f33122b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33121a = obj;
        this.f33123c |= Integer.MIN_VALUE;
        return this.f33122b.c(0L, this);
    }
}
