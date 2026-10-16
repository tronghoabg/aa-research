package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ew extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21587a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey f21588b;

    /* renamed from: c, reason: collision with root package name */
    int f21589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ew(ey eyVar, h.c.e eVar) {
        super(eVar);
        this.f21588b = eyVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21587a = obj;
        this.f21589c |= Integer.MIN_VALUE;
        return this.f21588b.u(null, this);
    }
}
