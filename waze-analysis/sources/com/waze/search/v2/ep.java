package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class ep extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36453a;

    /* renamed from: b, reason: collision with root package name */
    int f36454b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36455c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36453a = obj;
        this.f36454b |= Integer.MIN_VALUE;
        return this.f36455c.emit(null, this);
    }
}
