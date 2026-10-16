package com.waze;

/* loaded from: classes5.dex */
public final class eg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23642a;

    /* renamed from: b, reason: collision with root package name */
    int f23643b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f23644c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f23644c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23642a = obj;
        this.f23643b |= Integer.MIN_VALUE;
        return this.f23644c.emit(null, this);
    }
}
