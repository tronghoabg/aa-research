package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f10979a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f10980b;

    /* renamed from: c, reason: collision with root package name */
    int f10981c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f10982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(q qVar, h.c.e eVar) {
        super(eVar);
        this.f10982d = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10980b = obj;
        this.f10981c |= Integer.MIN_VALUE;
        return this.f10982d.c(null, this);
    }
}
