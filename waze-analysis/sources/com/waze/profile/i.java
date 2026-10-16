package com.waze.profile;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f33395b;

    /* renamed from: c, reason: collision with root package name */
    int f33396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, h.c.e eVar) {
        super(eVar);
        this.f33395b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33394a = obj;
        this.f33396c |= Integer.MIN_VALUE;
        return this.f33395b.b(this);
    }
}
