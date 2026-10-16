package com.waze.trip_overview.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f41277a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f41278b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f41279c;

    /* renamed from: d, reason: collision with root package name */
    int f41280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f41279c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f41278b = obj;
        this.f41280d |= Integer.MIN_VALUE;
        return this.f41279c.g(null, this);
    }
}
