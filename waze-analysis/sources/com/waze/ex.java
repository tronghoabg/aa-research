package com.waze;

/* loaded from: classes5.dex */
public final class ex extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23734a;

    /* renamed from: b, reason: collision with root package name */
    int f23735b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f23736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f23736c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23734a = obj;
        this.f23735b |= Integer.MIN_VALUE;
        return this.f23736c.emit(null, this);
    }
}
