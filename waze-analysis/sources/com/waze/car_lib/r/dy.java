package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dy extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21466a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eh f21467b;

    /* renamed from: c, reason: collision with root package name */
    int f21468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dy(eh ehVar, h.c.e eVar) {
        super(eVar);
        this.f21467b = ehVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21466a = obj;
        this.f21468c |= Integer.MIN_VALUE;
        return this.f21467b.n(this);
    }
}
