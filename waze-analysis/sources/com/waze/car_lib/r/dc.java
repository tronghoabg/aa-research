package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21358a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f21359b;

    /* renamed from: c, reason: collision with root package name */
    int f21360c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dc(de deVar, h.c.e eVar) {
        super(eVar);
        this.f21359b = deVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21358a = obj;
        this.f21360c |= Integer.MIN_VALUE;
        return de.h(this.f21359b, null, this);
    }
}
