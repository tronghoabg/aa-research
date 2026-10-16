package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class ff extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36506a;

    /* renamed from: b, reason: collision with root package name */
    int f36507b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36508c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36506a = obj;
        this.f36507b |= Integer.MIN_VALUE;
        return this.f36508c.emit(null, this);
    }
}
