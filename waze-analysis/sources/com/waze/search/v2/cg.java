package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class cg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36238a;

    /* renamed from: b, reason: collision with root package name */
    int f36239b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36240c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36238a = obj;
        this.f36239b |= Integer.MIN_VALUE;
        return this.f36240c.emit(null, this);
    }
}
