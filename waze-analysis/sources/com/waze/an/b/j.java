package com.waze.an.b;

/* loaded from: classes4.dex */
public final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14638a;

    /* renamed from: b, reason: collision with root package name */
    int f14639b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f14640c;

    /* renamed from: d, reason: collision with root package name */
    Object f14641d;

    /* renamed from: e, reason: collision with root package name */
    f f14642e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.an.a.a.j f14643f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f14640c = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14638a = obj;
        this.f14639b |= Integer.MIN_VALUE;
        return this.f14640c.emit(null, this);
    }
}
