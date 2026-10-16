package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22851a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f22852b;

    /* renamed from: c, reason: collision with root package name */
    int f22853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(s sVar, h.c.e eVar) {
        super(eVar);
        this.f22852b = sVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22851a = obj;
        this.f22853c |= Integer.MIN_VALUE;
        return this.f22852b.b(this);
    }
}
