package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class eq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36456a;

    /* renamed from: b, reason: collision with root package name */
    int f36457b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36458c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36456a = obj;
        this.f36457b |= Integer.MIN_VALUE;
        return this.f36458c.emit(null, this);
    }
}
