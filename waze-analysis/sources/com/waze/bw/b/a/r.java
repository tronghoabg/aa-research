package com.waze.bw.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17712a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f17713b;

    /* renamed from: c, reason: collision with root package name */
    int f17714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(t tVar, h.c.e eVar) {
        super(eVar);
        this.f17713b = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17712a = obj;
        this.f17714c |= Integer.MIN_VALUE;
        return this.f17713b.e(null, null, this);
    }
}
