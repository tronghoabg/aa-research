package com.google.firebase.sessions.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f10895a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f10896b;

    /* renamed from: c, reason: collision with root package name */
    int f10897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f10896b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10895a = obj;
        this.f10897c |= Integer.MIN_VALUE;
        return this.f10896b.c(this);
    }
}
