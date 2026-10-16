package com.waze.trip_overview.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41254a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f41255b;

    /* renamed from: c, reason: collision with root package name */
    int f41256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, h.c.e eVar) {
        super(eVar);
        this.f41255b = sVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f41254a = obj;
        this.f41256c |= Integer.MIN_VALUE;
        return this.f41255b.emit(null, this);
    }
}
