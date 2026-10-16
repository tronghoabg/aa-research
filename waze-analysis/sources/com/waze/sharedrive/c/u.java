package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38137a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f38138b;

    /* renamed from: c, reason: collision with root package name */
    int f38139c;

    /* renamed from: d, reason: collision with root package name */
    y f38140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(y yVar, h.c.e eVar) {
        super(eVar);
        this.f38138b = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38137a = obj;
        this.f38139c |= Integer.MIN_VALUE;
        return y.f(this.f38138b, null, null, null, null, null, null, this);
    }
}
