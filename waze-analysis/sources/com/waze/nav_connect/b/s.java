package com.waze.nav_connect.b;

/* loaded from: classes6.dex */
public final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30824a;

    /* renamed from: b, reason: collision with root package name */
    int f30825b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f30826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, h.c.e eVar) {
        super(eVar);
        this.f30826c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30824a = obj;
        this.f30825b |= Integer.MIN_VALUE;
        return this.f30826c.emit(null, this);
    }
}
