package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21684a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f21685b;

    /* renamed from: c, reason: collision with root package name */
    int f21686c;

    /* renamed from: d, reason: collision with root package name */
    String f21687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(u uVar, h.c.e eVar) {
        super(eVar);
        this.f21685b = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21684a = obj;
        this.f21686c |= Integer.MIN_VALUE;
        return this.f21685b.m(null, null, this);
    }
}
