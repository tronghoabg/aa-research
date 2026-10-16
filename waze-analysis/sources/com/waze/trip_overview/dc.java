package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41325a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f41326b;

    /* renamed from: c, reason: collision with root package name */
    int f41327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dc(de deVar, h.c.e eVar) {
        super(eVar);
        this.f41326b = deVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f41325a = obj;
        this.f41327c |= Integer.MIN_VALUE;
        return this.f41326b.l(0, this);
    }
}
