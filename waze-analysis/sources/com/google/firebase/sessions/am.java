package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f10817a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f10818b;

    /* renamed from: c, reason: collision with root package name */
    int f10819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(an anVar, h.c.e eVar) {
        super(eVar);
        this.f10818b = anVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10817a = obj;
        this.f10819c |= Integer.MIN_VALUE;
        return an.e(this.f10818b, this);
    }
}
