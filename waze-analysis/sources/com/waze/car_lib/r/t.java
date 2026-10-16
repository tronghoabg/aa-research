package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    int f21701a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f21703c;

    /* renamed from: d, reason: collision with root package name */
    int f21704d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.reports_v2.b.at f21705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, h.c.e eVar) {
        super(eVar);
        this.f21703c = uVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21702b = obj;
        this.f21704d |= Integer.MIN_VALUE;
        return u.f(this.f21703c, null, this);
    }
}
