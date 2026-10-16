package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class cf extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36235a;

    /* renamed from: b, reason: collision with root package name */
    int f36236b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36237c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36235a = obj;
        this.f36236b |= Integer.MIN_VALUE;
        return this.f36237c.emit(null, this);
    }
}
