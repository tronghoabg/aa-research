package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21688a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f21689b;

    /* renamed from: c, reason: collision with root package name */
    int f21690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(u uVar, h.c.e eVar) {
        super(eVar);
        this.f21689b = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21688a = obj;
        this.f21690c |= Integer.MIN_VALUE;
        return u.e(this.f21689b, null, null, this);
    }
}
