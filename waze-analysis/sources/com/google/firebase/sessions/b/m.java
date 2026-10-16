package com.google.firebase.sessions.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f10905a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f10906b;

    /* renamed from: c, reason: collision with root package name */
    int f10907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar, h.c.e eVar) {
        super(eVar);
        this.f10906b = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10905a = obj;
        this.f10907c |= Integer.MIN_VALUE;
        return this.f10906b.m(null, null, this);
    }
}
