package com.waze.w;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45445a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f45446b;

    /* renamed from: c, reason: collision with root package name */
    int f45447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.e eVar) {
        super(eVar);
        this.f45446b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45445a = obj;
        this.f45447c |= Integer.MIN_VALUE;
        return this.f45446b.a(this);
    }
}
