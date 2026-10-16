package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dz extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21469a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21470b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eh f21471c;

    /* renamed from: d, reason: collision with root package name */
    int f21472d;

    /* renamed from: e, reason: collision with root package name */
    String f21473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(eh ehVar, h.c.e eVar) {
        super(eVar);
        this.f21471c = ehVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21470b = obj;
        this.f21472d |= Integer.MIN_VALUE;
        return this.f21471c.o(null, this);
    }
}
