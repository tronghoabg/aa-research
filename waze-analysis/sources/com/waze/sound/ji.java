package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ji extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40305a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl f40306b;

    /* renamed from: c, reason: collision with root package name */
    int f40307c;

    /* renamed from: d, reason: collision with root package name */
    jl f40308d;

    /* renamed from: e, reason: collision with root package name */
    String f40309e;

    /* renamed from: f, reason: collision with root package name */
    Integer f40310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ji(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40306b = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40305a = obj;
        this.f40307c |= Integer.MIN_VALUE;
        return jl.o(this.f40306b, null, this);
    }
}
