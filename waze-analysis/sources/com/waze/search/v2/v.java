package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36635a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f36636b;

    /* renamed from: c, reason: collision with root package name */
    int f36637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(eVar);
        this.f36636b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36635a = obj;
        this.f36637c |= Integer.MIN_VALUE;
        return this.f36636b.emit(null, this);
    }
}
