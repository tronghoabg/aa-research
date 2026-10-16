package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40311a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl f40312b;

    /* renamed from: c, reason: collision with root package name */
    int f40313c;

    /* renamed from: d, reason: collision with root package name */
    String f40314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jj(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40312b = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40311a = obj;
        this.f40313c |= Integer.MIN_VALUE;
        return jl.p(this.f40312b, null, this);
    }
}
