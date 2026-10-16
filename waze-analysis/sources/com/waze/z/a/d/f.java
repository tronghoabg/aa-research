package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45957a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f45958b;

    /* renamed from: c, reason: collision with root package name */
    int f45959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f45958b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45957a = obj;
        this.f45959c |= Integer.MIN_VALUE;
        return this.f45958b.a(this);
    }
}
