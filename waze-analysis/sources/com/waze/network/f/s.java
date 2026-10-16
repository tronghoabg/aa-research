package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32337a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f32338b;

    /* renamed from: c, reason: collision with root package name */
    int f32339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(w wVar, h.c.e eVar) {
        super(eVar);
        this.f32338b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32337a = obj;
        this.f32339c |= Integer.MIN_VALUE;
        return w.m(this.f32338b, null, null, this);
    }
}
