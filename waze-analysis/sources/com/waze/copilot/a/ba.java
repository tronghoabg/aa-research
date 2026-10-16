package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ba extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22751a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f22752b;

    /* renamed from: c, reason: collision with root package name */
    int f22753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22752b = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22751a = obj;
        this.f22753c |= Integer.MIN_VALUE;
        return this.f22752b.l(null, null, this);
    }
}
