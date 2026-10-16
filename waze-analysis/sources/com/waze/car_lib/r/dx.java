package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dx extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21460a;

    /* renamed from: b, reason: collision with root package name */
    Object f21461b;

    /* renamed from: c, reason: collision with root package name */
    boolean f21462c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f21463d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ eh f21464e;

    /* renamed from: f, reason: collision with root package name */
    int f21465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dx(eh ehVar, h.c.e eVar) {
        super(eVar);
        this.f21464e = ehVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21463d = obj;
        this.f21465f |= Integer.MIN_VALUE;
        return this.f21464e.m(null, null, false, this);
    }
}
