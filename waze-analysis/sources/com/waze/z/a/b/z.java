package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45794a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f45795b;

    /* renamed from: c, reason: collision with root package name */
    int f45796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f45795b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45794a = obj;
        this.f45796c |= Integer.MIN_VALUE;
        return this.f45795b.m(this);
    }
}
