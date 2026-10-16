package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40278a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl f40279b;

    /* renamed from: c, reason: collision with root package name */
    int f40280c;

    /* renamed from: d, reason: collision with root package name */
    jl f40281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jb(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40279b = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40278a = obj;
        this.f40280c |= Integer.MIN_VALUE;
        return jl.m(this.f40279b, this);
    }
}
