package com.waze.t.b;

/* loaded from: classes5.dex */
public final class bx extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40762a;

    /* renamed from: b, reason: collision with root package name */
    int f40763b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f40764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(av avVar, h.c.e eVar) {
        super(eVar);
        this.f40764c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40762a = obj;
        this.f40763b |= Integer.MIN_VALUE;
        return this.f40764c.emit(null, this);
    }
}
