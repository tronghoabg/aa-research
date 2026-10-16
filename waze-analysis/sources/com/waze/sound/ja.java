package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ja extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40272a;

    /* renamed from: b, reason: collision with root package name */
    Object f40273b;

    /* renamed from: c, reason: collision with root package name */
    Object f40274c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f40275d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ jl f40276e;

    /* renamed from: f, reason: collision with root package name */
    int f40277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ja(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40276e = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40275d = obj;
        this.f40277f |= Integer.MIN_VALUE;
        return jl.v(this.f40276e, null, null, this);
    }
}
