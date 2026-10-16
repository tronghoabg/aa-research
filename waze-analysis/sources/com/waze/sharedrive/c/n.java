package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38117a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f38118b;

    /* renamed from: c, reason: collision with root package name */
    int f38119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(p pVar, h.c.e eVar) {
        super(eVar);
        this.f38118b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38117a = obj;
        this.f38119c |= Integer.MIN_VALUE;
        return this.f38118b.f(null, null, this);
    }
}
