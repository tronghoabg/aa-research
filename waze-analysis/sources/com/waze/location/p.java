package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25414a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f25415b;

    /* renamed from: c, reason: collision with root package name */
    int f25416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, h.c.e eVar) {
        super(eVar);
        this.f25415b = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25414a = obj;
        this.f25416c |= Integer.MIN_VALUE;
        return this.f25415b.d(null, this);
    }
}
