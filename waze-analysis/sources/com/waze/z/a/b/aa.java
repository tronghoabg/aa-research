package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45716a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f45717b;

    /* renamed from: c, reason: collision with root package name */
    int f45718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f45717b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45716a = obj;
        this.f45718c |= Integer.MIN_VALUE;
        return this.f45717b.o(this);
    }
}
