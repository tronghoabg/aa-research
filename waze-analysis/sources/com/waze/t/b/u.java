package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40815a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f40816b;

    /* renamed from: c, reason: collision with root package name */
    int f40817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f40816b = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40815a = obj;
        this.f40817c |= Integer.MIN_VALUE;
        return this.f40816b.J(this);
    }
}
