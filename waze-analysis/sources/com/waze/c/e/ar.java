package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ar extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18544a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f18545b;

    /* renamed from: c, reason: collision with root package name */
    int f18546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f18545b = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18544a = obj;
        this.f18546c |= Integer.MIN_VALUE;
        return bc.f(this.f18545b, this);
    }
}
