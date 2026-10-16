package com.waze.car_lib.r.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20871a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f20872b;

    /* renamed from: c, reason: collision with root package name */
    int f20873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f20872b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20871a = obj;
        this.f20873c |= Integer.MIN_VALUE;
        return this.f20872b.a(this);
    }
}
