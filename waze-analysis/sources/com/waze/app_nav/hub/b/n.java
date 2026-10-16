package com.waze.app_nav.hub.b;

/* loaded from: classes5.dex */
public final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15280a;

    /* renamed from: b, reason: collision with root package name */
    int f15281b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f15282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, h.c.e eVar) {
        super(eVar);
        this.f15282c = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15280a = obj;
        this.f15281b |= Integer.MIN_VALUE;
        return this.f15282c.emit(null, this);
    }
}
