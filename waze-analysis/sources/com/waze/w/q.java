package com.waze.w;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45455a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f45456b;

    /* renamed from: c, reason: collision with root package name */
    int f45457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, h.c.e eVar) {
        super(eVar);
        this.f45456b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45455a = obj;
        this.f45457c |= Integer.MIN_VALUE;
        return this.f45456b.a(this);
    }
}
