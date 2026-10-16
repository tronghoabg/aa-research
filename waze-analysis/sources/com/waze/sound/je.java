package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class je extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40293a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40294b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ jl f40295c;

    /* renamed from: d, reason: collision with root package name */
    int f40296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    je(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40295c = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40294b = obj;
        this.f40296d |= Integer.MIN_VALUE;
        return this.f40295c.z(this);
    }
}
