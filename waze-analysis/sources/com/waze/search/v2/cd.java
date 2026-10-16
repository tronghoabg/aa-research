package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class cd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36229a;

    /* renamed from: b, reason: collision with root package name */
    int f36230b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36231c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36229a = obj;
        this.f36230b |= Integer.MIN_VALUE;
        return this.f36231c.emit(null, this);
    }
}
