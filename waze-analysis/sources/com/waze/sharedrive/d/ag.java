package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38182a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ah f38183b;

    /* renamed from: c, reason: collision with root package name */
    int f38184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f38183b = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38182a = obj;
        this.f38184c |= Integer.MIN_VALUE;
        return this.f38183b.emit(null, this);
    }
}
