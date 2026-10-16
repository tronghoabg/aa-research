package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class ey extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36479a;

    /* renamed from: b, reason: collision with root package name */
    int f36480b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36481c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36479a = obj;
        this.f36480b |= Integer.MIN_VALUE;
        return this.f36481c.emit(null, this);
    }
}
