package com.waze.trip_overview.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f41273a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f41274b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f41275c;

    /* renamed from: d, reason: collision with root package name */
    int f41276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, h.c.e eVar) {
        super(eVar);
        this.f41275c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f41274b = obj;
        this.f41276d |= Integer.MIN_VALUE;
        return this.f41275c.e(null, this);
    }
}
