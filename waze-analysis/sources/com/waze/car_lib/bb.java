package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19160a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f19161b;

    /* renamed from: c, reason: collision with root package name */
    int f19162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bd bdVar, h.c.e eVar) {
        super(eVar);
        this.f19161b = bdVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19160a = obj;
        this.f19162c |= Integer.MIN_VALUE;
        return bd.j(this.f19161b, this);
    }
}
