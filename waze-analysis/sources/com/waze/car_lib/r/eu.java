package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class eu extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey f21581b;

    /* renamed from: c, reason: collision with root package name */
    int f21582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(ey eyVar, h.c.e eVar) {
        super(eVar);
        this.f21581b = eyVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21580a = obj;
        this.f21582c |= Integer.MIN_VALUE;
        return this.f21581b.e(this);
    }
}
