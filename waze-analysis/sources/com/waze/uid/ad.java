package com.waze.uid;

/* loaded from: classes7.dex */
public final class ad extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44110a;

    /* renamed from: b, reason: collision with root package name */
    int f44111b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f44112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f44112c = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44110a = obj;
        this.f44111b |= Integer.MIN_VALUE;
        return this.f44112c.emit(null, this);
    }
}
