package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40301a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl f40302b;

    /* renamed from: c, reason: collision with root package name */
    int f40303c;

    /* renamed from: d, reason: collision with root package name */
    String f40304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jh(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40302b = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40301a = obj;
        this.f40303c |= Integer.MIN_VALUE;
        return jl.n(this.f40302b, null, this);
    }
}
