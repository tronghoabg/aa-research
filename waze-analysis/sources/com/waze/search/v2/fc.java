package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class fc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36497a;

    /* renamed from: b, reason: collision with root package name */
    int f36498b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36499c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36497a = obj;
        this.f36498b |= Integer.MIN_VALUE;
        return this.f36499c.emit(null, this);
    }
}
