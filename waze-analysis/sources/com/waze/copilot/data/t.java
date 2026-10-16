package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f23061a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f23062b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f23063c;

    /* renamed from: d, reason: collision with root package name */
    int f23064d;

    /* renamed from: e, reason: collision with root package name */
    String f23065e;

    /* renamed from: f, reason: collision with root package name */
    String f23066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(w wVar, h.c.e eVar) {
        super(eVar);
        this.f23063c = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23062b = obj;
        this.f23064d |= Integer.MIN_VALUE;
        Object objJ = this.f23063c.j(null, null, null, null, this);
        return objJ == h.c.a.a.f48038a ? objJ : h.m.d(objJ);
    }
}
