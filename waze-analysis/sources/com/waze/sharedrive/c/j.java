package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38103a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f38104b;

    /* renamed from: c, reason: collision with root package name */
    int f38105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(p pVar, h.c.e eVar) {
        super(eVar);
        this.f38104b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38103a = obj;
        this.f38105c |= Integer.MIN_VALUE;
        return this.f38104b.d(null, this);
    }
}
