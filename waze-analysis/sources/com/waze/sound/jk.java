package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jk extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40315a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl f40316b;

    /* renamed from: c, reason: collision with root package name */
    int f40317c;

    /* renamed from: d, reason: collision with root package name */
    jl f40318d;

    /* renamed from: e, reason: collision with root package name */
    String f40319e;

    /* renamed from: f, reason: collision with root package name */
    String f40320f;

    /* renamed from: g, reason: collision with root package name */
    String f40321g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jk(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40316b = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40315a = obj;
        this.f40317c |= Integer.MIN_VALUE;
        return jl.q(this.f40316b, null, null, null, this);
    }
}
