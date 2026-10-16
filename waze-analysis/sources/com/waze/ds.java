package com.waze;

/* loaded from: classes5.dex */
public final class ds extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23581a;

    /* renamed from: b, reason: collision with root package name */
    int f23582b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f23583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f23583c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23581a = obj;
        this.f23582b |= Integer.MIN_VALUE;
        return this.f23583c.emit(null, this);
    }
}
