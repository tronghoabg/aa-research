package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class er extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36459a;

    /* renamed from: b, reason: collision with root package name */
    int f36460b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36461c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36459a = obj;
        this.f36460b |= Integer.MIN_VALUE;
        return this.f36461c.emit(null, this);
    }
}
