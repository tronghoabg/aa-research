package com.waze.nav_connect.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f30724a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f30725b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f30726c;

    /* renamed from: d, reason: collision with root package name */
    int f30727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f30726c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30725b = obj;
        this.f30727d |= Integer.MIN_VALUE;
        return this.f30726c.emit(null, this);
    }
}
