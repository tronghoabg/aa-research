package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class nj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ nl f32521b;

    /* renamed from: c, reason: collision with root package name */
    int f32522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nj(nl nlVar, h.c.e eVar) {
        super(eVar);
        this.f32521b = nlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32520a = obj;
        this.f32522c |= Integer.MIN_VALUE;
        return nl.f(this.f32521b, this);
    }
}
