package com.waze.c.e.a;

/* loaded from: classes5.dex */
public final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18441a;

    /* renamed from: b, reason: collision with root package name */
    int f18442b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f18443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f18443c = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18441a = obj;
        this.f18442b |= Integer.MIN_VALUE;
        return this.f18443c.emit(null, this);
    }
}
