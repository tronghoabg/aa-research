package com.waze.sound.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39631a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f39632b;

    /* renamed from: c, reason: collision with root package name */
    int f39633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(r rVar, h.c.e eVar) {
        super(eVar);
        this.f39632b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39631a = obj;
        this.f39633c |= Integer.MIN_VALUE;
        Object objA = this.f39632b.a(null, null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
