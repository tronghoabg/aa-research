package com.waze.car_lib.r.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20882a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f20883b;

    /* renamed from: c, reason: collision with root package name */
    int f20884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(p pVar, h.c.e eVar) {
        super(eVar);
        this.f20883b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20882a = obj;
        this.f20884c |= Integer.MIN_VALUE;
        return p.d(this.f20883b, this);
    }
}
