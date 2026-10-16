package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ev extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21583a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21584b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ey f21585c;

    /* renamed from: d, reason: collision with root package name */
    int f21586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ev(ey eyVar, h.c.e eVar) {
        super(eVar);
        this.f21585c = eyVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21584b = obj;
        this.f21586d |= Integer.MIN_VALUE;
        return this.f21585c.t(null, this);
    }
}
