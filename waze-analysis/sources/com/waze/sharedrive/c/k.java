package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f38107b;

    /* renamed from: c, reason: collision with root package name */
    int f38108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(p pVar, h.c.e eVar) {
        super(eVar);
        this.f38107b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38106a = obj;
        this.f38108c |= Integer.MIN_VALUE;
        return this.f38107b.i(null, null, this);
    }
}
