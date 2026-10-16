package com.waze.am;

/* loaded from: classes5.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14311a;

    /* renamed from: b, reason: collision with root package name */
    int f14312b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f14313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f14313c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14311a = obj;
        this.f14312b |= Integer.MIN_VALUE;
        return this.f14313c.emit(null, this);
    }
}
