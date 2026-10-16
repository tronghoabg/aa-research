package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19163a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f19164b;

    /* renamed from: c, reason: collision with root package name */
    int f19165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(bd bdVar, h.c.e eVar) {
        super(eVar);
        this.f19164b = bdVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19163a = obj;
        this.f19165c |= Integer.MIN_VALUE;
        return bd.k(this.f19164b, this);
    }
}
