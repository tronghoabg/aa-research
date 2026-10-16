package com.waze.car_lib.r.c.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f21155b;

    /* renamed from: c, reason: collision with root package name */
    int f21156c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.shared_infra.h.c f21157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(i iVar, h.c.e eVar) {
        super(eVar);
        this.f21155b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21154a = obj;
        this.f21156c |= Integer.MIN_VALUE;
        return i.d(this.f21155b, null, this);
    }
}
