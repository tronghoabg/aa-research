package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class eo extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36450a;

    /* renamed from: b, reason: collision with root package name */
    int f36451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36452c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36450a = obj;
        this.f36451b |= Integer.MIN_VALUE;
        return this.f36452c.emit(null, this);
    }
}
