package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32464a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f32465b;

    /* renamed from: c, reason: collision with root package name */
    int f32466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, h.c.e eVar) {
        super(eVar);
        this.f32465b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32464a = obj;
        this.f32466c |= Integer.MIN_VALUE;
        return this.f32465b.f(null, this);
    }
}
