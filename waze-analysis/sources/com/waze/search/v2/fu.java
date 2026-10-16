package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fu extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36555a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fx f36556b;

    /* renamed from: c, reason: collision with root package name */
    int f36557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fu(fx fxVar, h.c.e eVar) {
        super(eVar);
        this.f36556b = fxVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36555a = obj;
        this.f36557c |= Integer.MIN_VALUE;
        return this.f36556b.c(null, this);
    }
}
