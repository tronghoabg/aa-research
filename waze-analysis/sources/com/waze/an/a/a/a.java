package com.waze.an.a.a;

/* loaded from: classes4.dex */
public final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14324a;

    /* renamed from: b, reason: collision with root package name */
    int f14325b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f14326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, h.c.e eVar) {
        super(eVar);
        this.f14326c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14324a = obj;
        this.f14325b |= Integer.MIN_VALUE;
        return this.f14326c.emit(null, this);
    }
}
