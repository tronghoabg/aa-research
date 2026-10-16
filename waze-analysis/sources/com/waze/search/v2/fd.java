package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class fd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36500a;

    /* renamed from: b, reason: collision with root package name */
    int f36501b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36502c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36500a = obj;
        this.f36501b |= Integer.MIN_VALUE;
        return this.f36502c.emit(null, this);
    }
}
