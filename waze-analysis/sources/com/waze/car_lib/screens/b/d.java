package com.waze.car_lib.screens.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21831a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f21832b;

    /* renamed from: c, reason: collision with root package name */
    int f21833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(j jVar, h.c.e eVar) {
        super(eVar);
        this.f21832b = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21831a = obj;
        this.f21833c |= Integer.MIN_VALUE;
        return j.e(this.f21832b, this);
    }
}
