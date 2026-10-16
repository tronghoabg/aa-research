package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class fe extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36503a;

    /* renamed from: b, reason: collision with root package name */
    int f36504b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36505c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36503a = obj;
        this.f36504b |= Integer.MIN_VALUE;
        return this.f36505c.emit(null, this);
    }
}
