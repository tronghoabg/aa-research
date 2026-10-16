package com.waze.bd.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16206a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f16207b;

    /* renamed from: c, reason: collision with root package name */
    int f16208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f16207b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16206a = obj;
        this.f16208c |= Integer.MIN_VALUE;
        return this.f16207b.a(null, null, false, false, this);
    }
}
