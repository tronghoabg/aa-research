package com.waze.parking;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f32995b;

    /* renamed from: c, reason: collision with root package name */
    int f32996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(y yVar, h.c.e eVar) {
        super(eVar);
        this.f32995b = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32994a = obj;
        this.f32996c |= Integer.MIN_VALUE;
        return this.f32995b.e(this);
    }
}
