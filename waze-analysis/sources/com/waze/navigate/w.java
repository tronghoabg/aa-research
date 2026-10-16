package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f31826b;

    /* renamed from: c, reason: collision with root package name */
    int f31827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(af afVar, h.c.e eVar) {
        super(eVar);
        this.f31826b = afVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31825a = obj;
        this.f31827c |= Integer.MIN_VALUE;
        return this.f31826b.n(null, this);
    }
}
