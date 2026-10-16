package com.waze.w;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45442a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f45443b;

    /* renamed from: c, reason: collision with root package name */
    int f45444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f45443b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45442a = obj;
        this.f45444c |= Integer.MIN_VALUE;
        return this.f45443b.a(this);
    }
}
