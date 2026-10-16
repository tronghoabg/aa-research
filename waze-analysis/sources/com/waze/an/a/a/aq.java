package com.waze.an.a.a;

/* loaded from: classes4.dex */
public final class aq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14386a;

    /* renamed from: b, reason: collision with root package name */
    int f14387b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f14388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(d dVar, h.c.e eVar) {
        super(eVar);
        this.f14388c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14386a = obj;
        this.f14387b |= Integer.MIN_VALUE;
        return this.f14388c.emit(null, this);
    }
}
