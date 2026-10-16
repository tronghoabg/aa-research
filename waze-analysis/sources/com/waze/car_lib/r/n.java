package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21681a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f21682b;

    /* renamed from: c, reason: collision with root package name */
    int f21683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(u uVar, h.c.e eVar) {
        super(eVar);
        this.f21682b = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21681a = obj;
        this.f21683c |= Integer.MIN_VALUE;
        return u.c(this.f21682b, null, this);
    }
}
