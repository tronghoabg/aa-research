package com.waze.main_screen.q.b;

/* loaded from: classes6.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27397a;

    /* renamed from: b, reason: collision with root package name */
    int f27398b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f27399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f27399c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27397a = obj;
        this.f27398b |= Integer.MIN_VALUE;
        return this.f27399c.emit(null, this);
    }
}
