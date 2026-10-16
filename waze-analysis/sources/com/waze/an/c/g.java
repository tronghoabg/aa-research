package com.waze.an.c;

/* loaded from: classes4.dex */
public final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14772a;

    /* renamed from: b, reason: collision with root package name */
    int f14773b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f14774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, h.c.e eVar) {
        super(eVar);
        this.f14774c = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14772a = obj;
        this.f14773b |= Integer.MIN_VALUE;
        return this.f14774c.emit(null, this);
    }
}
