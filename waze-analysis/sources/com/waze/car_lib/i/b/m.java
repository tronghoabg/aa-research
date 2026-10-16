package com.waze.car_lib.i.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f20008b;

    /* renamed from: c, reason: collision with root package name */
    int f20009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.e eVar) {
        super(eVar);
        this.f20008b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20007a = obj;
        this.f20009c |= Integer.MIN_VALUE;
        return this.f20008b.b(this);
    }
}
