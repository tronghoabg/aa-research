package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class es extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21576a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey f21577b;

    /* renamed from: c, reason: collision with root package name */
    int f21578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    es(ey eyVar, h.c.e eVar) {
        super(eVar);
        this.f21577b = eyVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21576a = obj;
        this.f21578c |= Integer.MIN_VALUE;
        return this.f21577b.d(this);
    }
}
