package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class ce extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36232a;

    /* renamed from: b, reason: collision with root package name */
    int f36233b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36234c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36232a = obj;
        this.f36233b |= Integer.MIN_VALUE;
        return this.f36234c.emit(null, this);
    }
}
