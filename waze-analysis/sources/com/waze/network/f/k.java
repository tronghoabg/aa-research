package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32313a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f32314b;

    /* renamed from: c, reason: collision with root package name */
    int f32315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f32314b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32313a = obj;
        this.f32315c |= Integer.MIN_VALUE;
        return this.f32314b.f(this);
    }
}
