package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18877a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ai f18878b;

    /* renamed from: c, reason: collision with root package name */
    int f18879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ai aiVar, h.c.e eVar) {
        super(eVar);
        this.f18878b = aiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18877a = obj;
        this.f18879c |= Integer.MIN_VALUE;
        return ai.e(this.f18878b, null, this);
    }
}
