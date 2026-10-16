package com.waze;

/* loaded from: classes5.dex */
public final class nk extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32523a;

    /* renamed from: b, reason: collision with root package name */
    int f32524b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f32525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f32525c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32523a = obj;
        this.f32524b |= Integer.MIN_VALUE;
        return this.f32525c.emit(null, this);
    }
}
