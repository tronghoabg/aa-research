package com.waze.car_lib.screens.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21844a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f21845b;

    /* renamed from: c, reason: collision with root package name */
    int f21846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(o oVar, h.c.e eVar) {
        super(eVar);
        this.f21845b = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21844a = obj;
        this.f21846c |= Integer.MIN_VALUE;
        return o.e(this.f21845b, this);
    }
}
